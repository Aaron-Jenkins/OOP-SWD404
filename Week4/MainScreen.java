import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.GridBagConstraints;


public class MainScreen extends JFrame {
    //Components
    private JLabel lbl_title;
    private JTextField txt_regNo;
    private JTextField txt_colour;
    private JTextField txt_make;
    private JTextField txt_model;
    private JLabel lbl_status;
    private JButton btn_add;
    private JButton btn_remove;

    private GridBagConstraints constraints;

    public MainScreen() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        constraints = new GridBagConstraints();
        initComponents();
        layoutComponents();


    }

    public void initComponents() {
        lbl_title = new JLabel("Main Screen");
        txt_regNo = new JTextField();
        txt_colour = new JTextField();
        txt_make = new JTextField();
        txt_model = new JTextField();
        lbl_status = new JLabel("Car Park has x empty spaces");
        btn_add = new JButton("Add Car");
        btn_remove = new JButton("Remove Car");
    }

    public void layoutComponents() {
        constraints.gridy = 0;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        this.add(lbl_title, constraints);

        constraints.gridy = 1;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        this.add(txt_regNo, constraints);

        constraints.gridy = 2;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        this.add(txt_colour, constraints);

    }
}






