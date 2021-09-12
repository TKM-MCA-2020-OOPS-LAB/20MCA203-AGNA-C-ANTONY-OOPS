
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class subjects  extends Applet implements ActionListener {
    Button b1;
    TextField t1, t2, t3, t4, t5, t6;
    Label l1, l2, l3, l4, l5, l6;



    public void init() {
        l1 = new Label("CHEMISTRY :");
        l1.setBounds(50, 300, 150, 30);
        add(l1);
        t1 = new TextField();
        t1.setBounds(50, 250, 150, 30);
        add(t1);
        l2 = new Label("PHYSICS:");
        l2.setBounds(50, 330, 150, 30);
        add(l2);
        t2 = new TextField();
        t2.setBounds(50, 200, 150, 30);
        add(t2);
        l3 = new Label("BIOLOGY :");
        l3.setBounds(50, 360, 150, 30);
        add(l3);
        t3 = new TextField();
        t3.setBounds(50, 150, 150, 30);
        add(t3);
        l4 = new Label("MATHS:");
        l4.setBounds(50, 390, 150, 30);
        add(l4);
        t4 = new TextField();
        t4.setBounds(50, 100, 150, 30);
        add(t4);
        l5 = new Label("ENGLISH :");
        l5.setBounds(50, 420, 150, 30);
        add(l5);
        t5 = new TextField();
        t5.setBounds(50, 50, 150, 30);
        add(t5);
        b1 = new Button("result");
        b1.setBounds(350, 200, 100, 30);
        add(b1);
        l6 = new Label("% :");
        l6.setBounds(50, 500, 150, 30);
        add(l6);
        t6 = new TextField();
        t6.setBounds(50, 450, 150, 30);
        add(t6);
        b1.addActionListener(this);



    }

    public void actionPerformed(ActionEvent e) {

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;
        int sum = 0;
        a = Integer.parseInt(t1.getText());
        b = Integer.parseInt(t2.getText());
        c = Integer.parseInt(t3.getText());
        d = Integer.parseInt(t4.getText());
        f = Integer.parseInt(t5.getText());
        if (e.getSource() == b1) {

            sum = (a + b + c + d + f) / 5;
            t6.setText(String.valueOf(sum));
        }


    }

    public void paint(Graphics g) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;
        int sum = 0;


        a = Integer.parseInt(t1.getText());
        b = Integer.parseInt(t2.getText());
        c = Integer.parseInt(t3.getText());
        d = Integer.parseInt(t4.getText());
        f = Integer.parseInt(t5.getText());

        sum = (a + b + c + d + f) / 5;
        g.setColor(Color.YELLOW);
        g.fillOval(80,70, 150, 150);
        g.setColor(Color.BLACK);
        g.fillOval(120,120,15,15);
        g.fillOval(170,120,15,15);
        if( sum > 50){

            g.drawArc(130,180,50,20,180,180);
        }
        else{

            g.drawArc(130,180,50,20,180,-180);

        }

    }
}