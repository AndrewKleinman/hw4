import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Model extends JFrame{
	int x1 = 1;
	int x2 =2;
	int x3 = 3;
	int x4 =4;
	int x5 = 5;
	int x6 =6;
	 public Model() 
     {
		 JFrame graphView = new JFrame();
		 setSize(800,500);
		 graphView.setVisible(true);
		 setLocationRelativeTo(graphView);
		 this.setLocation(10, 70);
        Panel p = new Panel();
        p.setBackground(Color.BLACK);
        TextField b1 = new TextField("1");
        TextField b2 = new TextField("2");
        TextField b3 = new TextField("3");
        TextField b4 = new TextField("4");
        TextField b5 = new TextField("5");
        TextField b6 = new TextField("6");
        p.add(b1);
        b1.addTextListener(event -> {
         	x1 = Integer.parseInt(b1.getText());
         	repaint();
         });
        p.add(b2);
        b2.addTextListener(event -> {
         	x2 = Integer.parseInt(b2.getText());
         	repaint();
         });
        p.add(b3);
        b3.addTextListener(event -> {
         	x3 = Integer.parseInt(b3.getText());
         	repaint();
         });
        p.add(b4);
        b4.addTextListener(event -> {
         	x4 = Integer.parseInt(b4.getText());
         	repaint();
         });
        p.add(b5);
        b5.addTextListener(event -> {
         	x5 = Integer.parseInt(b5.getText());
         	repaint();
         });
        p.add(b6);
        b6.addTextListener(event -> {
         	x6 = Integer.parseInt(b6.getText());
         	repaint();
         });
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        graphView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
       
       graphView.add(p,BorderLayout.NORTH);
       graphView.pack();
    }
	 public void paint(Graphics g)
     {
		 
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.BLACK);
        g.fillRect(100, 100, 40*x1, 20);
        g.fillRect(100, 150, 40*x2, 20);
        g.fillRect(100, 200, 40*x3, 20);
        g.fillRect(100, 250, 40*x4, 20);
        g.fillRect(100, 300, 40*x5, 20);
        g.fillRect(100, 350, 40*x6, 20);
     }
		public static void main(String[]args)
		{
			Model p = new Model();
			p.repaint();
			
			
		}	
	
	}
