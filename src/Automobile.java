import java.awt.Graphics;
import java.awt.Color;

public class Automobile
{
	public String name;
	public Color bodyColor;
	public int x = 100;
	public int y = 100;
	public int width;
	public int height;
	protected int speed =2;
	private Automobile front;
	private Automobile back;
	private boolean isFront;
	
	public Automobile(Color bodyColor, int x, int y)
	{
		//this.name = name;
		this.bodyColor = bodyColor;
		this.x = x;
		this.y = y;
		this.width=70;
		this.height=40;
		
	}
	
	public void setFront(Automobile front)
	{
		this.front = front;
	}
	
	public void setBack(Automobile back)
	{
		this.back = back;
	}

	public void setIsFront(boolean front) {
		isFront = front;
	}
	
	public final String getName()
	{
		return name;
	}
	

		
	public void drawMe(Graphics g)
	{
		
		this.drawFrame(g);
		this.drawWheels(g);
	}
	
	public void drawFrame(Graphics g)
	{
		g.setColor( bodyColor );
		g.fillRect(x,y,width,height);
	}
	
	public void drawWheels(Graphics g)
	{	
		g.setColor( Color.black );
		g.fillOval(x+5,y+25, 20, 20);
		g.fillOval(x+45,y+25, 20, 20);
	}
	public void move()
	{
		if(checkCollision()==true)
		{
			return;
		}
		x+=speed;
		if(x>=820)
		{
			x=-100;
			if (isFront) {
				isFront = false;
				back.setIsFront(true);				
			}
		}
	}
	
	public boolean checkCollision()
	{
		return !isFront && (x + width + 30)>=front.x;
	}
	
}