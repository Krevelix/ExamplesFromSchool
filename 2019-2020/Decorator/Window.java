/**
 * @author Krevelix
 * @version 0.1
 * @implNote 2020 - copyright only for code not for pizza etc.
 */
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

import javax.swing.border.Border;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Random;

public class Window extends JFrame 
{
    //private JMenuBar menuBar; 
    private JButton button1;
    private JButton button2;
    private JButton[] menuButtons;
    private JPanel contentPane;
    private Ingredients[] ingredients;
    //private String[] pizzaMenu = {"Hawaii", "�umkov�", "�pen�tov�", "Tu��kov�", "An�ovi�kov�"};
    private String[][] pizzaMenu = {
            {"Hawaii", "TomatoSauce","Ham", "Ananas"}, 
            {"Sumkova", "TomatoSauce", "Ham"}, 
            {"Spenatova", "Spinach"}, 
            {"Tunakova", "Tuna", "Ham"}, 
            {"Ancovickova", "Anchovicky", "Ham"}
        };
    
    
    private Window()
    {
        this.setTitle("Italiano pizza capo :{)");
        this.setSize(864,864);
        this.setMinimumSize(new Dimension(800, 800));
        //createMenu();
        //this.setJMenuBar(menuBar);
        
        contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(800,800));
        contentPane.setBackground(new Color(192,192,192));
        
        button1 = new JButton();
        button1.setBounds(8,8,90,25);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText("Menu");
        button1.setVisible(true);
        
        button2 = new JButton();
        button2.setBounds(104,8,104,25);
        button2.setBackground(new Color(214,217,223));
        button2.setForeground(new Color(0,0,0));
        button2.setEnabled(true);
        button2.setFont(new Font("sansserif",0,12));
        button2.setText("Vlastni pizza");
        button2.setVisible(true);
        
