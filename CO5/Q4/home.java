import com.sun.pisces.PiscesRenderer;
import sun.java2d.SunGraphics2D;

import java.awt.*;
import java.applet.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class home extends Applet implements MouseListener {
    public void init()
    {
        setSize(350,300);
        addMouseListener( this);

    }
    public void paint(Graphics d){
        setBackground(Color.gray);
        d.setColor(Color.cyan);
        int x[]={100,160,220};
        int y[]={100,50,100};
        Polygon p= new Polygon(x,y,3);
        d.fillPolygon(p);

        d.setColor(Color.yellow);
        d.fillRect(100,100,120,120);

        d.setColor(Color.blue);
        d.fillRect(145,160,30,60);


        d.setColor(Color.black);
        d.fillRect(115,125,25,25);
        d.setColor(Color.white);
        d.fillRect(118,127,19,20);
        d.setColor(Color.black);
        d.drawLine(115,137,140,137);
        d.drawLine(127,125,127,150);

        d.setColor(Color.black);
        d.fillRect(180,125,25,25);
        d.setColor(Color.white);
        d.fillRect(183,127,19,20);
        d.setColor(Color.black);
        d.drawLine(180,137,205,137);
        d.drawLine(192,125,192,150);




    }


    public void mouseClicked(MouseEvent e) {
        Graphics d= getGraphics();
        d.setColor(Color.red);
        d.fillRect(145,160,30,60);

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}