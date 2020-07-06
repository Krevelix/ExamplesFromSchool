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
import org.jdesktop.swingx.*;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.text.DateFormat;

public class Window extends JFrame 
{
    private JMenuBar menuBar;
    private JButton button1;
    private JComboBox combobox1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JRadioButton radiobutton1;
    private JRadioButton radiobutton2;
    private JTextField textfield1;
    private JTextField textfield2;
    private JTextField textfield3;
    private JTextField textfield4;
    private org.jdesktop.swingx.JXDatePicker picker;

    //Constructor 
    public Window()
    {
        this.setTitle("Window");
        this.setSize(496,300);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);
        setResizable(false);
        
        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(496,300));
        contentPane.setBackground(new Color(192,192,192));
        
        button1 = new JButton();
        button1.setBounds(8,256,90,30);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText("OK");
        button1.setVisible(true);

        combobox1 = new JComboBox();
        combobox1.setBounds(8,155,133,25);
        combobox1.setBackground(new Color(214,217,223));
        combobox1.setForeground(new Color(0,0,0));
        combobox1.setEnabled(true);
        combobox1.setFont(new Font("sansserif",0,12));
        combobox1.setVisible(true);
        setCombobox();

        label1 = new JLabel();
        label1.setBounds(8,8,90,35);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("sansserif",0,12));
        label1.setText("Jmeno");
        label1.setVisible(true);

        label2 = new JLabel();
        label2.setBounds(8,35,90,35);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("sansserif",0,12));
        label2.setText("Prijmeni");
        label2.setVisible(true);

        label3 = new JLabel();
        label3.setBounds(8,60,90,35);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(0,0,0));
        label3.setEnabled(true);
        label3.setFont(new Font("sansserif",0,12));
        label3.setText("Email");
        label3.setVisible(true);

        label4 = new JLabel();
        label4.setBounds(8,87,184,24);
        label4.setBackground(new Color(214,217,223));
        label4.setForeground(new Color(0,0,0));
        label4.setEnabled(true);
        label4.setFont(new Font("sansserif",0,12));
        label4.setText("Jste aktivni Esportovec?");
        label4.setVisible(true);

        label5 = new JLabel();
        label5.setBounds(8,130,130,33);
        label5.setBackground(new Color(214,217,223));
        label5.setForeground(new Color(0,0,0));
        label5.setEnabled(true);
        label5.setFont(new Font("sansserif",0,12));
        label5.setText("Vase oblibena hra?");
        label5.setVisible(true);

        radiobutton1 = new JRadioButton();
        radiobutton1.setBounds(8,105,90,35);
        radiobutton1.setBackground(new Color(192,192,192));
        radiobutton1.setForeground(new Color(0,0,0));
        radiobutton1.setEnabled(true);
        radiobutton1.setFont(new Font("sansserif",0,12));
        radiobutton1.setText("Ano");
        radiobutton1.setVisible(true);

        radiobutton2 = new JRadioButton();
        radiobutton2.setBounds(98,105,90,35);
        radiobutton2.setBackground(new Color(192,192,192));
        radiobutton2.setForeground(new Color(0,0,0));
        radiobutton2.setEnabled(true);
        radiobutton2.setFont(new Font("sansserif",0,12));
        radiobutton2.setText("Ne");
        radiobutton2.setVisible(true);

        textfield1 = new JTextField();
        textfield1.setBounds(61,12,133,25);
        textfield1.setBackground(new Color(255,255,255));
        textfield1.setForeground(new Color(0,0,0));
        textfield1.setEnabled(true);
        textfield1.setFont(new Font("sansserif",0,12));
        textfield1.setText("Zde napiste jmeno");
        textfield1.setVisible(true);

        textfield2 = new JTextField();
        textfield2.setBounds(61,38,133,25);
        textfield2.setBackground(new Color(255,255,255));
        textfield2.setForeground(new Color(0,0,0));
        textfield2.setEnabled(true);
        textfield2.setFont(new Font("sansserif",0,12));
        textfield2.setText("Zde napiste prijmeni");
        textfield2.setVisible(true);

        textfield3 = new JTextField();
        textfield3.setBounds(61,64,133,25);
        textfield3.setBackground(new Color(255,255,255));
        textfield3.setForeground(new Color(0,0,0));
        textfield3.setEnabled(true);
        textfield3.setFont(new Font("sansserif",0,12));
        //textfield3.setText("yourAdress@yourEmail.com");
        textfield3.setText("Zde napiste email");
        textfield3.setVisible(true);
        
        label6 = new JLabel();
        label6.setBounds(8,175,145,33);
        label6.setBackground(new Color(214,217,223));
        label6.setForeground(new Color(0,0,0));
        label6.setEnabled(true);
        label6.setFont(new Font("sansserif",0,12));
        label6.setText("Uvedte vasi oblibenou hru:");
    
        textfield4 = new JTextField();
        textfield4.setBounds(8,205,133,25);
        textfield4.setBackground(new Color(255,255,255));
        textfield4.setForeground(new Color(0,0,0));
        textfield4.setEnabled(true);
        textfield4.setFont(new Font("sansserif",0,12));
        textfield4.setText("Vase oblibena hra");
        setJinaHraVisibility(false);
        
        picker = new org.jdesktop.swingx.JXDatePicker();
        picker.setBackground(Color.BLUE);
        picker.setDate(Calendar.getInstance().getTime());
        picker.setFormats(new SimpleDateFormat("dd.MM.yyyy")); //$NON-NLS-1$
        picker.setBounds(200,35,200,40);
        picker.setVisible(true);
        
        label7 = new JLabel();
        label7.setBounds(200,8,270,33);
        label7.setBackground(new Color(214,217,223));
        label7.setForeground(new Color(0,0,0));
        label7.setEnabled(true);
        label7.setFont(new Font("sansserif",0,12));
        label7.setText("Kdy jste zacal/zacnete hrat?");
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(radiobutton1);
        bg.add(radiobutton2);
        
        combobox1.addActionListener (new ActionListener () 
        {
            public void actionPerformed(ActionEvent e) 
            {
                CBCheck(e);
            }
        });
        
        button1.addActionListener(new ActionListener()
        {  
            public void actionPerformed(ActionEvent e)
            {  
                presunData();
            }  
        });  
        
        //adding components to contentPane panel
        contentPane.add(button1);
        contentPane.add(combobox1);
        contentPane.add(label1);
        contentPane.add(label2);
        contentPane.add(label3);
        contentPane.add(label4);
        contentPane.add(label5);
        contentPane.add(radiobutton1);
        contentPane.add(radiobutton2);
        contentPane.add(textfield1);
        contentPane.add(textfield2);
        contentPane.add(textfield3);
        contentPane.add(label6);
        contentPane.add(textfield4);
        contentPane.add(picker);
        contentPane.add(label7);;
       
        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
    
    private void CBCheck(ActionEvent e)
    {
        if(combobox1.getSelectedItem().equals("Jiná"))
        {
            setJinaHraVisibility(true);
        }
        else
        {
            setJinaHraVisibility(false);
        }
    }
    
    private boolean RBCheck()
    {
        if(radiobutton1.isSelected())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    private String getDate()
    {
        JFormattedTextField editor = picker.getEditor();
        Date dateInDatePicker = (Date) editor.getValue();
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        return df.format(dateInDatePicker);
    }
   
    private void setCombobox()
    {
        combobox1.addItem("CS:GO");
        combobox1.addItem("CS 1.6");
        combobox1.addItem("Team Fortress 2");
        combobox1.addItem("Dota 2");
        combobox1.addItem("World of Tanks");
        combobox1.addItem("Half life");
        combobox1.addItem("Half life 2");
        combobox1.addItem("Portal");
        combobox1.addItem("Portal 2");
        combobox1.addItem("Left 4 dead");
        combobox1.addItem("Left 4 dead 2");
        combobox1.addItem("Jiná"); 
        combobox1.addItem("Žádná");
    }
    
    private void presunData()
    {
        String pomocny = "";
        String pomocny2 = "";
        if(RBCheck())
        {
            pomocny = "True";
        }
        else
        {
            pomocny = "False";
        }
        if(combobox1.getSelectedItem().equals("Jiná"))
        {
            pomocny2 = textfield4.getText();
        }
        else
        {
            pomocny2 = (String)combobox1.getSelectedItem();
        }
        vystupniForm vf = new vystupniForm(new Prepravka(textfield1.getText(), textfield2.getText(), textfield3.getText(), pomocny2, pomocny, getDate()));
    }
    
    private void setJinaHraVisibility(boolean visible)
    {
        label6.setVisible(visible);
        textfield4.setVisible(visible);
    }
    
    //method for generate menu
    public void generateMenu()
    {
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

     public static void main(String[] args)
     {
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Window();
            }
        });
    }
}