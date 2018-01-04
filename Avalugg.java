import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Avalugg extends Pokemon
{
	public Avalugg()
	{
		name = "Avalugg";
		typing = "Ice";
		type = 14;
		atk = 336;
		sp_atk = 205;
		def = 513;
		sp_def = 210;
		speed = 170;
		atk1 = "Ice Ball";
		atk2 = "Avalanche";
		atk3 = "Icy Wind";
		atk4 = "Blizzard";
		try {
    	    front = ImageIO.read(new File("Images/"+name+"_Front.png"));
    	    back = ImageIO.read(new File("Images/"+name+"_Back.png"));
    	} 
    	catch (IOException e) {
    		System.out.println("Image Error.");
    	}
	}

}
