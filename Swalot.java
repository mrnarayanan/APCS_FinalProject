import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Swalot extends Pokemon
{
	public Swalot()
	{
		name = "Swalot";
		typing = "Poison";
		type = 3;
		atk = 269;
		sp_atk = 269;
		def = 291;
		sp_def = 291;
		speed = 229;
		atk1 = "Poison Jab";
		atk2 = "Gunk Shot";
		atk3 = "Acid";
		atk4 = "Sludge Bomb";
		try {
    	    front = ImageIO.read(new File("Images/"+name+"_Front.png"));
    	    back = ImageIO.read(new File("Images/"+name+"_Back.png"));
    	} 
    	catch (IOException e) {
    		System.out.println("Image Error.");
    	}
	}

}
