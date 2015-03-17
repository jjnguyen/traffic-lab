import java.awt.Graphics;
import java.awt.Color;
 
public class Truck2 extends BigCar
{
    public Truck2(Color bodyColor, int x, int y)
    {
        super(bodyColor, x, y);
    }
     
    @Override
    public void drawFrame(Graphics g)
    {
    	//super.drawFrame(g);
    	g.setColor(bodyColor);
    	g.fillRect(x, y+25, 120, 25);
    	g.fillRect(x+40, y, 70, 25);
    	
    	g.setColor(Color.blue);
		g.fillRect(x+width-55,y+height-45,30,20);
		//light
		g.setColor(Color.yellow);
		g.fillRect(x+width-10,y+height-25 ,10,10);
		//door
		g.setColor(Color.black);
		g.drawRect(x+width-56,y+height-25,30,20);
         
    }
    public void move()
    {
    	x+=2;
    }
}