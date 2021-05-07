package model;

public class String3 extends StringInstrument {


private Orientation ori;


// get

public Orientation getorientation () {
	return ori;
}



public String3 (String referenceNumber, Ubication ubication, Distributor distributor,double width, double length , double height, Orientation ori){

	super(referenceNumber,ubication,distributor,length,height,width);
	this.ori=ori;
	
	

}


public String toString() {
	String out= "===Stringed instrument number 3===\n\n" + 
			"Reference number: "+ referenceNumber +"\n" +
			"==Distributor info== \n\n" +
			"Name: " + distributor.getname() + "\n" +
			"Direction: " + distributor.getdirection() + "\n" +
			"Contact phone: " + distributor.getcontactphone() + "\n\n" +
			"==Total Dimension measurement (BOX + KEYBOARD)== \n\n" +
			"Width : " + width + "\n" +
			"Height : " + length + "\n" +
			"Length :" + height + "\n" +

			"Orientation: " + ori + "\n" +



			"===End of Stringed instrument number 3===" + "\n\n";

	return out;


}

}
