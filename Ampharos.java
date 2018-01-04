import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Ampharos extends Pokemon
{
	public Ampharos()
	{
		name = "Ampharos";
		typing = "Electric";
		type = 12;
		atk = 273;
		sp_atk = 361;
		def = 273;
		sp_def = 306;
		speed = 229;
		atk1 = "Spark";
		atk2 = "Thunder Punch";
		atk3 = "Thunder Shock";
		atk4 = "Discharge";
		try {
    	    front = ImageIO.read(new File("Images/"+name+"_Front.png"));
    	    back = ImageIO.read(new File("Images/"+name+"_Back.png"));
    	} 
    	catch (IOException e) {
    		System.out.println("Image Error.");
    	}
	}

}
