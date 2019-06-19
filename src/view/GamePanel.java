package quoridor.view;
import quoridor.control.*;
import quoridor.model.*;
import javax.swing.*;
import java.awt.*;


public class GamePanel extends JPanel {

  private GridPanel gridPanel;
  private JPanel player1Panel;
  private JLabel player1Label;

  private JPanel player2Panel;
  private JLabel player2Label;
  private JLabel wall1Label;
  private JLabel wall2Label;
  private final String PATH ="../img";
  private GUI state;
  private JButton quitButton;


  public  GamePanel(GUI state, Square[][] grid){
    this.state = state;
    this.setLayout(new BorderLayout());
    this.gridPanel = new GridPanel(this.state, grid);
    this.add(this.gridPanel);

    this.quitButton = new JButton("QUITTER");

    this.quitButton.setBackground(new Color(255, 255, 255));
    this.quitButton.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    this.quitButton.setFont(new Font("Arial", Font.PLAIN, 30));
    this.quitButton.setFocusPainted(false);
    this.state.getHeader().add(this.quitButton, BorderLayout.WEST);


    this.player1Panel = new JPanel();
    this.player1Panel.setLayout(new BoxLayout(this.player1Panel, BoxLayout.Y_AXIS));
    this.player1Panel.setBackground(new Color(90,219,255));
    this.player1Label = new JLabel("dds");

    this.player1Label.setFont(new Font("Arial", Font.PLAIN, 40));
    this.player1Panel.setAlignmentX(CENTER_ALIGNMENT);
    this.player1Panel.add(this.player1Label);
    this.player1Panel.add(new SpacePanel());
    this.wall1Label = new JLabel("Barriere Restante : 8");
    this.wall1Label.setFont(new Font("Arial", Font.PLAIN, 40));
    this.wall1Label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5, true));
    this.player1Panel.add(this.wall1Label);



    this.player2Panel = new JPanel();
    this.player2Panel.setLayout(new BoxLayout(this.player2Panel, BoxLayout.Y_AXIS));
    this.player2Panel.setBackground(new Color(90,219,255));
    this.player2Label = new JLabel("zsxw");
    this.player2Label.setFont(new Font("Arial", Font.PLAIN, 40));
    this.player2Label.setAlignmentY(CENTER_ALIGNMENT);
    this.player2Panel.add(this.player2Label);
    this.player2Panel.add(new SpacePanel());
    this.wall2Label = new JLabel("Barriere Restante : 10");
    this.wall2Label.setFont(new Font("Arial", Font.PLAIN, 40));
    this.wall2Label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5, true));
    this.player2Panel.add(this.wall2Label);

    this.add(this.player1Panel, BorderLayout.WEST);
    this.add(this.player2Panel, BorderLayout.EAST);










  }




}
