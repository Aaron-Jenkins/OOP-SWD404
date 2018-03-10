import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class MainScreen extends JFrame implements ActionListener {
    private GridBagConstraints constraints;
    private Carpark carpark;

    //Components
    private JLabel lbl_title;
    private JLabel lbl_status;
    private JLabel lbl_regNo;
    private JLabel lbl_colour;
    private JLabel lbl_make;
    private JLabel lbl_model;
    private JTextField txt_regNo;
    private JTextField txt_colour;
    private JTextField txt_make;
    private JTextField txt_model;

    private JButton btn_add;
    private JButton btn_remove;



    public MainScreen() {
        carpark = new Carpark();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        constraints = new GridBagConstraints();
        initComponents();
        layoutComponents();

    }

    public void initComponents() {
        lbl_title = new JLabel("Main Screen");
        lbl_regNo = new JLabel("regNo:");
        lbl_status = new JLabel("Car Park has x empty spaces");
        lbl_colour = new JLabel("colour:");
        lbl_make = new JLabel("make:");
        lbl_model = new JLabel("model");
        txt_regNo = new JTextField();
        txt_colour = new JTextField();
        txt_make = new JTextField();
        txt_model = new JTextField();
        btn_add = new JButton("Add Car");
        btn_add.addActionListener(this);
        btn_remove = new JButton("Remove Car");
        btn_remove.addActionListener(this);
    }

    public void layoutComponents() {
        //Add Title Label
        constraints.gridy = 0;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        this.add(lbl_title, constraints);

        //Add regNo button + Label
        constraints.gridy = 1;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        this.add(lbl_regNo, constraints);

        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txt_regNo, constraints);

        //Add color button + Label
        constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 2;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        this.add(lbl_colour, constraints);

        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txt_colour, constraints);

        //Add make button + Label
        constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 3;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        this.add(lbl_make, constraints);

        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txt_make, constraints);

        //Add model button + label
        constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 4;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        this.add(lbl_model, constraints);

        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txt_model, constraints);

        //Add status label
        constraints.gridy = 5;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        this.add(lbl_status, constraints);

        //Add add/remove buttons
        constraints.gridy = 6;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        this.add(btn_add, constraints);

        constraints.gridx = 1;
        constraints.gridwidth = 1;
        this.add(btn_remove, constraints);
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource().equals(btn_add)) {
            String regNo = txt_regNo.getText();

            if (carpark.addCar(regNo)) {
                JOptionPane.showMessageDialog(null, "Car has been added");
            }
            else {
                JOptionPane.showMessageDialog(null, "Carpark is full");
            }
        }
        else if (ev.getSource().equals(btn_remove)) {
            String regNo = txt_regNo.getText();

            if (carpark.removeCar(regNo)) {
                JOptionPane.showMessageDialog(null, "Car Removed");
            }
            else {
                JOptionPane.showMessageDialog(null, "Car has already left!");
            }
        }
    }
}






