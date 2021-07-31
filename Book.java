public class Book exends TanbibleAsset{
	private Stirng isbn;

	public Book(String name,int price,Srtring color,String isbn){
		super(name,price,color);
		this.isbn=isbn;
	}
	public String gettlsbn(){return this.isbn;}
}

