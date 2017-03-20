 import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

class MyApp extends Thread{
		private int counter;
		private JFrame f1=new JFrame();
		private JPanel panel=new JPanel();
		private  JLabel l0=new JLabel("Increment");
		private  JTextField t0=new JTextField("0");
		private  JLabel l1=new JLabel("Decrement");
		private  JTextField t1=new JTextField("100");
		private JButton b1=new JButton("Pause Incr");
		private JButton b2=new JButton("Resume");
		private Font fnt=new Font("TimesNewRoman",Font.BOLD,18);
		Container content;
		MyApp c;
        Incrementer i;

		MyApp(){
			c=this;
			counter=0;
			content=f1.getContentPane();
			f1.setLayout(new FlowLayout());
			f1.setSize(230,180);
			panel.setLayout(new GridLayout(3,2));
			panel.add(l0); panel.add(t0);
			panel.add(l1); panel.add(t1);
			panel.add(b1); panel.add(b2);
			content.add(panel)	;
			i=new Incrementer(t0, 1);
			Decrementer d=new Decrementer(t1, 100);
			b2.addActionListener(new ActionListener(){
          	  public void actionPerformed(ActionEvent e)
          	  {
          		  i.resume();
          	  }
            });
			  b1.addActionListener(new ActionListener(){
            	  public void actionPerformed(ActionEvent e)
            	  {
            		 i.suspend();
            	  }
            	  
              });
			f1.setVisible(true);
			i.start();
			
			 }






 }

 class Incrementer extends Thread{

	JTextField t;
	int counter=0;
	Incrementer(JTextField   tPar,int v)
		{     t=tPar; counter = v;}

    public void run(){
		while(counter <101)
		{           counter++;
					t.setText(""+counter);
					try{ Thread.sleep(1000);}
					catch(Exception e){}
		}
	}
}

  class Decrementer  extends Thread{

	JTextField t;
	int counter=0;
	Decrementer(JTextField   tPar,int v)
		{     t=tPar; counter = v;}

    public void run(){
		while(counter > 0)
		{           counter--;
					t.setText(""+counter);
					try{ Thread.sleep(1000);}
					catch(Exception e){}
		}
	}
}


public class Q5bSkel{

public static void main(String[] args)
{
		MyApp a=new MyApp();
		a.start();

}
}

