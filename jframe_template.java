import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

class temp extends JFrame implements ActionListener{
    JLabel l1;
    JButton b1;
    JTextField t1,t2;
    public temp(){
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        b1 = new JButton("Add");
        l1 = new JLabel("RESULT");
       
        add(t1);
        add(t2);
        add(b1);
        add(l1);

        b1.addActionListener(this);

        setLayout(new FlowLayout());
        setSize(400,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }

    public void actionPerformed(ActionEvent ae)
    {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        l1.setText((a+b)+"");

    } 
}
class basic1{
    public static void main(String[] args) {
        temp obj = new temp();
    }
}