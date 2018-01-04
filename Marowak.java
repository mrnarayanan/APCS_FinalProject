import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Marowak extends Pokemon 
{
	public Marowak()
	{
		name = "Marowak";
		typing = "Ground";
		type = 4;
		atk = 284;
		sp_atk = 218;
		def = 350;
		sp_def = 284;
		speed = 207;
		atk1 = "Bone Club";
		atk2 = "Earthquake";
		atk3 = "Mud Shot";
		atk4 = "Earth Power";
		try {
    	    front = ImageIO.read(new File("Images/"+name+"_Front.png"));
    	    back = ImageIO.read(new File("Images/"+name+"_Back.png"));
    	} 
    	catch (IOException e) {
    		System.out.println("Image Error.");
    	}
	}

}
