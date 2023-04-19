import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton radio1;
    JRadioButton radio2;
    JRadioButton radio3;
    ImageIcon left;
    ImageIcon up;
    ImageIcon right;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        left = new ImageIcon("left.png");
        up = new ImageIcon("up.png");
        right = new ImageIcon("right.png");

        radio1 = new JRadioButton("Pizza");
        radio2 = new JRadioButton("Hamburger");
        radio3 = new JRadioButton("Hotdog");

        radio1.addActionListener(this);
        radio1.setIcon(left);
        radio2.addActionListener(this);
        radio2.setIcon(up);
        radio3.addActionListener(this);
        radio3.setIcon(right);

        ButtonGroup menu = new ButtonGroup();
        menu.add(radio1);
        menu.add(radio2);
        menu.add(radio3);

        this.add(radio1);
        this.add(radio2);
        this.add(radio3);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == radio1) {
            System.out.println("Pizza");
        } else if (e.getSource() == radio2) {
            System.out.println("Hamburger");
        } else if (e.getSource() == radio3) {
            System.out.println("Hotdog");
        }
    }
}
