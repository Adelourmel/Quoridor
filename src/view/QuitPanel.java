package quoridor.view;
import quoridor.control.*;
import javax.swing.*;
import java.awt.*;

/**
 * QuitPanel Class. Allows to quit or  quit and save the game
 */
public class QuitPanel extends JPanel {

  private final String PATH ="../img";

  private GUI state;
  private JPanel buttonPanel;
  private Button saveButton;
  private Button quitButton;
  private JLabel logoLabel;




  /**
   * QuitPanel constructor
   * @param state the JFrame
   */
  public  QuitPanel(GUI state){

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

    this.saveButton = new Button("Sauvegarder et quitter");
    this.saveButton.addActionListener(new QuitListener(this.state));
    this.quitButton = new Button("Quitter");
    this.quitButton.addActionListener(new QuitListener(this.state));

    this.quitButton.setAlignmentX(CENTER_ALIGNMENT);
    this.saveButton.setAlignmentX(CENTER_ALIGNMENT);



    this.buttonPanel.add(new SpacePanel());
    this.buttonPanel.add(this.saveButton);


    this.buttonPanel.add(new SpacePanel());
    this.buttonPanel.add(this.quitButton);

    this.buttonPanel.add(new SpacePanel());
    this.add(this.buttonPanel);




  }

  /**
   * get the QuitButton
   * @return return the QuitButtono
   */
  public Button getQuitButton(){
    return this.quitButton;
  }

  /**
   * get the SaveButton
   * @return the SaveButton
   */
  public Button getSaveButton(){
    return this.saveButton;
  }





}
