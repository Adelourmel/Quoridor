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
    this.add(this.logoLabel);
    




    this.buttonPanel = new JPanel();
    this.buttonPanel.setLayout(new BoxLayout(this.buttonPanel, BoxLayout.X_AXIS));

    this.newGameButton = new Button("Nouvelle Partie");
    this.loadGameButton = new Button("Charger Partie");


    this.buttonPanel.add(this.newGameButton);

    this.buttonPanel.add(this.loadGameButton);

    this.add(this.buttonPanel);


  }



}
