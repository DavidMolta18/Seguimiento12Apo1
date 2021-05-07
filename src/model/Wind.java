package model;

public class Wind extends Instrument {

	private Material material;



public Wind (String referenceNumber, Ubication ubication, Distributor distributor, double width, double length , double height, Material material){

	super(referenceNumber,ubication,distributor,width,length,height);
	this.material=material;

}


public String toString () {
	String out= "===Wind instrument number 1===\n\n" +
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
			"Material: "  + material + "\n\n" +

			"===End of the Wind instrument number 1===" + "\n\n";
	return out;

}
}