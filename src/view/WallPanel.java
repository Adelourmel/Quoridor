package quoridor.view;

import java.awt.*;
import javax.swing.JPanel;
import quoridor.model.Player;
import javax.swing.BorderFactory;

public class WallPanel extends JPanel {

  Player player;
  GridPanel gridGUI;

  public WallPanel(Player player, GridPanel grid) {
    this.player = player;
    this.gridGUI = grid;
  }


  protected void paintComponent(Graphics grphcs) {
    super.paintComponent(grphcs);
    Graphics2D g2d = (Graphics2D) grphcs;
    this.setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
    g2d.setColor(new Color(100,100,170));

    drawShape(g2d);

  }


  private void drawShape(Graphics2D g2d) {
    int posY = 0;
    int p;
    for (int i = 0 ; i < player.getWallsNb() ; i++) {
      if (i >= 5) {
        p = i - 5;
        posY = this.gridGUI.getWidthWall() + this.gridGUI.getSizeSquarePawn() + this.gridGUI.getWidthWall();
      }
      else {
        p = i;
      }
      g2d.fillRect(p * (2*this.gridGUI.getWidthWall()), posY, this.gridGUI.getWidthWall(), this.gridGUI.getSizeSquarePawn());
    }
  }

}
