import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Milotic extends Pokemon
{
	public Milotic()
	{
		name = "Milotic";
		typing = "Water";
		type = 10;
		atk = 240;
		sp_atk = 328;
		def = 282;
		sp_def = 383;
		speed = 287;
		atk1 = "Aqua Tail";
		atk2 = "Waterfall";
		atk3 = "Water Gun";
		atk4 = "Hydro Pump";
		try {
    	    front = ImageIO.read(new File("Images/"+name+"_Front.png"));
    	    back = ImageIO.read(new File("Images/"+name+"_Back.png"));
    	} 
    	catch (IOException e) {
    		System.out.println("Image Error.");
    	}
	}

}
