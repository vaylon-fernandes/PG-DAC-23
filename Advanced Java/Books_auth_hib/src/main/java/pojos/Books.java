package pojos;

import javax.persistence.*;
//Book : id,title(unique), price 
@Entity
@Table(name="books")
public class Books extends BaseEntity{
	@Column(unique = true)
	private String title;
	private Double price;
	@ManyToOne
    @JoinColumn(name = "author_id")
	private Author authorId;
	public Books() {
		
	}
	public Books(String title, Double price) {
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Author getAuthor() {
		return authorId;
	}
	public void setAuthor(Author author) {
		this.authorId = author;
	}
	
//	@Override
//	public String toString() {
//		return "Books [title=" + title + ", price=" + price + ", author=" + authorId + "]";
//	}
//	
}
