package view;
//import controller.*;
import javax.swing.*;
import java.awt.*;

public class LoadSavePanel extends JPanel {

  private final String PATH ="../img";

  private GUI state;

  private JLabel logoLabel;

  private JLabel descriptionLabel;


  public  LoadSavePanel(GUI state){
    this.state = state;
    this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    this.setBackground(new Color(108,128,154));



    ImageIcon imageIcon = new ImageIcon(this.PATH+"/logoQuoridor.png"); // load the image to a imageIcon
    Image image = imageIcon.getImage(); // transform it
    Image newimg = image.getScaledInstance(800, 500,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
    imageIcon = new ImageIcon(newimg);
    this.logoLabel = new JLabel(imageIcon);
    this.logoLabel.setAlignmentX(CENTER_ALIGNMENT);
    this.add(this.logoLabel);



    this.descriptionLabel = new JLabel("Charger une partie :");
    this.descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 60));
    this.descriptionLabel.setAlignmentX(CENTER_ALIGNMENT);
    this.add(this.descriptionLabel);










  }



}
