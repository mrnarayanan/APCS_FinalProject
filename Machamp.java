import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Machamp extends Pokemon
{
	public Machamp()
	{
		name = "Machamp";
		typing = "Fighting";
		type = 1;
		atk = 394;
		sp_atk = 251;
		def = 284;
		sp_def = 295;
		speed = 229;
		atk1 = "Karate Chop";
		atk2 = "Brick Break";
		atk3 = "Focus Blast";
		atk4 = "Aura Sphere";
		try {
    	    front = ImageIO.read(new File("Images/"+name+"_Front.png"));
    	    back = ImageIO.read(new File("Images/"+name+"_Back.png"));
    	} 
    	catch (IOException e) {
    		System.out.println("Image Error.");
    	}
	}

}
