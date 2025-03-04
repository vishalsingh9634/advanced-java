import java.awt.*;
class a4
{
	public static void main (String a[]) 
	{ 
		Frame f=new Frame(); 
		f.setVisible(true); 
		f.setSize(300,300);

		GridLayout g = new GridLayout(2,2);
		f.setLayout(g);

		Button b1=new Button("1"); 
		Button b2=new Button("2"); 
		Button b3=new Button("3"); 
		Button b4=new Button("4"); 

		f.add(b1);  f.add(b2);
		f.add(b3);  f.add(b4);
	} 
}