package model;

public class Percussion2 extends Percussion {




public Percussion2 (String referenceNumber, Ubication ubication, Distributor distributor, double width, double length , double height, String material){

	super(referenceNumber,ubication,distributor,width,length,height,material);
	
}


public String toString () {
	String out= "===Percussion instrument number 2===\n\n" +
			"Reference number: "+ referenceNumber +"\n" +
			"==Distributor info== \n\n" +
			"Name: " + distributor.getname() + "\n" +
			"Direction: " + distributor.getdirection() + "\n" +
			"Contact phone: " + distributor.getcontactphone() + "\n\n" +
			"==Dimension measurement== \n\n" +
			"Width : " + width + "\n" +
			"Height : " + height + "\n" +
			"Length :" + length + "\n" +

			"==Material== " + "\n\n" + 
			"Material: "  + material + 

			"==Element==" + "\n\n" +
						
			"===End of the Percussion instrument number 2===";

	return out;
}


}