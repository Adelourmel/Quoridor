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

    this.logoLabel = new JLabel(new ImageIcon(this.PATH+"/logoQuoridor.png"));
    this.logoLabel.setAlignmentX(CENTER_ALIGNMENT);
    this.add(this.logoLabel);
    this.descriptionLabel = new JLabel("Mode de jeu :");
    this.descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 60));
    this.descriptionLabel.setAlignmentX(CENTER_ALIGNMENT);
    this.add(this.descriptionLabel);




    this.buttonPanel = new JPanel();
    this.buttonPanel.setAlignmentX(CENTER_ALIGNMENT);
    this.buttonPanel.setLayout(new GridLayout( 2, 1, 0, 25));
    this.buttonPanel.setOpaque(false);

    this.HAButton = new Button("Joueur contre Joueur");
    this.HHButton = new Button("Joueur contre IA");


    this.buttonPanel.add(this.HAButton);
    this.buttonPanel.add(this.HHButton);
    this.add(this.buttonPanel);


  }



}
