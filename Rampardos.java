import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Rampardos extends Pokemon
{
	public Rampardos()
	{
		name = "Rampardos";
		typing = "Dark";
		type = 5;
		atk = 471;
		sp_atk = 251;
		def = 240;
		sp_def = 218;
		speed = 236;
		atk1 = "Rock Throw";
		atk2 = "Rock Slide";
		atk3 = "Ancient Power";
		atk4 = "Power Gem";
		try {
    	    front = ImageIO.read(new File("Images/"+name+"_Front.png"));
    	    back = ImageIO.read(new File("Images/"+name+"_Back.png"));
    	} 
    	catch (IOException e) {
    		System.out.println("Image Error.");
    	}
	}

}
