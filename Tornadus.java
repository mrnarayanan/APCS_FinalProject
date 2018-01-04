import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Tornadus extends Pokemon
{
	public Tornadus()
	{
		name = "Tornadus";
		typing = "Flying";
		type = 2;
		atk = 361;
		sp_atk = 383;
		def = 262;
		sp_def = 284;
		speed = 353;
		atk1 = "Acrobatics";
		atk2 = "Aerial Ace";
		atk3 = "Air Cutter";
		atk4 = "Air Slash";
		try {
    	    front = ImageIO.read(new File("Images/"+name+"_Front.png"));
    	    back = ImageIO.read(new File("Images/"+name+"_Back.png"));
    	} 
    	catch (IOException e) {
    		System.out.println("Image Error.");
    	}
	}

}
