package Q3;
 import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Counter extends Thread {

		private JFrame f1=new JFrame();
		private  JLabel l=new JLabel();
		private  JLabel l2=new JLabel();
		private Font fnt=new Font("TimesNewRoman",Font.BOLD,18);
		Container content;

		Counter(){
	
			content=f1.getContentPane();
			l.setFont(fnt);
			l.setText("Counter:  "+0);
			l2.setFont(fnt);
			l2.setText("Counter:  "+0);
			f1.setLayout(new FlowLayout());
			f1.setSize(190,180);
			content.add(l);content.add(l2);
			f1.setVisible(true);
			DisplayCounter dc1=new DisplayCounter(l);
			dc1.start();
			
			ToggleCounter tc1=new ToggleCounter(l2);
			tc1.start();
			 }
		

 }

//*******************************************

class DisplayCounter extends Thread{

	JLabel l;
	int counter=0;
	DisplayCounter(JLabel l1)
		{     l=l1;}

    public void run(){
		while(counter <100)
		{           counter++;
					l.setText("Counter:  "+counter);
					try{ Thread.sleep(1000);}
					catch(Exception e){}
		}
	}
}
//*******************************************************
class ToggleCounter extends Thread{

	JLabel l;
	int counter=0;
	ToggleCounter(JLabel l1)
		{     l=l1;}

    public void run(){
		while(counter <100)
		{           if (counter==0)counter=1;
		            else           counter=0;
					l.setText("Counter:  "+counter);
					try{ Thread.sleep(1000);}
					catch(Exception e){}
		}
	}
}
//*************************************************
public class Q3Skel{

public static void main(String[] args)
{
		Counter c=new Counter();
		c.start();
}
}

//*****************************************