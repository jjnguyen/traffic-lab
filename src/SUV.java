import java.awt.Graphics;
import java.awt.Color;
 
public class SUV extends BigCar
{
    public SUV(Color bodyColor, int x, int y)
    {
        super(bodyColor, x, y);
        this.speed=1;
    }
     
    @Override
    public void drawFrame(Graphics g)
    {
    	super.drawFrame(g);
    	g.setColor(Color.blue);
		g.fillRect(x+width-75,y+height-45,30,20);
		g.setColor(Color.white);
		g.drawRect(x+width-50,y+height-25,25,20);
		g.drawRect(x+width-76,y+height-25,25,20);
    }
    public void drawWheels(Graphics g)
    {
    	super.drawWheels(g);
    	g.setColor( Color.white );
		g.drawOval(x+3,y+35, 25, 25);
		g.drawOval(x+90,y+35, 25, 25);
    }
}