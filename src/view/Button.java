package view;
//import controller.*;
import javax.swing.*;
import java.awt.*;

public class Button extends JButton{



  public Button(String name){
    super(name);
    this.setBackground(new Color(255, 255, 255));
    this.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    this.setFont(new Font("Arial", Font.PLAIN, 60));
    //this.setPreferredSize(new Dimension(500, 150));
    this.setFocusPainted(false);
  }
}
