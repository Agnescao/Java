import java.awt.*;

import javax.swing.*;

import java.awt.event.*;



class Counter  extends Thread{
	private int counter;
	private JFrame f1=new JFrame();
	private  JLabel l=new JLabel();
	private Font fnt=new Font("TimesNewRoman",Font.BOLD,16);
	private Button b1=new Button("suspend");
	private Button b2=new Button("resume");
	Counter c;
	Container content;
	Counter(){
		c=this;
		counter=0;
		content=f1.getContentPane();
		l.setFont(fnt);
		l.setText("Counter:  "+0);
       	             f1.setLayout(new FlowLayout());
                          f1.setSize(180,180);
                          content.add(l);	
                          content.add(b1);
                          content.add(b2);
                          b2.addActionListener(new ActionListener(){
                        	  public void actionPerformed(ActionEvent e)
                        	  {
                        		  c.resume();
                        	  }
                          });
                          b1.addActionListener(new ActionListener(){
                        	  public void actionPerformed(ActionEvent e)
                        	  {
                        		  c.suspend();
                        	  }
                        	  
                          });
                          f1.setVisible(true); }

	   public void run(){
                          while(counter <100)
                         {          counter++;
                                    l.setFont(fnt);
                                    l.setText("Counter:  "+counter);
                                    try{Thread.sleep(1000);}
                                    catch(Exception e){}}
                    
                         
	   
	   }
	   }   
       
public class Q3Skel{
public static void main(String[] args)
{
                   Counter c=new Counter();
                   c.start();}
}

