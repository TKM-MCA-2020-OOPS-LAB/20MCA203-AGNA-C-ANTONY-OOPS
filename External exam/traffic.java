import java.awt.*;
import java.applet.Applet;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;



public class traffic extends Applet implements ActionListener{
	Button b1,b2,b3;
	Label l1,l2,l3;
	TextField t1,t2,t3;
	
	public void init(){
		Frame f=new Frame("TRAFFIC LIGHT");
		b1=new Button();
		b1.setBounds(150,200,150,30);
		f.add(b1);
		l1=new Label("green");
		l1.setBounds(150,170,150,30);
		f.add(l1);
		t1=new TextField();
		t1.setBounds(150,190,150,30);
		f.add(t1);
		b2=new Button();
		b2.setBounds(150,250,150,30);
		f.add(b2);
		l2=new Label("yellow");
		l2.setBounds(150,220,150,30);
		f.add(l2);
		t2=new TextField();
		t2.setBounds(150,240,150,30);
		f.add(t2);
		b3=new Button();
		b3.setBounds(150,300,150,30);
		f.add(b3);
		l3=new Label("red");
		l3.setBounds(150,270,150,30);
		f.add(l3);
		t3=new TextField();
		t3.setBounds(150,290,150,30);
		f.add(t3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		
		
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			System.out.print("even");
			
		}
		if(e.getSource()==b2){
			System.out.print("odd");
			
		}
		if(e.getSource()==b3){
			System.out.print("all");
			
		}
		
		
		}	
		
		public static void main(String[] args) throws Exception{
			ArrayList<Integer> ar=new ArrayList<Integer>();
			Scanner s=new Scanner(System.in);
			int n;
			System.out.println("enter numbers to be noted ");
			n=s.nextInt();
			
			for(int i=0;i<n;i++){
				if(i%2==0){
					System.out.println(i+" is even ");
					ar.add(i);
					
					
				}
				else{
					System.out.println(i+" is odd");
					ar.add(i);
					
				}
		      }
			
			FileWriter fg=new FileWriter("even");
			Scanner x=new Scanner(System.in);
			fg.write(n);
            n=x.nextInt();
			for(int i=0;i<n;i++){
				if(i%2==0){
					System.out.println(i);
					
					
					
				}
			fg.close();
			FileReader rg=new FileReader("");
			rg.close();
			FileWriter fy=new FileWriter("odd");
			Scanner y=new Scanner(System.in);
			fy.write(n);
            n=y.nextInt();
			for(int m=0;m<n;i++){
				if(m%2==0){
					System.out.println(m);
					}
					else{
						System.out.println(m);
						
						
					}
					
					
				}
			fy.close();
			FileReader ry=new FileReader("odd");
			ry.close();
			FileWriter fr=new FileWriter("all");
			Scanner z=new Scanner(System.in);
			fr.write(n);
            n=z.nextInt();
			for(int m=0;m<n;i++){
				System.out.println(m);
				ar.add(m);
			}
			
			fr.close();
			FileReader rr=new FileReader("all");
		
			rr.close();
			
	
		
		}
				
		
		}
}
/*
 <applet=traffic.java width="400" height="400" >	
 */
	
	
