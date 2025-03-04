import java.awt.*;
public class ab {

    public static void main(String[] args) {
        Frame f=new Frame("layout manager");
        f.setLayout(null);
        Button b1=new Button("1");
        Button b2=new Button("2");
        Button b3=new Button("3");
        Button b4=new Button("4");
        Button b5=new Button("5");
        b1.setBounds(50,30,40,30);
        b2.setBounds(100,30,40,30);
        b4.setBounds(150,30,40,30);
        b3.setBounds(200,30,40,30);
        b5.setBounds(250,30,40,30);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.setSize(400,400);
        f.setVisible(true);
        }
    }
