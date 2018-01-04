import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Mismagius extends Pokemon
{
	public Mismagius()
	{
		name = "Mismagius";
		typing = "Ghost";
		type = 7;
		atk = 240;
		sp_atk = 339;
		def = 240;
		sp_def = 339;
		speed = 339;
		atk1 = "Shadow Punch";
		atk2 = "Shadow Claw";
		atk3 = "Ominous Wind";
		atk4 = "Shadow Ball";
		try {
    	    front = ImageIO.read(new File("Images/"+name+"_Front.png"));
    	    back = ImageIO.read(new File("Images/"+name+"_Back.png"));
    	} 
    	catch (IOException e) {
    		System.out.println("Image Error.");
    	}
	}

}
