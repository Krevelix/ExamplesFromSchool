/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;

public class vystupniForm extends JFrame 
{

    private JMenuBar menuBar;
    private JLabel label1;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;

    //Constructor 
    public vystupniForm(Prepravka data)
    {
        this.setTitle("GUI_project");
        this.setSize(300,300);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);
        setResizable(false);
        
        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(300,200));
        contentPane.setBackground(new Color(192,192,192));


        label1 = new JLabel();
        label1.setBounds(8,8,90,35);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("sansserif",0,12));
        label1.setText("Jmeno:");
        label1.setVisible(true);

        label10 = new JLabel();
        label10.setBounds(104,56,270,35);
        label10.setBackground(new Color(214,217,223));
        label10.setForeground(new Color(0,0,0));
        label10.setEnabled(true);
        label10.setFont(new Font("sansserif",0,12));
        label10.setText("label");
        label10.setVisible(true);

        label11 = new JLabel();
        label11.setBounds(104,72,270,35);
        label11.setBackground(new Color(214,217,223));
        label11.setForeground(new Color(0,0,0));
        label11.setEnabled(true);
        label11.setFont(new Font("sansserif",0,12));
        label11.setText("label");
        label11.setVisible(true);

        label12 = new JLabel();
        label12.setBounds(104,88,270,35);
        label12.setBackground(new Color(214,217,223));
        label12.setForeground(new Color(0,0,0));
        label12.setEnabled(true);
        label12.setFont(new Font("sansserif",0,12));
        label12.setText("label");
        label12.setVisible(true);

        label2 = new JLabel();
        label2.setBounds(8,24,90,35);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("sansserif",0,12));
        label2.setText("Prijmeni:");
        label2.setVisible(true);

        label3 = new JLabel();
        label3.setBounds(8,40,90,35);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(0,0,0));
        label3.setEnabled(true);
        label3.setFont(new Font("sansserif",0,12));
        label3.setText("Email:");
        label3.setVisible(true);

        label4 = new JLabel();
        label4.setBounds(8,56,100,35);
        label4.setBackground(new Color(214,217,223));
        label4.setForeground(new Color(0,0,0));
        label4.setEnabled(true);
        label4.setFont(new Font("sansserif",0,12));
        label4.setText("Datum narozeni:");
        label4.setText("Zacal/zacne hrat:");
        label4.setVisible(true);

        label5 = new JLabel();
        label5.setBounds(7,72,90,35);
        label5.setBackground(new Color(214,217,223));
        label5.setForeground(new Color(0,0,0));
        label5.setEnabled(true);
        label5.setFont(new Font("sansserif",0,12));
        label5.setText("Oblibena hra:");
        label5.setVisible(true);

        label6 = new JLabel();
        label6.setBounds(8,88,90,35);
        label6.setBackground(new Color(214,217,223));
        label6.setForeground(new Color(0,0,0));
        label6.setEnabled(true);
        label6.setFont(new Font("sansserif",0,12));
        label6.setText("Aktivni hrac:");
        label6.setVisible(true);

        label7 = new JLabel();
        label7.setBounds(104,8,270,35);
        label7.setBackground(new Color(214,217,223));
        label7.setForeground(new Color(0,0,0));
        label7.setEnabled(true);
        label7.setFont(new Font("sansserif",0,12));
        label7.setText("label");
        label7.setVisible(true);

        label8 = new JLabel();
        label8.setBounds(104,24,270,35);
        label8.setBackground(new Color(214,217,223));
        label8.setForeground(new Color(0,0,0));
        label8.setEnabled(true);
        label8.setFont(new Font("sansserif",0,12));
        label8.setText("label");
        label8.setVisible(true);

        label9 = new JLabel();
        label9.setBounds(104,40,270,35);
        label9.setBackground(new Color(214,217,223));
        label9.setForeground(new Color(0,0,0));
        label9.setEnabled(true);
        label9.setFont(new Font("sansserif",0,12));
        label9.setText("label");
        label9.setVisible(true);
        
        label7.setText(data.jmeno);
        label8.setText(data.prijmeni);
        label9.setText(data.email);
        label10.setText(data.datum);
        label11.setText(data.oblibenaHra);
        label12.setText(data.aktivniEsport);
        

        //adding components to contentPane panel
        contentPane.add(label1);
        contentPane.add(label10);
        contentPane.add(label11);
        contentPane.add(label12);
        contentPane.add(label2);
        contentPane.add(label3);
        contentPane.add(label4);
        contentPane.add(label5);
        contentPane.add(label6);
        contentPane.add(label7);
        contentPane.add(label8);
        contentPane.add(label9);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu tools = new JMenu("Tools");
        JMenu help = new JMenu("Help");

        JMenuItem open = new JMenuItem("Open   ");
        JMenuItem save = new JMenuItem("Save   ");
        JMenuItem exit = new JMenuItem("Exit   ");
        JMenuItem preferences = new JMenuItem("Preferences   ");
        JMenuItem about = new JMenuItem("About   ");


        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        tools.add(preferences);
        help.add(about);

        menuBar.add(file);
                menuBar.add(tools);
        menuBar.add(help);
    }
}