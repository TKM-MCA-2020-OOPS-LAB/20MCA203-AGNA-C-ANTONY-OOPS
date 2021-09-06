import java.applet.Applet;
import java.awt.*;

public class Maximumofthree extends Applet{
    TextField T1,T2,T3;
    public void init(){
        T1 = new TextField(5);

        T2 = new TextField(5);

        T3 = new TextField(5);
        add(T1);

        add(T2);

        add(T3);
        T1.setText("0");

        T2.setText("0");

        T3.setText("0");


    }
    public void paint(Graphics n){

        int p, q, r,res;

        String str;
        n.drawString("enter values",25,50);
        str=T1.getText();

        p=Integer.parseInt(str);

        str=T2.getText();

        q=Integer.parseInt(str);

        str=T3.getText();

        r=Integer.parseInt(str);

        if (p>q) {

            if (p>r)

                res=p;

            else

                res=p;

        }

        else{

            if (q>r)

                res=q;

            else

                res=r;

        }

        n.drawString("Maximnum of 3 No is "+res,20,60);

        showStatus("MAXIMUM OF 3 NUMBERS");

    }




}
