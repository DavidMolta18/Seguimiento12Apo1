package model;

public class String2 extends StringInstrument {

private int fretamount;
private String hasCase;
private int stringamount;

public int getstringamount (){
	return stringamount;
} 

public int getfretamount (){

	return fretamount;
}
public String gethasCase () {
	return hasCase;
}

public String2 (String referenceNumber, Ubication ubication, Distributor distributor, double width, double length , double height, int stringamount, int fretamount, String hasCase){

	super(referenceNumber,ubication,distributor,width,length,height);
	this.stringamount=stringamount;
	this.hasCase=hasCase;
	this.fretamount=fretamount;

}

public String toString () {

	String out= "===Stringed instrument number 2===\n\n" + 
			"Reference number: "+ referenceNumber +"\n" +
			"==Distributor info== \n\n" +
			"Name: " + distributor.getname() + "\n" +
			"Direction: " + distributor.getdirection() + "\n" +
			"Contact phone: " + distributor.getcontactphone() + "\n\n" +
			"==Measurement information== \n\n" +
			"Width: " + width + "\n" +
			"Length: " + length + "\n" + 
			"Height: " + height + "\n" +
			"String amount: " + stringamount + "\n" +
			"Fret amount: " + fretamount + "\n" +
			"Has case? : " + hasCase + "\n" +

			"===End of Stringed instrument number 2===" + "\n";

	return out;

}







}