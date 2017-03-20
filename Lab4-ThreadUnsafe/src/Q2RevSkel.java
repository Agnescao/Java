import java.awt.*;

import javax.swing.*;

import java.awt.event.*;



class Letter3  extends Thread implements Runnable, ActionListener{
	private int counter;
	private JFrame f1=new JFrame();
	private  JLabel l=new JLabel();
	private  Button s=new Button("suspend");
	private  Button r=new Button("Resume");
    
    Thread c=null;

	private Font fnt=new Font("TimesNewRoman",Font.BOLD,16);
	Container content;
	Letter3(){
		c=this;
		counter=65;
		content=f1.getContentPane();
		l.setFont(fnt);
		l.setText("Counter:  "+0);
       	             f1.setLayout(new FlowLayout());
                          f1.setSize(100,180);
                          content.add(l)	;
                          content.add(s);
                          content.add(r);
                          s.addActionListener(this);
                          r.addActionListener(this);
                         /* r.addActionListener(new ActionListener(){
                        	  public void actionPerformed(ActionEvent e)
                           	  {
                           		  c.resume();
                           	  }
                          });
                          
                          s.addActionListener(new ActionListener(){
                        	  public void actionPerformed(ActionEvent e)
                           	  {
                           		  c.suspend();
                           	  }
                        	  
                          });*/
                          
                          f1.setVisible(true); 
	/* r.addActionListener(new ActionListener(){
   	  public void actionPerformed(ActionEvent e)
   	  {
   		  c.resume();
   	  }
     });
     s.addActionListener(new ActionListener(){
   	  public void actionPerformed(ActionEvent e)
   	  {
   		  c.suspend();
   	  }
   	  
     });*/
                          
    	
    }   
	public void actionPerformed(ActionEvent e){
    	Object target = e.getSource();
    	if (target==s) this.suspend();
    	if (target==r) this.resume();
    }   


	   public void run(){
                          while(counter <100)
                         {          counter++;
                                    l.setFont(fnt);
                                    l.setText("Letter:  "+(char)counter);
                                    try{Thread.sleep(1000);}
                                    catch(Exception e){}}
                    } }   
       
public class Q2RevSkel{
public static void main(String[] args)
{
                   Letter3 c=new Letter3();
                   c.start();}
}

