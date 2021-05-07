package model;

public abstract class Instrument {

protected String referenceNumber;
protected Ubication ubication;
protected double width, length, height;
protected Distributor distributor;
protected Percussion percussion;
protected Wind wind;
protected String string;


// get

public String getreferenceNumber (){

	return referenceNumber;

}

public Ubication getUbication () {

	return ubication;
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
public Distributor getDistributor () {

	return distributor;
}


public Instrument (String referenceNumber, Ubication ubication, Distributor distributor, double width, double length , double height) {

	this.referenceNumber=referenceNumber;
	this.ubication=ubication;
	this.width=width;
	this.length=length;
	this.height=height;
	this.distributor=distributor;


}








}