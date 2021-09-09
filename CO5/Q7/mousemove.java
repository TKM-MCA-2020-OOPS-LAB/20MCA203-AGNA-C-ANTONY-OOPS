import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class mousemove extends Applet implements MouseListener,MouseMotionListener {
    TextField t1=new TextField(30);
    String msg ="";

    public void init(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(t1);
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void paint(Graphics d)
    {
        d.drawString(msg,200,10);
    }
    public void mouseClicked(MouseEvent me)
    {
        t1.setText("mouse clicked");
        repaint();
    }
    public void mouseEntered(MouseEvent me)
    {   msg = "Mouse entered";
        t1.setText("mouse entered");
        repaint();

    }
    public void mouseExited(MouseEvent me) {
        msg = "Mouse exited";
        t1.setText("mouse exited");
        repaint();

    }
    public void mousePressed(MouseEvent me) {
        msg = "Mouse pressed";
        t1.setText("mouse pressed");
        repaint();
    }



    public void mouseDragged(MouseEvent me) {
        Graphics g=getGraphics();
        g.setColor(Color.BLUE);
        g.fillRect(50,100,50,30);
        msg = "Mouse pressed";
        t1.setText("mouse dragging");
        repaint();

    }

    public void mouseMoved(MouseEvent me)
    {
        msg="Moving mouse at " + me.getX() + ","  +me.getY();
        t1.setText("mouse moved");
        repaint();
    }
    public void mouseReleased(MouseEvent me) {
        msg = "Mouse released";
        t1.setText("mouse released");
        repaint();
    }
}

