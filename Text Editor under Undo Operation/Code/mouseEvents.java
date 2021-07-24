import java.awt.event.MouseEvent;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class mouseEvents implements MouseListener {
	String p="";
	JTextArea a;
	JFrame f;
	public mouseEvents() {
		
	}
	public mouseEvents(JTextArea a,JFrame f) {
		this.a=a;
		this.f=f;
		f.addMouseListener(this);
	}
	
	 public void mouseClicked(MouseEvent e) {}  
	    public void mouseEntered(MouseEvent e) {}
	    public void mouseExited(MouseEvent e) {}  
	    public void mousePressed(MouseEvent e) {} 
	    public void mouseReleased(MouseEvent e) {
	    	if(a.getSelectedText()!=null) {
	    		System.out.println(p);
	        	p=a.getSelectedText();
	        }
	    }

}
