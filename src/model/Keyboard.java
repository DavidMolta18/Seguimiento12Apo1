package model;

public class Keyboard extends Element {

private int octaves;
private String material;


public Keyboard( double width, double height, double length, int octaves, String material){
        super(width,height,length);
  		this.octaves=octaves;
  		this.material=material;


    }
	


}