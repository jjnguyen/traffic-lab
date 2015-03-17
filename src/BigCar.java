import java.awt.Graphics;
import java.awt.Color;

public class BigCar extends Automobile
{
	public BigCar(Color bodyColor, int x, int y)
	{
		super(bodyColor,x,y);
		this.height = 40;
		this.width = 50;
	}
	@Override
	public void drawWheels(Graphics g)
	{	
		g.setColor( Color.black );
		g.fillOval(x+3,y+15, 10, 10);
		g.fillOval(x+20,y+15, 10, 10);
	}
}
