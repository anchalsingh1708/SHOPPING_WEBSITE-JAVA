import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 class projectlogin  implements ActionListener 
{
    JFrame frame;
    JButton b2,b1;  
    //JPanel newPanel;  
    JLabel userLabel, passLabel,background,l;  
    JTextField  textField1, textField2;  

projectlogin()
{
    
    frame = new JFrame("login");
    ImageIcon im=new ImageIcon("E:\\PILLAI COLLEGE\\SECOND YEAR SEM 4\\JAVA\\login.png");
    l =new JLabel(im);
     userLabel = new JLabel();  
    userLabel.setText("Username");      //set label value for textField1  
    userLabel.setBounds(450,30,70, 20);
    //create text field to get username from the user  
    textField1 = new JTextField(15);    //set length of the text  
    textField1.setBounds(530,30,70, 20);
    //create label for password  
    passLabel = new JLabel();  
    passLabel.setText("Password");      //set label value for textField2  
    passLabel.setBounds(450,70,70, 20);
    //create text field to get password from the user  
    textField2 = new JPasswordField();    
    textField2.setBounds(530,70,70, 20);
    //create submit button  
    b2 = new JButton("SUBMIT"); //set label to button  
    b2.setBounds(450,100,90, 20);
      l.add(userLabel);
      l.add(textField1);
      l.add(passLabel);
      l.add(b2);
      l.add(textField2);
      frame.add(l);
      b2.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) {
                   frame.dispose();
                     new projectcategory();
                    // user.showDetails();
                    //setVisible(true);
                }
            } );
              
        frame.setSize(800, 800);
              frame.setVisible(true);
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        }
        
            public static void main(String args[])
             {
                new projectlogin();
             }
        
}

