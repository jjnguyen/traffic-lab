import javax.imageio.ImageIO;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
 
 
public class Screen extends JPanel
{
	private BufferedImage buffered;
    private Sedan sd;
    private SportsCar sp;
    private BigCar bc;
    private Truck2 t2;
    private SUV suv;
    private Automobile am;
    private SmallCar sc;
    private SmallSportCar ssc;
   
    private ArrayList<Automobile> carList = new ArrayList<Automobile>();
 
    public Screen()
    {    	
    	sd = new Sedan(Color.red,500,50);
    	sp = new SportsCar(Color.red,100,300);
    	bc = new BigCar(Color.magenta,100,200);
    	t2 = new Truck2(Color.orange,100,400);
    	suv = new SUV(Color.black,100,500);
    	am = new Automobile(Color.blue,50,50);
    	sc = new SmallCar(Color.green,200,50);
    	ssc = new SmallSportCar(Color.red,300,50);
       
    	//carList.add( new Automobile(Color.blue, 50, 50) );
        //carList.add( new SmallCar(Color.green, 200, 50) );
        
		//carList.add( new MediumCar(Color.red, 400, 50) );
		//carList.add( new Sedan(Color.red, 500, 50) );

        carList.add(sd);
        carList.add(sp);
        carList.add(bc);
        carList.add(t2);
        carList.add(suv);
        carList.add(am);
        carList.add(sc);
        carList.add(ssc);
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
       
        if (buffered == null)
            buffered = (BufferedImage) (createImage(getWidth(), getHeight()));

        Graphics gBuff = buffered.createGraphics();

        g.setColor( Color.white );
        g.fillRect(0,0,800,600);
        

        BufferedImage roadImage = null;
        try {
        	roadImage = ImageIO.read(new File("ROAD_STRAIGHT.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        gBuff.drawImage(roadImage, 0, 0, null);
        
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
 
            for(Automobile each : carList )
            {
            	each.move();
            }
             
            repaint();
        }
    }
 
     
     
}