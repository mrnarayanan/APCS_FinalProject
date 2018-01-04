import java.applet.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;

public class apptest extends Applet {


    // Called by the browser or applet viewer to inform
   	// this applet that it has been loaded into the system.

    public void init() 
	{
    	setSize(800,480);
    }

    // Paints the container. This forwards the paint to any
    // lightweight components that are children of this container.

    public static void paint(Graphics g, BufferedImage scene, BufferedImage front, BufferedImage back) 
    {
	
        // draws as much of the specified image as is currently available
        g.drawImage(scene, 0, 0, null);
        g.drawImage(front, 100, 400, null);
        g.drawImage(back, 600, 100, null);
    }
    
}
