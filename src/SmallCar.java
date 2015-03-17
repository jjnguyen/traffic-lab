import java.awt.Graphics;
import java.awt.Color;

public class SmallCar extends Automobile
{
	public SmallCar(Color bodyColor, int x, int y)
	{
		super(bodyColor,x,y);
		this.height = 20;
		this.width = 35;
	}
	@Override
	public void drawWheels(Graphics g)
	{	
		g.setColor( Color.black );
		g.fillOval(x+3,y+15, 10, 10);
		g.fillOval(x+20,y+15, 10, 10);
	}
	public void move()
	{
		x+=4;
	}
}
