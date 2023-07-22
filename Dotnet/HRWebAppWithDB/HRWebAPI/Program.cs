using BLL;
using BOL;
using DAL.Connected;
using Microsoft.AspNetCore.Builder;
using HRWebAPI;

var builder = WebApplication.CreateBuilder(args);

// Add services to the container.
builder.Services.AddCors();
builder.Services.AddControllers();

builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();

var app = builder.Build();

app.UseHttpsRedirection();
app.UseCors(builder =>
{
    builder.AllowAnyOrigin()
            .AllowAnyMethod()
            .AllowAnyHeader();
});


if (app.Environment.IsDevelopment())
{
    app.UseSwagger();
    app.UseSwaggerUI();
}
// Configure the HTTP request pipeline.
app.MapGet("/employees", () => {
    HRManager mgr = new HRManager();
    List<Employee> employees = mgr.getAllEmployees();
    if(employees.Count > 0)
        return Results.Ok(employees);
    return Results.NoContent();
});

app.MapGet("/employees/{id}",(int id) =>
{
    HRManager mgr = new HRManager();
    Employee employee = mgr.getEmployeeById(id);
    if(employee != null)
        return Results.Ok(employee);
    return Results.NoContent();
});

app.MapPost("/employees", (Employee emp) =>
{
    bool empCreated = HRDbManager.Insert(emp);
    if (empCreated)
    {
        return Results.Created("Employee created. ID: ",emp.Id);
    }
    else
    {
        return Results.BadRequest();
    }
}   
    );

app.MapPut("/employees/{id}", (int id, Employee emp) =>
{
    Employee existingEmp = new HRManager().getEmployeeById(id); 
    if (existingEmp is null) {
        
        return Results.NotFound();
    }
    emp.Id = id;
    HRDbManager.Update(emp);
    
    return Results.NoContent();
});

app.MapDelete("/employees/{id}", (int id) =>
{
    Employee existingEmp = new HRManager().getEmployeeById(id);
    if(existingEmp is null)
    {
        return Results.NotFound($"Invalid id: '{id}'");
    }
    HRDbManager.Delete(id); 
    return Results.NoContent();
});



app.UseAuthorization();
app.MapControllers();
app.Run();
