import java.awt.Graphics;
import java.awt.Color;

public class  MediumCar extends Automobile
{
	public MediumCar(Color bodyColor, int x, int y)
	{
		
		super(bodyColor,x,y);
		this.height = 20;
		this.width = 70;
	}
	public void drawFrame(Graphics g)
    {
        
		g.setColor( bodyColor );
        g.fillRect(x,y,width, height);
	//	g.setColor(  );
		g.fillRect(x+5,y-10,width-10, height+5);
		//light
		g.setColor( Color.yellow );
		g.fillRect(x+width-5,y+4,5, 5);
		//window
		g.setColor( Color.blue );
		g.fillRect(x+13,y-8,40, 10);
		g.setColor( Color.black );
		g.drawRect(x+13,y-8,40, 10);
		g.drawRect(x+13,y-8,20, 10);
    }
	public void drawWheels(Graphics g)
	{	
		g.setColor( Color.black );
		g.fillOval(x+3,y+15, 15, 15);
		g.fillOval(x+50,y+15, 15, 15);
		g.setColor( Color.gray );
		g.fillOval(x+6,y+17, 10, 10);
		g.fillOval(x+53,y+17, 10, 10);
		
		//g.fillOval(x+3,y+15, 15, 15);
		//g.fillOval(x+60,y+15, 15, 15);
	}
	public void move()
	{
		x++;
	}
	
}