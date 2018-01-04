import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Typhlosion extends Pokemon
{
	public Typhlosion()
	{
		name = "Typhlosion";
		typing = "Fire";
		type = 9;
		atk = 293;
		sp_atk = 348;
		def = 280;
		sp_def = 295;
		speed = 328;
		atk1 = "Flame Wheel";
		atk2 = "Fire Punch";
		atk3 = "Lava Plume";
		atk4 = "Flamethrower";
		try {
    	    front = ImageIO.read(new File("Images/"+name+"_Front.png"));
    	    back = ImageIO.read(new File("Images/"+name+"_Back.png"));
    	} 
    	catch (IOException e) {
    		System.out.println("Image Error.");
    	}
	}
	
}
