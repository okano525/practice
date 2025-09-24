package ex11_01;

public class Book extends TangibleAsset {
	String isbn;
	//コンストラクタ
	public Book(Sting name,int price,String color,String isbn) {
		super(name,price,color);
		this.isbn = isbn;
	}
	public String getIsbn(){return this.isbn;}
	

}

