package quoridor.view;
//import controller.*;
import javax.swing.*;
import java.awt.*;

/**
 * DescriptionLabel Class. Create a JLabel with a predefined font and a center alignement.
 */
public class DescriptionLabel extends JLabel{


  /**
   * DescriptionLabel constructor.
   * @param name the text of the JLabel
   */
  public DescriptionLabel(String name){
    super(name);
    this.setFont(new Font("Arial", Font.PLAIN, 60));
    this.setAlignmentX(CENTER_ALIGNMENT);
  }
}
