
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class shop implements ActionListener
{
    JFrame frame;
    JButton b,b1;
    //JPanel pn1,pn2;
    JRadioButton rd1,rd2,rd3;
    JLabel l1,l2,l3,l4,l5,l6,l7,l;
    JTextField  tf1,tf2,tf3,tf4,tf5,tf6;
    JCheckBox c1,c2,c3,c4;
    ButtonGroup bg,bg1;
    JTextArea area;
    //constructor
    shop()
    {

        frame = new JFrame("Estore.");

        b=new JButton("Generate Bill");
        b1=new JButton("Clear");
        frame.add(b);
        frame.add(b1);
        l1= new JLabel("BILL CALCULATOR");
        l1.setOpaque(true);
        l1.setBackground(Color.gray);
        l1.setForeground(Color.BLACK);
        l2= new JLabel("Order no");
        l3= new JLabel("Customer name");
        l4= new JLabel("Quantity");
        //to the right
        l5= new JLabel("Rate");
        l6= new JLabel("Amount");
        l7= new JLabel("GST");
        frame.add(l1);frame.add(l2);frame.add(l3);frame.add(l4);frame.add(l5);frame.add(l6);frame.add(l7);

        tf1= new JTextField();
        tf2= new JTextField();
        tf2.setToolTipText("Enter your name");
        tf3= new JTextField();

        tf4= new JTextField();
        tf5= new JTextField();
        tf6= new JTextField();
        frame.add(tf1);frame.add(tf2);frame.add(tf3);frame.add(tf4);frame.add(tf5);frame.add(tf6);

        l1.setBounds(150, 0, 150, 50);
        l2.setBounds(10, 50, 70, 30);
        l3.setBounds(10, 90, 100, 30);
        l4.setBounds(10, 130, 70, 30);

        l5.setBounds(210, 50, 70, 20);
        l6.setBounds(210, 90, 70, 20);
        l7.setBounds(210, 130, 70, 20);


        tf1.setBounds(100, 50, 90, 30);
        tf2.setBounds(100, 90, 90, 30);
        tf3.setBounds(100, 130, 90, 30);

        tf4.setBounds(290, 50, 90, 30);
        tf5.setBounds(290, 90, 90, 30);
        tf6.setBounds(290, 135, 90, 30);


        l=new JLabel("Size");
        l.setBounds(10, 180, 40, 40);
        frame.add(l);
        rd1=new JRadioButton("S");
        rd2=new JRadioButton("L");
        rd3=new JRadioButton("XL");
        frame.add(rd1);
        frame.add(rd2);
        frame.add(rd3);

        bg= new ButtonGroup();
        bg.add(rd1);
        bg.add(rd2);
        bg.add(rd3);

        rd1.setBounds(10, 200, 40, 40);
        rd2.setBounds(10, 250, 40, 40);
        rd3.setBounds(10, 300, 40, 40);

        c1=new JCheckBox("Cash on delivery");
        c2=new JCheckBox("Pay by card");

        frame.add(c1);
        frame.add(c2);

        c1.setBounds(160,200,150,40);
        c2.setBounds(160,250,100,40);



        b.setBounds(10,350,170,20);
        b1.setBounds(290,350,90,20);

        area = new JTextArea();
        area.setLineWrap(true);
        area.setBackground(Color.WHITE);
        area.setFont(new Font("Lucida Console", Font.PLAIN, 13));
        area.setForeground(Color.red);
        
        area.setBounds(10,380,200,200);
        frame.add(area);
        frame.setLayout(null);
        frame.setSize(800,800);
        frame.setVisible(true);
        b.addActionListener(this);
        b1.addActionListener(this);
        bg1 = new ButtonGroup();
        bg1.add(b);
        bg1.add(b1);

        frame.getContentPane().setBackground(Color.lightGray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
            int orderno= Integer.parseInt(tf1.getText());
            String custname= tf2.getText();
            int qty= Integer.parseInt(tf3.getText());
            double rate = 0;


            if (rd1.isSelected()) {
                rate = 150;
            }
            else if (rd2.isSelected()) {
                rate = 200;
            }
            else if (rd3.isSelected()) {
                rate = 300;
            }

            tf4.setText(
                    "" + rate);

            double topamt = 0;


            if (c1.isSelected()) {
                topamt = 60;
            }
            if (c2.isSelected()) {
                topamt = topamt + 0;
            }
            

            tf6.setText(
                    ""
                            + topamt);

            // Total amount is calculated
            double totalpayable
                    = (rate * qty) + topamt;
            tf5.setText("" + totalpayable);

            // Displays order details
            area
                    .setText(
                            "Hello, your Order Id is: " + orderno
                                    + "\nName: " + custname
                                    + "\nAMOUNT PAYABLE IS: " + totalpayable);
        }


        else
        {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
            tf6.setText("");
            
            rd1.setSelected(false);
            rd2.setSelected(false);
            rd3.setSelected(false);
            c1.setSelected(false);
            c2.setSelected(false);
            area.setText("");
        }
    }

    public static void main(String args[])
    {
        new shop();
    }

    

}