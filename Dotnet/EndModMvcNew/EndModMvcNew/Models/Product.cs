using BOL;
using System.ComponentModel.DataAnnotations;

namespace EndModMvcNew.Models
{
    public class Product
    {
        [Required]
        public int Id { get; set; }
        [Required]
        public string Name { get; set; }
        [MaxLength(500)]
        public string Description { get; set; }
        [Range(1, double.MaxValue, ErrorMessage = "Price cannot be less than 1")]
        public double Price { get; set; }
        [Range(1, double.MaxValue, ErrorMessage = "Quantity cannot be less than 0")]
        public int Quantity { get; set; }
        [Required, MaxLength(500)]
        public Category ProductCategory { get; set; }



        
    }
}
