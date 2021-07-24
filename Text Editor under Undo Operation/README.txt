Window Class: 
	 This is Driver Class . It has main method which calls createWindow() method .
    public static void createWindow() - This method is used to create Text Editor window.

New_Window Class:
	When this class is instantiated it creates Menubar and Menuitems . This         class implementsActionListener,KeyListener,MouseListener,ItemListener.

    public void actionPerformed(ActionEvent e):This method is responsible for performing Undo operation and other functionalities such as Copy,Paste,Cut,Change Size of Text .

mouseEvents class:
	This class implements MouseListener and therefore overrides the functions . 

        public void mouseReleased(Event e):This method is used to get selected text from text editor.
Stack Class:
	This class is used to perform stack operations such as push(String a),pop(),isEmpty().When an event such as backspace key is pressed the selected text is pushed on top of the stack and when Undo button is clicked it ,the text appears again by calling pop() method .
	public void push(String x):This is used to push selected Text.
	public String pop():This method is used to remove item from top of the stack.
	public boolean isEmpty():This method is used to check if stack is empty or not. 
Steps to run the program:
	1.Open Command prompt on Windows and change directory to where executable file is present.
	2.Type java -jar TextEditor.jar
	3.Text Editor window will open .

