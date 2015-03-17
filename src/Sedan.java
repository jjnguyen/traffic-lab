import java.awt.Graphics;
import java.awt.Color;
 
public class Sedan extends MediumCar
{
    public Sedan(Color bodyColor, int x, int y)
    {
        super(bodyColor, x, y);
    }
     
    @Override
    public void drawFrame(Graphics g)
    {
        
		super.drawFrame(g);
		//doors
		g.setColor( Color.black );
		g.drawRect(x+5,y+4,width-10, height-5);
		g.setColor( Color.black );
		g.drawRect(x+5,y+4,(width-10)/2, height-5);
		
		
    }
    public void move()
    {
    	x++;
    }
	//@Override
	
}