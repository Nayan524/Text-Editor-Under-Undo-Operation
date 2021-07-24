import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Window {
	public static void main(String[] args) {
		createWindow();
		
		
		
		
	}
	public static void createWindow() {
		JFrame f=new JFrame();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Closes on clicking x button
		f.setSize(1000,500);//set size of frame
		f.setLocation(500,250);//set location of frame
		f.setTitle("Text Editor");
		
		ImageIcon i=new ImageIcon("C:\\Users\\NAYAN\\Desktop\\pen.png");
		f.setIconImage(i.getImage());
		
		Container c=f.getContentPane();
		c.setBackground(Color.WHITE);
		c.setLayout(null);
		
		f.setResizable(true);
		
		JTextArea a=new JTextArea();
		a.setSize(f.getWidth(),f.getHeight());
		a.setFont(new Font("Arial",Font.PLAIN,30));
		a.setLineWrap(true);
		//c.setBackground(Color.YELLOW);
		c.add(a);
		
		New_Window n=new New_Window(f,a);
		
		mouseEvents m=new mouseEvents(a,f);
		
	}

}
