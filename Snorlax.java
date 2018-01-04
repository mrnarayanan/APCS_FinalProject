import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Snorlax extends Pokemon
{
	public Snorlax()
	{
		name = "Snorlax";
		typing = "Normal";
		type = 0;
		atk = 350;
		sp_atk = 251;
		def = 251;
		sp_def = 350;
		speed = 174;
		atk1 = "Tackle";
		atk2 = "Body Slam";
		atk3 = "Swift";
		atk4 = "Hyper Voice";
		try {
    	    front = ImageIO.read(new File("Images/"+name+"_Front.png"));
    	    back = ImageIO.read(new File("Images/"+name+"_Back.png"));
    	} 
    	catch (IOException e) {
    		System.out.println("Image Error.");
    	}
	}

}
