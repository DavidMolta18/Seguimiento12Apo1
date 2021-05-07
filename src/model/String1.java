package model;

public class String1 extends StringInstrument {



private double arclength;
private int stringamount;

// get

public double getarclength (){
	return arclength;
}

public int getstringamount (){

	return stringamount;
}



public String1 (String referenceNumber, Ubication ubication, Distributor distributor, double width, double length , double height, double arclength, int stringamount ){

	super(referenceNumber,ubication,distributor,width,length,height);
	this.arclength=arclength;
	this.stringamount=stringamount;
	

}

public String toString (){
	String out="===Stringed instrument number 1===\n\n" + 
			"Reference number: "+ referenceNumber +"\n" +
			"==Distributor info== \n\n" +
			"Name: " + distributor.getname() + "\n" +
			"Direction: " + distributor.getdirection() + "\n" +
			"Contact phone: " + distributor.getcontactphone() + "\n\n" +
			"==Measurement information== \n\n" +
			"Width: " + width + "\n" +
			"Length: " + length + "\n" + 
			"Height: " + height + "\n" +
			"Arc measure: " + arclength + "\n" +
			"String amount: " + stringamount + "\n" +
			"===End of Stringed instrument number 1===" + "\n";
	return out;

}

}


