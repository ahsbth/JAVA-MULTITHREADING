import java.applet.*;
import java.awt.*;

 public class Addition extends Applet
{
	public void paint(Graphics g)
	{
		int x,y,z;
		x=25;
		y=35;
		z=x+y;
		
		String s=String.valueOf(z);
		g.drawString(s,50,70);
	}
}

	