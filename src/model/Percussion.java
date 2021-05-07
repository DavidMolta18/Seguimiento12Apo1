package model;

public abstract class Percussion extends Instrument {

protected String material;






public Percussion (String referenceNumber, Ubication ubication, Distributor distributor, double width, double length , double height,String material){

	super(referenceNumber,ubication,distributor,width,length,height);
	this.material=material;
}










}