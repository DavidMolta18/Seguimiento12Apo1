package ui;
import java.util.Scanner;
import model.Shop;


public class Main {

private Scanner reader;
private Shop shop;

public Main () {

	reader = new Scanner (System.in);
	shop=new Shop();
	
}



public static void main (String[]args){

	Main op = new Main ();
	

	op.showMenu();


}


public void showMenu () {
	int option=0;
	

	do {
	System.out.println("===WELCOME TO EN CLAVE DE SOL=== \n"+
		"Select an option, please:\n"+
		"See the information of the instruments that are available \n" +
		"1.Wind" + "\n" +
		"2.Percussion" + "\n" +
		"3.String" + "\n" +
		"4: Select an instrument to see how many instruments are created\n"+
		"0: EXIT THE PROBLEM");
	option = reader.nextInt();
	reader.nextLine();

		switch (option){
			case 1:
			createWind();
			
			break;
			case 2:
			createPercussion1();
			createPercussion2();
			
			
			break;
			case 3:
			createString1();
			createString2();
			createString3();
			break;
			case 4:
			// howmuch();
			break;




		}
	
	} while (option!=0);

}
	
	public void createWind() {



		shop.showwind();
	}

	public void createPercussion1() {

		

		shop.showpercussion1();
	}

	public void createPercussion2() {


		

		shop.showpercussion2();
	}

	public void createString1() {

		
		shop.showstring1();

	}

	public void createString2() {

		
		shop.showstring2();


	}
	public void createString3() {

		
			shop.showstring3();


	}











}
