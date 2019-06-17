package quoridor.view;
//import controller.*;
import javax.swing.*;
import java.awt.*;

public class DescriptionLabel extends JLabel{



  public DescriptionLabel(String name){
    super(name);
    this.setFont(new Font("Arial", Font.PLAIN, 60));
    this.setAlignmentX(CENTER_ALIGNMENT);
  }
}
