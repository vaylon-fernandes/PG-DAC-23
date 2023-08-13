using Microsoft.AspNetCore.Mvc;
using newapi.Data.Entities;
using newapi.Data;
using Microsoft.EntityFrameworkCore;

namespace newapi.Controllers;

[ApiController]
[Route("[controller]")]
public class StudentController : ControllerBase
{
    private readonly MyWorldDbContext _myWorldDbContext;
    public StudentController(MyWorldDbContext myWorldDbContext)
    {
        _myWorldDbContext = myWorldDbContext;
    }
    [HttpGet]
    public async Task<IActionResult> GetAsync()
    {
        var students = await
        _myWorldDbContext.Students.ToListAsync();
        return Ok(students);
    }
    [HttpGet]
    [Route("get-student-by-id")]
    public async Task<IActionResult> GetStudentByIdAsync(int id)
    {
        var student = await
            _myWorldDbContext.Students.FindAsync(id);
        return Ok(student);
    }
    [HttpPost]
    public async Task<IActionResult> PostAsync(Student student)
    {
        _myWorldDbContext.Students.Add(student);
        await _myWorldDbContext.SaveChangesAsync();
        return Created($"/get-student-by-id?id={student.Id}", student);
    }
    [HttpPut]
    public async Task<IActionResult> PustAsync(Student studentToUpdate)
    {
        _myWorldDbContext.Students.Update(studentToUpdate);
        await _myWorldDbContext.SaveChangesAsync();
        return NoContent();
    }
    [Route("{id}")]
    [HttpDelete]
    public async Task<IActionResult> DeleteAsync(int id)
    {
        var studentToDelete = await _myWorldDbContext.Students.FindAsync(id);
        if (studentToDelete == null)
        {
            return NotFound();
        }
        _myWorldDbContext.Students.Remove(studentToDelete);
        await _myWorldDbContext.SaveChangesAsync();
        return NoContent();

    }

}
