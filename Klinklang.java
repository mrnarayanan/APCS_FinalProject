import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Klinklang extends Pokemon
{
	public Klinklang()
	{
		name = "Klinklang";
		typing = "Steel";
		type = 8;
		atk = 328;
		sp_atk = 262;
		def = 361;
		sp_def = 295;
		speed = 306;
		atk1 = "Gyro Ball";
		atk2 = "Magnet Bomb";
		atk3 = "Mirror Shot";
		atk4 = "Flash Cannon";
		try {
    	    front = ImageIO.read(new File("Images/"+name+"_Front.png"));
    	    back = ImageIO.read(new File("Images/"+name+"_Back.png"));
    	} 
    	catch (IOException e) {
    		System.out.println("Image Error.");
    	}
	}

}
