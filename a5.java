import java.awt.*;

public class a5 {
    public static void main(String[] args) {
        // Create Frame
        Frame frame = new Frame("Student Registration Form");
        frame.setSize(500, 600);
        frame.setLayout(null);

        // Labels and Input Fields
        Label l1 = new Label("Name:");
        TextField t1 = new TextField(20);

        Label l2 = new Label("Email:");
        TextField t2 = new TextField(20);

        Label l3= new Label("Phone No:");
        TextField t3 = new TextField(20);

        Label l4= new Label("Password:");
        TextField t4 = new TextField(20);
        t4.setEchoChar('*'); // Hide password input

        Label l5 = new Label("Confirm Password:");
        TextField t5 = new TextField(20);
        t5.setEchoChar('*'); // Hide password input

        // Set positions for labels and input fields
        l1.setBounds(50, 70, 150, 30);
        t1.setBounds(220, 70, 200, 30);
        
        l2.setBounds(50, 120, 150, 30);
        t2.setBounds(220, 120, 200, 30);
        
        l3.setBounds(50, 170, 150, 30);
        t3.setBounds(220, 170, 200, 30);
        
        l4.setBounds(50, 220, 150, 30);
        t4.setBounds(220, 220, 200, 30);
        
        l5.setBounds(50, 270, 150, 30);
        t5.setBounds(220, 270, 200, 30);

        // Add components to the frame
        frame.add(l1);
        frame.add(t1);
        
        frame.add(l2);
        frame.add(t2);
        
        frame.add(l3);
        frame.add(t3);
        
        frame.add(l4);
        frame.add(t4);
        
        frame.add(l5);
        frame.add(t5);

        // Submit button
        Button b = new Button("Registration");
        b.setBounds(200, 320, 100, 30);
        frame.add(b);

        // Make the frame visible
        frame.setVisible(true);
    }
}