package model;

public class Element{

private String material;
private int quantity;
private double width;
private double length;
private double height;

// get

public String getmaterial () {
	return material;
}

public int getquantity () {

	return quantity;
}
public double getWidth () {

	return width;
}
public double getLength () {

	return length;
}
public double getHeight () {

	return height;
}

public Element (double width, double length , double height, String material, int quantity){

	this.width=width;
	this.length=length;
	this.height=height;
	this.material=material;
	this.quantity=quantity;

}

public Element (double width, double length, double height){
	this.width=width;
	this.length=length;
	this.height=height;
}


}