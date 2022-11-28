import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class projectcategory  implements ActionListener 
{
    JFrame frame;
    JMenuBar mb,mb2;
    JMenu m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11;
    JMenuItem m01,m02,m03,m04,m05,m06,m07,m08,m09,m010,m011,m012,m013,m014;

    ImageIcon im,im2,im3;
    projectcategory()
    {

        frame = new JFrame("Estore.");
        //Creating the MenuBar and adding components
         mb = new JMenuBar();
         m1 = new JMenu("Home");
         m2 = new JMenu("Category");
        m3 = new JMenu("Latest");
         m4 = new JMenu("Blog");
       m5 = new JMenu("Pages");
        m6 = new JMenu("Contact");
// //mb.setBounds(30, 0, 0, 0);
        mb.add(m1); mb.add(m2); mb.add(m3);mb.add(m4);mb.add(m5); mb.add(m6);
//         //Home 
          m01 = new JMenuItem("Men");
         m02 = new JMenuItem("Women");
          m03 = new JMenuItem("Kids");
          m04 = new JMenuItem("Accessories");
         m05 = new JMenuItem("Home Furnishing");
          m06 = new JMenuItem("Sports");
          m07 = new JMenuItem("Brands");
         m1.add(m01);m1.add(m02);m1.add(m03);m1.add(m04);m1.add(m05);m1.add(m06);m1.add(m07);
         //Category
          m08 = new JMenuItem("New In");
          m09 = new JMenuItem("Clothing");
          m010 = new JMenuItem("Shoes");
         m011 = new JMenuItem("Jewellery");
          m012 = new JMenuItem("Beauty");
          m013 = new JMenuItem("Sunglasses");
         m014= new JMenuItem("Watches");
         m2.add(m08);m2.add(m09);m2.add(m010);m2.add(m011);m2.add(m012);m2.add(m013);m2.add(m014);


//CREATING 2ND MENUBAR
         mb2 = new JMenuBar();
         m7 = new JMenu("My Account");
         m8 = new JMenu("Wish List");
         m9= new JMenu("Shopping");
        m10 = new JMenu("Cart");
       m11 = new JMenu("Checkout");
        mb2.add(m7);mb2.add(m8);mb2.add(m9); mb2.add(m10); mb2.add(m11);
         frame.getContentPane().add(BorderLayout.NORTH, mb);
         frame.getContentPane().add(BorderLayout.SOUTH, mb2);


         JPanel panel = new JPanel(); 
    panel.setBackground(Color.BLACK); 
    ImageIcon icon = new ImageIcon("E:\\PILLAI COLLEGE\\SECOND YEAR SEM 4\\JAVA\\womensec.png");
    ImageIcon icon1 = new ImageIcon("E:\\PILLAI COLLEGE\\SECOND YEAR SEM 4\\JAVA\\mensec.png");
    //ImageIcon icon2 = new ImageIcon("E:\\PILLAI COLLEGE\\SECOND YEAR SEM 4\\JAVA\\kidssec.png");
    //JLabel label = new JLabel(); 
    JLabel label1 = new JLabel(); 
    JLabel label2 = new JLabel(); 
    JLabel label7 = new JLabel("WINTER SHOP ONLINE ONLY "); 
    JLabel label3 = new JLabel("WOMEN SECTION"); 
    JLabel label4 = new JLabel(" MEN SECTION"); 
    //JLabel label5 = new JLabel(" KIDS SECTION"); 
    JButton b = new JButton("NEXT PAGE"); 
    label3.setForeground (Color.white);
    label4.setForeground (Color.white);
   // label5.setForeground (Color.white);
    //label6.setForeground (Color.white);
    label7.setForeground (Color.white);
    label7.setFont(new Font("Verdana",Font.ROMAN_BASELINE, 35));
    
    //label.setIcon(icon2); 
    label1.setIcon(icon); 
    label2.setIcon(icon1);
    panel.add(label7);
    panel.add(label2);
    panel.add(label1);
    //panel.add(label);
    panel.add(b);
    panel.add(label3);
    panel.add(label4);
   // panel.add(label5);
    //panel.add(label6);
    frame.getContentPane().add(panel); 
    b.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e) {
                     frame.dispose();
                       new shop();
                      
                  }
              } );
      frame.setSize(500,500);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
public static void main(String args[])
    {
      new projectcategory();
    }
}
