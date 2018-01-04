import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Florges extends Pokemon
{
	public Florges()
	{
		name = "Florges";
		typing = "Fairy";
		type = 17;
		atk = 251;
		sp_atk = 355;
		def = 258;
		sp_def = 447;
		speed = 273;
		atk1 = "Draining Kiss";
		atk2 = "Play Rough";
		atk3 = "Fairy Wind";
		atk4 = "Moonblast";
		try {
    	    front = ImageIO.read(new File("Images/"+name+"_Front.png"));
    	    back = ImageIO.read(new File("Images/"+name+"_Back.png"));
    	} 
    	catch (IOException e) {
    		System.out.println("Image Error.");
    	}
	}

}
