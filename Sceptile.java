import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Sceptile extends Pokemon
{
	public Sceptile()
	{
		name = "Sceptile";
		typing = "Grass";
		type = 11;
		atk = 295;
		sp_atk = 339;
		def = 251;
		sp_def = 295;
		speed = 372;
		atk1 = "Razor Leaf";
		atk2 = "Leaf Blade";
		atk3 = "Leaf Tornado";
		atk4 = "Energy Ball";
		try {
    	    front = ImageIO.read(new File("Images/"+name+"_Front.png"));
    	    back = ImageIO.read(new File("Images/"+name+"_Back.png"));
    	} 
    	catch (IOException e) {
    		System.out.println("Image Error.");
    	}
	}

}
