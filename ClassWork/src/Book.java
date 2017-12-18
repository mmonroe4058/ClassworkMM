public class Book
{
	 private String name;
	 private int price;
	 private String author;
	 
	 public Book(String name, int price, String author)
	 {
		 this.name = name;
		 this.price = price;
		 this.author = author;
	 }
	 
	public String getName()
	{
	    return name;
	}
	
    public int getPrice()
    {
        return price;
    }
	
	public void setName(String name)
	{
		this.name = name;
	}
	
    public String getAuthor()
    {
        return author;
    }
    
    public void setAuthor(String author)
    {
    	this.author = author;
    }
    
    public String toString()
    { 
    	return "Book [name=" + name + ", price=" + price + ", author=" + author + "]";
    }




}
