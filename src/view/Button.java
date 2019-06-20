package quoridor.view;
//import controller.*;
import javax.swing.*;
import java.awt.*;

public class Button extends JButton{



  public Button(String name){
    super(name);
    this.setBackground(new Color(49,130,130));
    this.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    this.setFont(new Font("Arial", Font.PLAIN, 60));

    this.setFocusPainted(false);
  }
}
