package ex11_01;

public abstract class TangibleAsset {
	String name;
	int price;
	String color;
	//コンストラクタ
	public TangibleAsset(Sting name,int price,String color) {
	this.name = name;
	this.price = price;
	this.color = color;
	}
    //メソッド
	public String getName() {return this.name;}
	public int getPrice() {return this.price;}
	public String getColor() {return this.color;}

}
