package quoridor.view;
import quoridor.control.*;
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

  private JPanel modeSelectionPanel;
  private JPanel namePanel;
  private JTextField player1Field;
  private JTextField player2Field;


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
    this.buttonPanel.setLayout(new GridLayout(2, 1, 0, 100));
    this.buttonPanel.setOpaque(false);


    this.modeSelectionPanel= new JPanel();
    this.modeSelectionPanel.setOpaque(false);
    this.modeSelectionPanel.setLayout(new GridLayout(1, 2, 20, 0));
    this.HAButton = new Button("Joueur contre IA");
    this.HAButton.addActionListener(new ModeListener(this.state));
    this.HHButton = new Button("Joueur contre Joueur");
    this.HHButton.addActionListener(new ModeListener(this.state));
    this.modeSelectionPanel.add(this.HAButton);
    this.modeSelectionPanel.add(this.HHButton);


    this.namePanel = new JPanel();
    this.namePanel.setOpaque(false);
    this.namePanel.setLayout(new GridLayout(1, 2, 20, 0));
    this.player1Field = new JTextField("Nom du joueur 1");
    this.player1Field.setFont(new Font("Arial", Font.PLAIN, 35));
    this.player1Field.addCaretListener(new ModeListener(this.state));
    this.player1Field.addFocusListener(new ModeListener(this.state));

    this.player2Field = new JTextField("Nom du joueur 2");
    this.player2Field.addCaretListener(new ModeListener(this.state));
    this.player2Field.addFocusListener(new ModeListener(this.state));

    this.player2Field.setFont(new Font("Arial", Font.PLAIN, 35));
    this.namePanel.add(this.player1Field);
    this.namePanel.add(this.player2Field);

    this.buttonPanel.add(this.namePanel);
    this.buttonPanel.add(this.modeSelectionPanel);


    this.add(this.buttonPanel);
    this.add(new SpacePanel());


  }




	public Button getHAButton() {
		return this.HAButton;
	}

	public Button getHHButton() {
		return this.HHButton;
	}



	public JTextField getPlayer1Field() {
		return this.player1Field;
	}

	public JTextField getPlayer2Field() {
		return this.player2Field;
	}
}
