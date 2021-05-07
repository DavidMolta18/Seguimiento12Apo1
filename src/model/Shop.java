package model;

public class Shop {

	
	private String1 string1;
	private String2 string2;
	private String3 string3;
	private Wind wind;
	private Percussion1 percussion1;
	private Percussion2 percussion2;
	


	public Shop () {

	}





	public void showstring1 () {

		Distributor distri = new Distributor ("David molta","Calle 45 #98b-50","3123123123");
		String1 string1 = new String1("A00372933",Ubication.STORED,distri,50,20,30,35,5);
		System.out.println(string1.toString());

	}

	public void showstring2 () {



		Distributor distri2 = new Distributor ("Colombina","Calle 4a #22N-60","3548795");
		String2 string2 = new String2("A00198756",Ubication.STORED,distri2,15,43.2,30.8,10,4,"YES");
		System.out.println(string2.toString());

	}

	public void showstring3 () {

			Distributor distri3 = new Distributor ("La 14","Calle 9b #98a-35","3154694032");
			BoxDimension box = new BoxDimension (15,40,20);
			Keyboard key = new Keyboard (35,10,30,3,"WOOD");
			double w = (box.getWidth());
			double w1= (key.getWidth());
			double w2= w+w1;
			double l = (box.getLength());
			double l1=(key.getLength());
			double l2= l1+l;
			double h= (box.getHeight());
			double h1= (key.getHeight());
			double h2= h+h1;
			
			String3 string3 = new String3("A00897546",Ubication.STORED,distri3,w2,l2,h2,Orientation.HORIZONTAL);
			
			System.out.println(string3.toString());


	}

	public void showwind () {



		Distributor distri6= new Distributor ("H20","Calle 32a #72-47","3164569430");
		Wind wind= new Wind ("A00453209",Ubication.STORED,distri6,20,35,10,Material.METAL);

			System.out.println(wind.toString());


	}

	public void showpercussion1 () {

		Distributor distri4= new Distributor ("Coca Cola","Calle 4 #3nte-45","3188945215");
			Element element = new Element(20,30,15,"METAL",2);
			String material="GLASS";
			Percussion1 percussion1 = new Percussion1 ("A00147599",Ubication.STORED,distri4,20,30,10,material,element);
		
		
			System.out.println(percussion1.toString());

	}

	public void showpercussion2 () {

		Distributor distri5= new Distributor ("Postobon","Calle 13a #41a-55","3174598632");
		String material1="WOOD";
		Percussion2 percussion2 = new Percussion2 ("A00147599",Ubication.STORED,distri5,15,40,25,material1);
		System.out.println(percussion2.toString());


	}














}
