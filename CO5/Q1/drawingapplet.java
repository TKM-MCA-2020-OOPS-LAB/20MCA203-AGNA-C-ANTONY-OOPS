import java.applet.Applet;
import java.awt.*;

public class drawingapplet extends Applet{
    public void paint(Graphics n){
        n.drawLine(150,100,50,300);
        n.setColor(Color.cyan);
        n.drawRect(280,100,160,40);
        n.setColor(Color.yellow);
        n.drawOval(400,300,150,75);


    }
}
