import java.awt.*;
public class abc {

    public static void main(String[] args) {
        Frame f=new Frame("layout manager");
        f.setLayout(null);
        List l=new List();
        l.setBounds(10,30,100,100);
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        l.add("e");
        f.add(l);
        f.setSize(300,300);
        f.setVisible(true);
        
        }
    }
