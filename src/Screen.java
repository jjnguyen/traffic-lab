import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;
 
 
public class Screen extends JPanel
{
     
    Sedan sd;
    SportsCar sp;
    private ArrayList<Automobile> carList = new ArrayList<Automobile>();
 
    public Screen()
    {
    	sd = new Sedan(Color.red,500,50);
    	sp = new SportsCar(Color.red,100,200);
        carList.add( new Automobile(Color.blue, 50, 50) );
        carList.add( new SmallCar(Color.green, 200, 50) );
         
        int y = 50;
        for(int i=0; i<10; i++)
        {
            carList.add( new SmallSportCar(Color.red, 300, y) );
            y += 50;
        }
		//carList.add( new MediumCar(Color.red, 400, 50) );
		carList.add( new Sedan(Color.red, 500, 50) );

        carList.add(sd);
        carList.add(sp);
    }
     
    public Dimension getPreferredSize()
    {
        Dimension windowSize = new Dimension(800,600);
        return windowSize;
    }
     
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
         
        //draw background
        g.setColor( Color.white );
        g.fillRect(0,0,800,600);
         
        //draw cars
        for(Automobile each : carList )
        {
        	each.drawMe(g);
        }
//        sd.drawMe(g);
//        sp.drawMe(g);
            
    }
    public void animate()
    {
    	while(true)
        {
            try {
                Thread.sleep(100);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
 
            sd.move();
            sp.move();
             
            repaint();
        }
    }
 
     
     
}