import java.awt.*;
import java.awt.event.*;
public class KEYEVENTS extends Frame implements KeyListener{
    Label l;
    TextArea area;
    KEYEVENTS(){

        l=new Label();
        l.setBounds(50,50,150,20);
        area=new TextArea();
        area.setBounds(50,180,300, 250);
        area.addKeyListener(this);
        add(l);
        add(area);
        setSize(300,400);
        setLayout(null);
        setVisible(true);
    }
    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed");
    }
    public void keyReleased(KeyEvent e) {
        l.setText("Key Released");
    }
    public void keyTyped(KeyEvent e) {
        l.setText("Key Typing");
    }

    public static void main(String[] args) {
        new KEYEVENTS();
    }
}