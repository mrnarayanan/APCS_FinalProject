import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Haxorus extends Pokemon
{
	public Haxorus()
	{
		name = "Haxorus";
		typing = "Dragon";
		type = 15;
		atk = 432;
		sp_atk = 240;
		def = 306;
		sp_def = 262;
		speed = 322;
		atk1 = "Dragon Claw";
		atk2 = "Dragon Rush";
		atk3 = "Twister";
		atk4 = "Dragon Pulse";
		try {
    	    front = ImageIO.read(new File("Images/"+name+"_Front.png"));
    	    back = ImageIO.read(new File("Images/"+name+"_Back.png"));
    	} 
    	catch (IOException e) {
    		System.out.println("Image Error.");
    	}
	}
	
}
