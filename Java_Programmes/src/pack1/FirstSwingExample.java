package pack1;
import javax.swing.*;  
public class FirstSwingExample {  
public static void main(String[] args) {  
JFrame f=new JFrame();//creating instance of JFrame  
          
JButton b=new JButton("Gopi");//creating instance of JButton  
b.setBounds(60,60,60, 40);//x axis, y axis, width, height  
          
f.add(b);//adding button in JFrame  
          
f.setSize(200,200);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
}  
}  