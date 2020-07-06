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
import javax.swing.table.DefaultTableModel;

public class GUI_project extends JFrame 
{
    private JMenuBar menuBar;
    private JButton button1;
    private JComboBox combobox1;
    private JLabel label1;
    private JTable table;
    private JPanel contentPane;

    //Constructor 
    public GUI_project()
    {
        this.setTitle("GUI_project");
        this.setSize(500,400);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(192,192,192));
        
        button1 = new JButton();
        button1.setBounds(220,8,90,35);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText("OK");
        button1.setVisible(true);

        String[] obsah = {"Žánr","Kapela","Album","Pisen","Vše"};
        combobox1 = new JComboBox(obsah);
        combobox1.setBounds(60,8,155,35);
        combobox1.setBackground(new Color(214,217,223));
        combobox1.setForeground(new Color(0,0,0));
        combobox1.setEnabled(true);
        combobox1.setFont(new Font("sansserif",0,12));
        combobox1.setVisible(true);

        label1 = new JLabel();
        label1.setBounds(8,8,90,35);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("sansserif",0,12));
        label1.setText("Vypsat");
        label1.setVisible(true);
        //adding components to contentPane panel
        contentPane.add(button1);
        contentPane.add(combobox1);
        contentPane.add(label1);
        vytvorUdalosti();
        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
    
    private void generujTabulku(String[] columName)
    {
        String[][] pole = new String[1][SQLite.dt.getSize()];
        DefaultTableModel model = new DefaultTableModel();
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setHorizontalScrollBarPolicy(
        JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        for(int i = 0; i < SQLite.dt.getSize(); i++)
        {
            pole[0][i] = SQLite.dt.get(i);
        }
        table = new JTable(pole, columName); 
        table.setBounds(8, 64, 200, 300);
        contentPane.add(table);
    }
    
    private void vytvorUdalosti()
    {
        button1.addActionListener(new ActionListener()
        {  
            public void actionPerformed(ActionEvent e)
            {  
                SQLite.connect();
                String[] vyber = new String[4];
                vyber[0] = "Žánr";
                vyber[1] = "Kapela";
                vyber[2] = "Album";
                vyber[3] = "Pisen";
                switch(combobox1.getSelectedIndex())
                {
                    case 0: SQLite.showTableData("Žánr"); break;
                    case 1: SQLite.showTableData("Kapela"); break;
                    case 2: SQLite.showTableData("Album"); break;
                    case 3: SQLite.showTableData("Pisen"); break;    
                    default: SQLite.selectAll(); break; 
                }
            }  
        });  
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
                new GUI_project();
            }
        });
    }
}