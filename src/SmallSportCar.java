import java.awt.Graphics;
import java.awt.Color;
 
public class SmallSportCar extends SmallCar
{
    public SmallSportCar(Color bodyColor, int x, int y)
    {
        super(bodyColor, x, y);
    }
     
    @Override
    public void drawFrame(Graphics g)
    {
        g.setColor( bodyColor );
         
        int[] xArray = new int[3];
        int[] yArray = new int[3];
         
        //Point 1
        xArray[0] = x + width;
        yArray[0] = y;
         
        //Point 2
        xArray[1] = x+width;
        yArray[1] = y+height;
         
        //Point 3
        xArray[2] = x;
        yArray[2] = y + height;
         
        g.fillPolygon(xArray, yArray, 3);
         
    }
}