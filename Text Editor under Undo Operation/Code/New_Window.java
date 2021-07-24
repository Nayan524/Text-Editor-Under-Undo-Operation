import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class New_Window implements ActionListener,KeyListener,MouseListener,ItemListener {
	JMenuBar b;JFrame f1;
	JMenu m,m1;
	JMenuItem i1,i2,i3,i4,k1,k2,k3,k4,size,j1;
	JTextField g1,g2;
	String p="";
	JTextArea a;JComboBox<String> c1;
	Stack d;static String original="",original1="";String copy="";String p2,copied;int r;
	public static int decision=0; 
	public New_Window() {
		
	}
	public New_Window(JFrame f,JTextArea a) {
		f1=f;
		this.a=a;
		b=new JMenuBar();
		m=new JMenu("File");
		i1=new JMenuItem("New");
		i2=new JMenuItem("Open");
		i3=new JMenuItem("Save");
		i4=new JMenuItem("Exit");
		m.add(i1);
		m.add(i2);
		m.add(i3);
		m.add(i4);
		b.add(m);
		f.setJMenuBar(b);
		
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
		i4.addActionListener(this);
		
		a.addKeyListener(this);
		a.addMouseListener(this);
		
		JMenu m1=new JMenu("Edit");
		k1=new JMenuItem("Undo");
		k2=new JMenuItem("Cut");
		k3=new JMenuItem("Copy");
		k4=new JMenuItem("Paste");
		m1.add(k1);
		m1.add(k2);
		m1.add(k3);
		m1.add(k4);
		b.add(m1);
		f.setJMenuBar(b);
		k1.addActionListener(this);
		k2.addActionListener(this);
		k3.addActionListener(this);
		k4.addActionListener(this);
		
		JMenu m2=new JMenu("Format");
		size=new JMenuItem("Font size");
		
		m2.add(size);
		b.add(m2);
		size.addActionListener(this);
		
		JMenu m3=new JMenu("Help");
		b.add(m3);
		j1=new JMenuItem("About Text Editor");
		j1.addActionListener(this);
		m3.add(j1);
		d=new Stack(100);
		 
		
		
	}
	
	public void actionPerformed(ActionEvent e){
		File selectedFile=null;
		if(e.getSource()==i1) {
			Window.createWindow();
		}
		if(e.getSource()==i2){
			JFileChooser fileChooser = new JFileChooser();
		//	fileChooser.setCurrentDirectory(new File(System.getProperty("D:\\DSA")));
			int result = fileChooser.showOpenDialog(f1);
			if (result == JFileChooser.APPROVE_OPTION) {
			    selectedFile = fileChooser.getSelectedFile();
			    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
			}
			try {
				Desktop desktop = Desktop.getDesktop();
				desktop.open(selectedFile);
			}
			catch(Exception e1) {
				
			}	
		}
		if(e.getSource()==i3) {
			JFileChooser fileChooser = new JFileChooser();
			//	fileChooser.setCurrentDirectory(new File(System.getProperty("D:\\DSA")));
				int result = fileChooser.showSaveDialog(f1);
				if (result == JFileChooser.APPROVE_OPTION) {
				    selectedFile = fileChooser.getSelectedFile();
				    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
				
				}
					
			
		}
		if(e.getSource()==i4) {
			f1.dispose();
		}
		
		if(e.getSource()==k1) {
			if(decision==2) {
				String p1=d.pop();
				int y=original.indexOf(p1);
				//if(y==0)
					//a.setText(p1+a.getText());
				//else {
					//String text=original.substring(0,y)+original.substring(y);
					//a.setText(text);
				char d[]=original.toCharArray();
				char d1[]=new char[d.length];
				for(int j=0;j<original1.length();j++)
					d1[j]=d[j];
				
					for(int i=0;i<original.length();i++) {
						if(d[i]!=d1[i]){
							String text1=original.substring(0,i)+original.substring(i);
							a.setText(text1);
							
						}
					}
				//}
					
			}
			if(decision==3) {
				a.setText(original);
			}
			if(decision==1) {
				a.setText(original);
			}
			
			
			
		}
		if(e.getSource()==k2) {
			decision=1;
			if(a.getSelectedText()!=null) {
				
	        	p2=a.getSelectedText();
	        	r=a.getText().indexOf(p2);
	        	a.setText(a.getText().replace(p2, ""));
	        	
	        }
		}
		if(e.getSource()==k3) {
			if(a.getSelectedText()!=null) {
	        	copy=a.getSelectedText();	
	        	
	        }
		}
		if(e.getSource()==k4) {
			a.setText(a.getText()+copy);
			decision=3;
		}
		if(e.getSource()==size) {
		
			String size=JOptionPane.showInputDialog(f1,"Enter size");
			int u=Integer.parseInt(size);
			a.setFont(new Font("Arial",Font.PLAIN,u));
			
		}
		if(e.getSource()==j1) {
			JOptionPane.showMessageDialog(f1, "A simple Text Editor");
		}
		
	}
	public void keyPressed(KeyEvent e) {  
		original=a.getText();
		System.out.println(original);
         
    }  
	public void keyReleased(KeyEvent e) {  
		 if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE)
		    {  
			 d.push(p);
			 original1=a.getText();
			 decision=2;
		    }	 
    }  
    public void keyTyped(KeyEvent e) {  
        
    }  
    public void mouseEntered(MouseEvent e) {}
    public void mouseClicked(MouseEvent e){	
    }
    public void mouseExited(MouseEvent e) {}  
    public void mousePressed(MouseEvent e) {
    } 
    public void mouseReleased(MouseEvent e) {
    	if(a.getSelectedText()!=null) {
        	p=a.getSelectedText();
        }
    }
    public void itemStateChanged(ItemEvent e) {
    	if(e.getSource()==c1) {
    		//if(a.getSelectedText()!=null) {
	        	//String selected=a.getSelectedText();
	        	//a.setFont(new Font("Arial",Font.PLAIN,Integer.parseInt((String)c1.getSelectedItem())));
	        	
	        //}
    		
    	}
    }
   
	

}
