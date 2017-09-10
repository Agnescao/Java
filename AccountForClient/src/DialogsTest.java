import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class DialogsTest
{   
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {               
                JPanel p = new JPanel();
                JPanel contentPane = new JPanel();
                contentPane.add(p);
                JFrame f = new JFrame();
                f.setContentPane(contentPane);
                f.setSize(400, 300);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setVisible(true);         
                /* 
                 * NOTE: It is not recomended to share the same instance of a component 
                 * by different parents. Thought it is fine here since the first 
                 * dialog will release it before the second will get it.
                 * But in a situation when we wouldn't make the 'dialog' modal and 
                 * we would show it after the 'option pane dialog' it would be empty.
                 */
                JPanel message = new JPanel();
                message.add(new JLabel("Label:"));              
                message.add(new JTextField("ABCD"));
                message.setBackground(Color.GREEN);
                JOptionPane.showConfirmDialog(f, message, "Default made dialog", JOptionPane.YES_NO_OPTION);

                Object[] options = new String[]{"a", "b", "c"};
                JOptionPane.showOptionDialog(f, message, "", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE, 
                        null, options, options[0]);
                JDialog dialog = new JDialog(f, "Custom made dialog");
                dialog.setModal(true);
                dialog.setContentPane(message);
                dialog.pack();
                dialog.setLocationRelativeTo(f);
                dialog.setVisible(true);
            }
        });
    }
}