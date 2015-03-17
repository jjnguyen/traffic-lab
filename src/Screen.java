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
	private BufferedImage roadImage;
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
        /*carList.add(new Sedan(Color.gray,550,50));
        carList.add(new SportsCar(Color.red,100,50));
        carList.add(new BigCar(Color.magenta,250,50));
        carList.add(new Truck2(Color.orange,400,50));*/
        
        int x=0;
        int y=50;
        Automobile cur = null;
       /* for(int i=0;i<5;i++)
        {
        	x+=(cur==null ?0 :(cur.width));
        	cur=new Sedan(Color.gray,x,y);
        	carList.add(cur);
        	
        	x+=cur.width+20;
        	cur=new SportsCar(Color.gray,x,y);
        	carList.add(cur);
        	
        	x+=cur.width+20;
        	cur=new Truck2(Color.gray,x,y);
        	carList.add(cur);
        	
        	x+=cur.width+20;
        	cur=new SUV(Color.gray,x,y);
        	carList.add(cur);
        }*/
        Automobile sedan = new Sedan(Color.red,0,0);
        
        init();
    }
    public void init()
    {
    	roadImage=null;
        try {
        	roadImage = ImageIO.read(new File("images/road.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

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
         
        g.drawImage(roadImage, -10, 0, null);
        g.drawImage(roadImage, -10, 300, null);
        
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
            //	each.move();
            }
             
            repaint();
        }
    }
 
     
     
}