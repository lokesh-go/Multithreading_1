import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;
import java.awt.event.*;

public class Cricket extends JFrame implements  ActionListener 
{
	BufferedImage img[];
	Image img1;
	MediaTracker med;
	Toolkit tk;
	int i1,i2,i3,i4,i5,i6,i7,i8,j,x=40,y=200,a=330,b=440;
	MenuBar mbar;
	Menu mn;
	MenuItem m1,m2,m3;
	
	Cricket()
	{
		mbar=new MenuBar();
		setMenuBar(mbar);
		mn=new Menu("Action");
		mbar.add(mn);
		m1=new MenuItem("play");
		mn.add(m1);

		m1.addActionListener(this);

		med=new MediaTracker(this);
		tk=tk.getDefaultToolkit();
		img=new BufferedImage[2];
		img1=tk.getImage("a.jpg");
		try
		{
			img[0]=ImageIO.read(new File("bat1.gif"));
			img[1]=ImageIO.read(new File("bat2.gif"));
		}
		catch (Exception e)
		{
		}
		setSize(1368,720);
		setLayout(null);
		setVisible(true);
		}
	public void actionPerformed(ActionEvent e3)
	{
			
	}
	public void paint(Graphics g)
	{
		int i=-1,x=1020,y=250;
		
		System.out.println(x);
		super.paint(g);
		Graphics2D g2=(Graphics2D)g;
		for(;;)
		{
			try
			{
				
				i++;
				g2.drawImage(img1,0,0,this);
				//g2.fillOval(x,y,20,20);
				
				for(int m=0;m<5;m++)
				{
					g2.setColor(Color.red);
					g2.fillOval(x,y,30,30);
					Thread.sleep(50);
					x-=100;
					y+=24;
				}
				if(i==1)
				{
					g2.drawImage(img[0],10,180,this);
					g2.setColor(Color.red);
					g2.fillOval(320,390,30,30);
					i=-1;
				}
				else
				{
					g2.fillOval(390,470,30,30);
					g2.drawImage(img[1],10,180,this);
					
					//g2.drawImage(img[i],10,100,this);
				}
				Thread.sleep(1000);
			}
			catch (Exception e)
			{
			}
		}
	}
	public static void main(String[] args) 
	{
		new Cricket();
	}
}