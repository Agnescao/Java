import java.util.concurrent.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class Timer extends Thread{
	private JLabel l;

	public Timer(JLabel label){
		    this.l=label;}

           public void run(){
    	    while(true){
    	            Date d=new Date();
    	            l.setText(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds()); }
    	      }
}
class Counter2 extends Thread {
	private int counter;
	private JFrame f1=new JFrame();
	private  JLabel l1=new JLabel("              ");
	private  JLabel l2=new JLabel("              ");
	private Font fnt=new Font("TimesNewRoman",Font.BOLD,16);
	public Counter2(){	
		counter=0;
		Container c=f1.getContentPane();
		l1.setFont(fnt); l2.setFont(fnt);
		l1.setText("Counter:  "+0);
		f1.setLayout(new FlowLayout());
		f1.setSize(160,180);
		c.add(l1);   c.add(l2);
		f1.setVisible(true); }

	public JLabel readLabel2(){return l2;}

	public void run(){
		while(counter <100)
		{ 	counter++;
		l1.setFont(fnt);
		l1.setText("Counter:  "+counter);
		try{Thread.sleep(1000);}
		catch(Exception e){}
		}
	}
}
public class Q3aSkel{
public static void main(String[] args)
    {
	Counter2 c=new Counter2();
	Timer t=new Timer(c.readLabel2());
	t.start();
	c.start();
      }
}
