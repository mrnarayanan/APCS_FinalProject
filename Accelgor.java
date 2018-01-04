import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Accelgor extends Pokemon
{
	public Accelgor()
	{
		name = "Accelgor";
		typing = "Bug";
		type = 6;
		atk = 262;
		sp_atk = 328;
		def = 196;
		sp_def = 240;
		speed = 427;
		atk1 = "Fury Cutter";
		atk2 = "Bug Bite";
		atk3 = "Signal Beam";
		atk4 = "Bug Buzz";
		try {
    	    front = ImageIO.read(new File("Images/"+name+"_Front.png"));
    	    back = ImageIO.read(new File("Images/"+name+"_Back.png"));
    	} 
    	catch (IOException e) {
    		System.out.println("Image Error.");
    	}
	}
	
}
