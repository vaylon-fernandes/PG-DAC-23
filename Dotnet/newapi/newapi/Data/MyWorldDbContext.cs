using Microsoft.EntityFrameworkCore;
using newapi.Data.Entities;

namespace newapi.Data
{
    public class MyWorldDbContext:DbContext
    {
        public MyWorldDbContext(DbContextOptions<MyWorldDbContext> context) : base(context)
        { }
        public DbSet<Student> Students { get; set; }
    }
}
