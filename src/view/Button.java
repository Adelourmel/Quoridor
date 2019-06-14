package view;
//import controller.*;
import javax.swing.*;
import java.awt.*;

public class Button extends JButton{
  private final String PATH ="../img";


  public Button(String name){
    super(name);
    this.setBackground(new Color(255, 255, 255));
    this.setFont(new Font("Arial", Font.PLAIN, 60));
  }
}
