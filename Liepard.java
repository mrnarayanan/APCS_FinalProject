import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Liepard extends Pokemon
{
	public Liepard()
	{
		name = "Liepard";
		typing = "Dark";
		type = 16;
		atk = 302;
		sp_atk = 302;
		def = 218;
		sp_def = 218;
		speed = 342;
		atk1 = "Pursuit";
		atk2 = "Night Slash";
		atk3 = "Snarl";
		atk4 = "Dark Pulse";
		try {
    	    front = ImageIO.read(new File("Images/"+name+"_Front.png"));
    	    back = ImageIO.read(new File("Images/"+name+"_Back.png"));
    	} 
    	catch (IOException e) {
    		System.out.println("Image Error.");
    	}
	}

}
