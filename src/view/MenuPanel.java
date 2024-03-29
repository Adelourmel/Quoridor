package quoridor.view;

import quoridor.control.*;
import javax.swing.*;
import java.awt.*;

/**
 * This class display the menu
 */
public class MenuPanel extends JPanel {

  private final String PATH ="/img";

  private GUI state;
  private JPanel buttonPanel;
  private Button newGameButton;
  private Button loadGameButton;
  private JLabel logoLabel;


/**
 * Constructor
 * @param state the gui
 */
  public  MenuPanel(GUI state){
    this.state = state;
    this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    this.setBackground(state.getbackColor());



    ImageIcon imageIcon = new ImageIcon(this.getClass().getResource(this.PATH + "/logoQuoridor.png")); // load the image to a imageIcon
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

    this.newGameButton = new Button("Nouvelle Partie");
    this.newGameButton.addActionListener(new MenuListener(this.state));
    this.loadGameButton = new Button("Charger Partie");
    this.loadGameButton.addActionListener(new MenuListener(this.state));

    this.loadGameButton.setAlignmentX(CENTER_ALIGNMENT);
    this.newGameButton.setAlignmentX(CENTER_ALIGNMENT);



    this.buttonPanel.add(new SpacePanel());
    this.buttonPanel.add(this.newGameButton);

    this.buttonPanel.add(new SpacePanel());
    this.buttonPanel.add(this.loadGameButton);

    this.buttonPanel.add(new SpacePanel());
    this.add(this.buttonPanel);


  }


  /**
   * get the NewGame button
   * @return the NewGame button
   */
	public Button getNewGameButton() {
		return this.newGameButton;
	}

  /**
   * get the LoadGame button
   * @return LoadGame button
   */
	public Button getLoadGameButton() {
		return this.loadGameButton;
	}


}
