package quoridor.view;

import java.awt.*;
import javax.swing.JPanel;
import quoridor.model.Player;
import javax.swing.BorderFactory;

/**
 * This class allow to view the number of rest wall
 */
public class WallPanel extends JPanel {

  private Player player;
  private GridPanel gridGUI;
  private int SPACE = 30;


  /**
   * Constructor
   * @param player the player
   * @param grid   the grid
   */
  public WallPanel(Player player, GridPanel grid) {
    this.player = player;
    this.gridGUI = grid;
  }

/**
 * Pait component
 * @param grphcs Graphics elements
 */
  protected void paintComponent(Graphics grphcs) {
    super.paintComponent(grphcs);
    Graphics2D g2d = (Graphics2D) grphcs;

    this.setOpaque(false);

    this.setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
    g2d.setColor(new Color(0, 0, 0));

    drawShape(g2d);

  }

/**
 * This function draw the wall
 * @param g2d the Graphics component
 */
  private void drawShape(Graphics2D g2d) {
    int posY = 0;
    int p;
    for (int i = 0 ; i < player.getWallsNb() ; i++) {
      if (i >= 5) {
        p = i - 5;
        posY = this.gridGUI.getWidthWall() + this.gridGUI.getSizeSquarePawn() + this.gridGUI.getSizeSquarePawn() + this.SPACE;
      }
      else {
        p = i;
      }
      g2d.fillRect(p * (2*this.gridGUI.getWidthWall()) + this.SPACE, posY, this.gridGUI.getWidthWall(), 2* this.gridGUI.getSizeSquarePawn() + this.gridGUI.getWidthWall());
    }
  }

}
