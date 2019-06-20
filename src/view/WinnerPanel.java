package quoridor.view;
import quoridor.control.*;
import javax.swing.*;
import java.awt.*;

/**
 * WinnerPannel Class. Display the winner of the game
 */
public class WinnerPanel extends JPanel {

  private final String PATH ="../img";

  private GUI state;
  private JPanel buttonPanel;
  private Button saveButton;
  private Button quitButton;
  private JLabel logoLabel;
  private JLabel winnerLabel;




  /**
   * WinneerPanel constructor
   * @param state the JFrame
   */
  public  WinnerPanel(GUI state){

    this.state = state;
    this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    this.setBackground(new Color(115,192,186));

    ImageIcon imageIcon = new ImageIcon(this.PATH+"/368.jpg"); // load the image to a imageIcon
    Image image = imageIcon.getImage(); // transform it
    Image newimg = image.getScaledInstance(600, 600,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
    imageIcon = new ImageIcon(newimg);
    this.logoLabel = new JLabel(imageIcon);

    this.logoLabel.setAlignmentX(CENTER_ALIGNMENT);
    this.add(this.logoLabel);


    this.winnerLabel = new JLabel("Le gagnant est");
    this.winnerLabel.setForeground(new Color(33,33,33));
    this.winnerLabel.setFont(new Font("Arial", Font.PLAIN, 100));
    this.winnerLabel.setVerticalAlignment(SwingConstants.CENTER);
    this.winnerLabel.setHorizontalAlignment(SwingConstants.CENTER);

    this.winnerLabel.setAlignmentX(CENTER_ALIGNMENT);
    this.add(this.winnerLabel);








  }


  public JLabel getWinnerLabel(){
    return this.winnerLabel;
  }




}
