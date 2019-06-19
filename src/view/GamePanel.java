package quoridor.view;
import quoridor.control.*;
import quoridor.model.*;
import javax.swing.*;
import java.awt.*;


public class GamePanel extends JPanel {

  private GridPanel gridPanel;
  private JPanel player1Panel;

  private JPanel player2Panel;

  private final String PATH ="../img";
  private GUI state;



  public  GamePanel(GUI state, Square[][] grid){
    this.state = state;
    this.setLayout(new BorderLayout());
    this.gridPanel = new GridPanel(this.state, grid);
    this.add(this.gridPanel);


    Player player1 = this.state.getSettings().getGame().getPlayer1();
    Player player2 = this.state.getSettings().getGame().getPlayer2();

    this.player1Panel = createSide(player1);

    this.player2Panel = createSide(player2);


    add(this.player1Panel, BorderLayout.WEST);
    add(this.player2Panel, BorderLayout.EAST);

  }


  private JPanel createSide(Player player) {

    JPanel ret = new JPanel();
    ret.setLayout(new BoxLayout(ret, BoxLayout.Y_AXIS));
    ret.setBackground(new Color(90,219,255));

    JLabel label = new JLabel(player.getPlayerName());
    label.setFont(new Font("Arial", Font.PLAIN, 40));
    label.setAlignmentY(CENTER_ALIGNMENT);
    ret.add(label);
    ret.add(new SpacePanel());

    JLabel wallLabel = new JLabel("Barriere Restante : " + player.getWallsNb());
    wallLabel.setFont(new Font("Arial", Font.PLAIN, 40));
    wallLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5, true));
    ret.add(wallLabel);

    return ret;
  }


}
