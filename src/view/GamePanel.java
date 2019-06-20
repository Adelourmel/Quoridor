package quoridor.view;
import quoridor.control.*;
import quoridor.model.*;
import javax.swing.*;
import java.awt.*;


public class GamePanel extends JPanel {

  private GridPanel gridPanel;
  private JPanel player1Panel;

  private JPanel player2Panel;

  private JLabel labelName1;
  private JLabel labelName2;

  private JLabel wallLabelP1;
  private JLabel wallLabelP2;

  private final String PATH ="../img";
  private GUI state;


  public  GamePanel(GUI state, Square[][] grid){
    this.state = state;
    this.setLayout(new BorderLayout());
    this.gridPanel = new GridPanel(this.state, grid);
    this.add(this.gridPanel);



    loadContent();

    this.labelName1.setForeground(new Color(255, 255, 255));


  }

  public void loadContent() {
    Player player1 = this.state.getSettings().getGame().getPlayer1();
    Player player2 = this.state.getSettings().getGame().getPlayer2();

    this.labelName2 = new JLabel();



    this.player1Panel = new JPanel();
    this.player1Panel.setLayout(new BoxLayout(this.player1Panel, BoxLayout.Y_AXIS));
    this.player1Panel.setBackground(this.state.getbackColor());

    this.labelName1 = new JLabel();
    this.labelName1.setText(player1.getPlayerName());
    this.labelName1.setFont(new Font("Arial", Font.PLAIN, 40));
    this.labelName1.setAlignmentY(CENTER_ALIGNMENT);

    this.player1Panel.add(labelName1);
    this.player1Panel.add(new SpacePanel());


    this.wallLabelP1 = new JLabel("Barriere Restante : " + player1.getWallsNb());
    this.wallLabelP1.setFont(new Font("Arial", Font.PLAIN, 40));
    this.wallLabelP1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5, true));
    this.player1Panel.add(new WallPanel(player2, this.gridPanel));







    this.player2Panel = new JPanel();
    this.player2Panel.setLayout(new BoxLayout(this.player2Panel, BoxLayout.Y_AXIS));
    this.player2Panel.setBackground(this.state.getbackColor());

    this.labelName2 = new JLabel();
    this.labelName2.setText(player2.getPlayerName());
    this.labelName2.setFont(new Font("Arial", Font.PLAIN, 40));
    this.labelName2.setAlignmentY(CENTER_ALIGNMENT);

    this.player2Panel.add(this.labelName2);
    this.player2Panel.add(new SpacePanel());

    this.wallLabelP2 = new JLabel("Barriere Restante : " + player2.getWallsNb());
    this.wallLabelP2.setFont(new Font("Arial", Font.PLAIN, 40));
    this.wallLabelP2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5, true));
    this.player2Panel.add(new WallPanel(player2, this.gridPanel));




    add(this.player1Panel, BorderLayout.WEST);
    add(this.player2Panel, BorderLayout.EAST);




  }





  public JLabel getLabelName1() {
    return this.labelName1;
  }
  public JLabel getLabelName2() {
    return this.labelName2;
  }

  public JLabel getWallLabelP1() {
    return this.wallLabelP1;
  }

  public JLabel getWallLabelP2() {
    return this.wallLabelP2;
  }

  public JPanel getGridPanel() {
    return this.gridPanel;
  }

}
