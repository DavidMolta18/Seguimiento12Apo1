package model;

public class Percussion1 extends Percussion {


private Element element;

public Percussion1 (String referenceNumber, Ubication ubication, Distributor distributor, double width, double length , double height,String material,Element element){

	super(referenceNumber,ubication,distributor,width,length,height,material);
	this.element=element;
}

public String toString () {

	String out= "===Percussion instrument number 1===\n\n" +
			"Reference number: "+ referenceNumber +"\n" +
			"==Distributor info== \n\n" +
			"Name: " + distributor.getname() + "\n" +
			"Direction: " + distributor.getdirection() + "\n" +
			"Contact phone: " + distributor.getcontactphone() + "\n\n" +
			"==Dimension measurement== \n\n" +
			"Width : " + width + "\n" +
			"Height : " + length + "\n" +
			"Length :" + height + "\n" +

			"==Material== " + "\n\n" + 
			"Material: "  + material + 

			"==Element==" + "\n\n" +

			"Element Width: " + element.getWidth() + "\n" + 
			"Element Length: " + element.getLength() + "\n" + 
			"Element Height: " + element.getHeight() + "\n" + 
			"Element material: " + element.getmaterial() + "\n" +
			"Element quantity: " + element.getquantity() + "\n" + 

			"===End of the Percussion instrument number 1===";
	return out;

}

}