import java.awt.Graphics;
import java.awt.Color;

public class BigCar extends Automobile
{
	public BigCar(Color bodyColor, int x, int y)
	{
		super(bodyColor,x,y);
		this.height = 50;
		this.width = 120;
	}
	
	@Override
	public void drawFrame(Graphics g)
	{
		super.drawFrame(g);
		//window
		g.setColor(Color.blue);
		g.fillRect(x+width-55,y+height-45,30,20);
		//light
		g.setColor(Color.yellow);
		g.fillRect(x+width-10,y+height-25 ,10,10);
		//door
		g.setColor(Color.black);
		g.drawRect(x+width-56,y+height-25,30,20);
		////window
	}
	@Override
	public void drawWheels(Graphics g)
	{	
		g.setColor( Color.black );
		g.fillOval(x+3,y+35, 25, 25);
		g.fillOval(x+90,y+35, 25, 25);
		g.setColor( Color.gray );
		g.fillOval(x+8,y+39, 15, 15);
		g.fillOval(x+95,y+40, 15, 15);
	}
	public void move()
	{
		x+=1;
	}
}
