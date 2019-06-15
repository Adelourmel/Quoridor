package view;
//import controller.*;
import javax.swing.*;
import java.awt.*;

public class ModePanel extends JPanel {

  private final String PATH ="../img";

  private GUI state;
  private JPanel buttonPanel;
  private Button HAButton;
  private Button HHButton;
  private JLabel logoLabel;
  private JLabel descriptionLabel;


  public  ModePanel(GUI state){

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



    this.buttonPanel = new JPanel();
    this.buttonPanel.setAlignmentX(CENTER_ALIGNMENT);


    this.buttonPanel.setLayout(new BoxLayout( this.buttonPanel, BoxLayout.Y_AXIS));
    this.buttonPanel.setOpaque(false);

    this.descriptionLabel = new JLabel("Mode de jeu :");
    this.descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 60));
    this.descriptionLabel.setAlignmentX(CENTER_ALIGNMENT);
    this.buttonPanel.add(this.descriptionLabel);

    this.HAButton = new Button("Joueur contre IA");
    this.HHButton = new Button("Joueur contre Joueur");

    this.HHButton.setAlignmentX(CENTER_ALIGNMENT);
    this.HAButton.setAlignmentX(CENTER_ALIGNMENT);



    this.buttonPanel.add(new SpacePanel());
    this.buttonPanel.add(this.HAButton);
    this.buttonPanel.add(new SpacePanel());
    this.buttonPanel.add(this.HHButton);
    this.buttonPanel.add(new SpacePanel());
    this.add(this.buttonPanel);


  }



}
