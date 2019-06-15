package view;
//import controller.*;
import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {

  private final String PATH ="../img";

  private GUI state;
  private JPanel buttonPanel;
  private Button newGameButton;
  private Button loadGameButton;
  private JLabel logoLabel;


  public  MenuPanel(GUI state){
    this.state = state;
    this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    this.setBackground(new Color(108,128,154));

    this.logoLabel = new JLabel(new ImageIcon(this.PATH+"/logoQuoridor.png"));
    this.logoLabel.setHorizontalAlignment(SwingConstants.CENTER);
    this.add(this.logoLabel);

    





    this.buttonPanel = new JPanel();
    this.buttonPanel.setAlignmentX(CENTER_ALIGNMENT);
    this.buttonPanel.setLayout(new GridLayout( 2, 1, 0, 25));
    this.buttonPanel.setOpaque(false);

    this.newGameButton = new Button("Nouvelle Partie");
    this.loadGameButton = new Button("Charger Partie");


    this.buttonPanel.add(this.newGameButton);
    this.buttonPanel.add(this.loadGameButton);
    this.add(this.buttonPanel);


  }



}
