import java.util.Random;
import java.awt.*;

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