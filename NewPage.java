//import required classes and packages  
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;
  
//create NewPage class to create a new page on which user will navigate  
class NewPage  
{  
    JFrame frame;
    JButton b,b1;  
  //JPanel pn1,pn2;  
  JRadioButton rd1,rd2,rd3;
 JLabel l1,l2,l3,l4,l5,l6,l7;
  JTextField  tf1,tf2,tf3,tf4,tf5,tf6; 
  JCheckBox c1,c2,c3,c4;
  ButtonGroup bg;
  JTextArea area;
    //constructor  
    NewPage()  
    {  
l1= new JLabel("BILL CALCULATOR");
l2= new JLabel("Order no");
l3= new JLabel("Customer name");
l4= new JLabel("Quantity");
l5= new JLabel("Rate");
l6= new JLabel("Amount");
l7= new JLabel("GST");
frame.add(l1);frame.add(l2);frame.add(l3);frame.add(l4);frame.add(l5);frame.add(l6);frame.add(l7);






tf1= new JTextField();
tf2= new JTextField();
tf2.setToolTipText("Enter your name");;
tf3= new JTextField();

tf4= new JTextField();
tf5= new JTextField();
tf6= new JTextField();
frame.add(tf1);frame.add(tf2);frame.add(tf3);frame.add(tf4);frame.add(tf5);frame.add(tf6);

l1.setBounds(150, 5, 150, 50);
l2.setBounds(10, 45, 70, 30);
l3.setBounds(10, 90, 100, 30);
l4.setBounds(10, 130, 70, 30);

l5.setBounds(210, 45, 70, 20);
l6.setBounds(210, 90, 70, 20);
l7.setBounds(210, 130, 70, 20);


tf1.setBounds(100, 45, 90, 30);
tf2.setBounds(100, 90, 90, 30);
tf3.setBounds(100, 130, 90, 30);

tf4.setBounds(290, 45, 90, 30);
tf5.setBounds(290, 90, 90, 30);
tf6.setBounds(290, 135, 90, 30);



rd1=new JRadioButton(" .");
rd2=new JRadioButton(" ..");
rd3=new JRadioButton(" ...");
frame.add(rd1);
frame.add(rd2);
frame.add(rd3);

 bg= new ButtonGroup();

// pn1=new JPanel();

// pn1.add(rd2);
// pn1.add(rd3);
bg.add(rd1);
bg.add(rd2);
bg.add(rd3);
//frame.add(bg);

rd1.setBounds(10, 200, 40, 40);
rd2.setBounds(10, 250, 40, 40);
rd3.setBounds(10, 300, 40, 40);

c1=new JCheckBox("1");
c2=new JCheckBox("2");
c3=new JCheckBox("3");
c4=new JCheckBox("4");
//pn2=new JPanel();
// pn2.add(rd1);
// pn2.add(rd2);
// pn2.add(rd3);
frame.add(c1);
frame.add(c2);
frame.add(c3);
frame.add(c4);
c1.setBounds(160,200,40,40);
c2.setBounds(160,250,40,40);
c3.setBounds(160,300,40,40);


b.setBounds(10,350,170,20);
b1.setBounds(290,350,90,20);

area= new JTextArea(4,3);
area.setBounds(10,380,200,200);
frame.add(area);
frame.setLayout(null);
frame.setSize(800,800);
frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        // setDefaultCloseOperation(javax.swing.  
        // WindowConstants.DISPOSE_ON_CLOSE);  
        // setTitle("Welcome");  
        // setSize(400, 200);  


    }  

    public static void main(String args[])
     {
        new NewPage();
     }
    
}  