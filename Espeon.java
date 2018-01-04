import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Espeon extends Pokemon
{
	public Espeon()
	{
		name = "Espeon";
		typing = "Psychic";
		type = 13;
		atk = 251;
		sp_atk = 394;
		def = 240;
		sp_def = 317;
		speed = 350;
		atk1 = "Psycho Cut";
		atk2 = "Zen Headbutt";
		atk3 = "Psybeam";
		atk4 = "Psychic";
		try {
    	    front = ImageIO.read(new File("Images/"+name+"_Front.png"));
    	    back = ImageIO.read(new File("Images/"+name+"_Back.png"));
    	} 
    	catch (IOException e) {
    		System.out.println("Image Error.");
    	}
	}

}