        contentPane.add(button1);
        contentPane.add(button2);
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        vytvorUdalosti();
    }
    
    private void delelejCastPizzi(int index, String type)
    {
        ingredients[index] = new Ingredients(type, getWidth(), getHeight());
        ingredients[index].setSize(new Dimension(getHeight(), getHeight()));
        ingredients[index].setLocation(0, 0);
        ingredients[index].setLayout(null);
    }
    
    private void napisMenu()
    {
        
    }
    
    private void generatePizza(String pizzaN)
    {
        String pizza = Pizza.orderPizza(pizzaN, pizzaMenu);
        String pizzaPart = "";
        ingredients = new Ingredients[SetSize(pizza)];
        delelejCastPizzi(0, "CleanTable");
        int start = 0;
        for(int i = 1; i < ingredients.length; i++)
        {
            for(int x = start; x < pizza.length(); x++)
            { 
                if(pizza.charAt(x) == '|')
                {
                    start = pizzaPart.length() + 1 + start;
                    delelejCastPizzi(i, pizzaPart);
                    pizzaPart = "";
                    break;
                }
                pizzaPart += String.valueOf(pizza.charAt(x));
            }
        }
        delelejCastPizzi(ingredients.length - 1, pizzaPart);
        for(int y = 0; y < menuButtons.length; y++)
        {
            menuButtons[y].setVisible(false);
            menuButtons[y].setEnabled(false);
        }
        for(int in = ingredients.length - 1; in > -1; in--)
        {
        	contentPane.add(ingredients[in]);
        }
        contentPane.addComponentListener(new ComponentAdapter() 
        {
            public void componentResized(ComponentEvent e) 
            {
                for(int i = 0; i < ingredients.length; i++)
                {
                	ingredients[i].setSize(getWidth(), getHeight());
                }
            }
        });
        this.repaint();
    }
    
    private int SetSize(String text)
    {
        int size = 0;
        for(int i = 0; i < text.length(); i++)
        {
            if(text.charAt(i) == '|')
            {
                size++;
            }
        }
        return size + 2;
    }
    
    private void vytvorUdalosti()
    {
        button1.addActionListener(new ActionListener()
        {  
            public void actionPerformed(ActionEvent e)
            {  
                vytvorMenu();
            }  
        });  
        button2.addActionListener(new ActionListener()
        {  
            public void actionPerformed(ActionEvent e)
            {  
                
            }  
        });  
    }
    
    public void vytvorMenu()
    {
         menuButtons = new JButton[pizzaMenu.length];
         for(int i = 0; i < menuButtons.length; i++)
         {
             menuButtons[i] = new JButton();
             menuButtons[i].setBounds(8 * i + (i * 100) + 8, 40, 100, 100);
             menuButtons[i].setBackground(new Color(214,217,223));
             menuButtons[i].setForeground(new Color(0,0,0));
             menuButtons[i].setEnabled(true);
             menuButtons[i].setFont(new Font("sansserif",0,12));
             menuButtons[i].setText(pizzaMenu[i][0]);
             menuButtons[i].setVisible(true);
             menuButtons[i].setActionCommand(menuButtons[i].getText());
             menuButtons[i].addActionListener(new ActionListener()
                {  
                    public void actionPerformed(ActionEvent e)
                    {  
                        generatePizza(e.getActionCommand());
                    }  
                });  
             contentPane.add(menuButtons[i]);
         }
         this.repaint();
    }
    
    @SuppressWarnings("serial")
    class Ingredients extends JPanel 
    {
        private String type;
        //private Shape oval = new Ellipse2D.Float((int)((this.getHeight()/2) - ((this.getHeight() * 0.80) / 2)), (int)((this.getHeight()/2) - ((this.getHeight() * 0.80) / 2)), (int)(this.getHeight() * 0.80), (int)(this.getHeight() * 0.80));
        private int[] Xpos;
        private int[] Ypos;
        private Rectangle r;
        private int height;
        Random rand;
        public Ingredients(String type, int width, int height)
        {
            this.type = type;
            //this.height = height;
            this.setSize(new Dimension(getWidth(), getHeight()));
            Xpos = new int[6];
            Ypos = new int[6];
            rand = new Random();
            r = new Rectangle();
            r.x = (int)((this.getHeight()/2) - ((this.getHeight() * 0.80) / 2));
            System.out.println(getHeight());
            r.y = (int)((this.getHeight()/2) - ((this.getHeight() * 0.80) / 2));
            r.width = (int)(this.getHeight() * 0.80);
            r.height = (int)(this.getHeight() * 0.80);
        }
        
        public void paint(Graphics g)
        {
            Random rand = new Random();
            switch(type)
            {
                case "CleanTable": 
                    g.setColor(Color.GRAY); 
                    g.fillRect(0, 0, this.getWidth(), this.getHeight());
                break;
                case "Base":
                    //g.setColor(new Color(217, 158, 100));
                    //g.setColor(new Color(172, 88, 0));
                	g.setColor(new Color(211, 135, 64));
                    g.fillOval((int)((this.getHeight()/2) - ((this.getHeight() * 0.95) / 2)), (int)((this.getHeight()/2) - ((this.getHeight() * 0.95) / 2)), (int)(this.getHeight() * 0.95), (int)(this.getHeight() * 0.95));
                break;
                case "TomatoSauce":
                    g.setColor(Color.RED);
                    g.fillOval((int)((this.getHeight()/2) - ((this.getHeight() * 0.89) / 2)), (int)((this.getHeight()/2) - ((this.getHeight() * 0.89) / 2)), (int)(this.getHeight() * 0.89), (int)(this.getHeight() * 0.89));
                break;
                case "Ham":
                    for(int i = 0; i < 6; i++)
                    {
                    	getPos(0.23, i);
                        g.setColor(new Color(228, 145, 161));
                        g.fillOval(Xpos[i], Ypos[i], (int)(this.getHeight() * 0.23) - 100, (int)(this.getHeight() * 0.23) - 100);
                    }
                break;
                case "Cheese":
                    for(int i = 0; i < 6; i++)
                    {
                        g.setColor(Color.YELLOW);
                        g.fillOval(rand.nextInt((int)(this.getHeight() - 100 - (this.getHeight() * 0.20) - 100 - 45) + 1) + 45, rand.nextInt((int)(this.getHeight() - 100 - (this.getHeight() * 0.20) - 100 - 70) + 1) + 70, (int)(this.getHeight() * 0.20) - 100, (int)(this.getHeight() * 0.20) - 100);
                    }
                break;
                case "Pineapple":
                    for(int i = 0; i < 6; i++)
                    {
                        g.setColor(new Color(220, 202, 69));
                        g.fillRect(rand.nextInt((int)(this.getHeight() - 100 - (this.getHeight() * 0.18) - 100 - 45) + 1) + 45, rand.nextInt((int)(this.getHeight() - 100 - (this.getHeight() * 0.18) - 100 - 70) + 1) + 70, (int)(this.getHeight() * 0.18) - 100, (int)(this.getHeight() * 0.18) - 100);
                    }
                break;
            }
        }
        
        public void getPos(double scale, int index)
        {
        	int x;
        	int y;
			while(true)
			{
				x = rand.nextInt((int)(this.getHeight() - 100 - (this.getHeight() * scale) - 100 - 45) + 1) + 45;
				y = rand.nextInt((int)(this.getHeight() - 100 - (this.getHeight() * scale) - 100 - 45) + 1) + 45;
				/*System.out.println("X: " + x);
				System.out.println("Y: " + y);
				System.out.println("X2: " + r.x);
				System.out.println("Y2: " + r.y);
				*/
				if(new Rectangle(x, y, (int)(this.getHeight() * scale) - 100, (int)(this.getHeight() * scale) - 100).intersects(r))
				{
					System.out.println("OK");
					Xpos[index] = x;
					Ypos[index] = y;
					break;
				}
			}
        }
    }
    
    /*
    public void createMenu()
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
    */
    
    public static void main(String[] args)
    {
         new Window();
    }
}
