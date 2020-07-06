/*******************************************************************************
 * Instance t≈ô√≠dy {@code Window} p≈ôedstavuj√≠ ...
 * The {@code Window} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 ‚Äî 20yy-mm-dd
 */
import javax.swing.*;   
import java.awt.*;  

public class Window extends JFrame
{
    public Window()
    {
        super("Moje prvnÌ ≠ okno");
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout(100, 100, 40));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lb1 = new JLabel("Zaökrtni: ");
        this.add(lb1);
        
        JCheckBox chb1 = new JCheckBox();
        this.add(chb1);
        
        String[] doprPr = {"auto", "vlak", "letadlo"};
        JComboBox cBox = new JComboBox(doprPr);
        cBox.setLocation(50, 50);
        cBox.setSize(50, 150);
        this.add(cBox);
        
        //independent button
        this.add(new JRadioButton());
        //group button
        ButtonGroup bg1 = new ButtonGroup();
        JRadioButton bt1 = new JRadioButton();
        JRadioButton bt2 = new JRadioButton();
        JRadioButton bt3 = new JRadioButton();
        bg1.add(bt1);
        bg1.add(bt2);
        bg1.add(bt3);
        
        this.add(bt1);
        this.add(bt2);
        this.add(bt3);
        
        JTextField jtf = new JTextField("Text v TextFieldu", 5);
        this.add(jtf);
        
        this.setVisible(true);
    }
}
