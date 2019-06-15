package view;

import quoridor.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class GridPanel extends JPanel {
  private Square[][] grid;
  private Shape[][] gridGUI;
  private final double SIZESQUAREPAWN = 60;
  private final double WIDTHWALL = 20;

  public GridPanel(Square[][] grid) {
    this.grid = grid;
    this.gridGUI = new Shape[this.grid.length][this.grid.length];
    initShape();
  }

  private void initShape() {
    for (int i = 0 ; i < this.grid.length ; i++) {
      for (int p = 0 ; p < this.grid[i].length ; p++) {
        if (this.grid[p][i].getSquareType() == SquareType.WALL_ONLY) {
          double posX = (i/2)*(this.SIZESQUAREPAWN + this.WIDTHWALL);
          double posY = (p/2)*(this.SIZESQUAREPAWN + this.WIDTHWALL);
          if (i%2 == 0) {
            posY += this.SIZESQUAREPAWN;
            this.gridGUI[p][i] = new Rectangle2D.Double(posX, posY, this.SIZESQUAREPAWN, this.WIDTHWALL);

          }
          else {
            posX += this.SIZESQUAREPAWN;
            this.gridGUI[p][i] = new Rectangle2D.Double(posX, posY, this.WIDTHWALL, this.SIZESQUAREPAWN);
          }
        }
        else {
          double posX = (i/2)*(this.SIZESQUAREPAWN + this.WIDTHWALL);
          double posY = (p/2)*(this.SIZESQUAREPAWN + this.WIDTHWALL);
          this.gridGUI[p][i] = new Rectangle2D.Double(posX, posY, this.SIZESQUAREPAWN, this.SIZESQUAREPAWN);
        }
      }
    }
  }
  protected void paintComponent(Graphics grphcs) {
    super.paintComponent(grphcs);
    Graphics2D g2d = (Graphics2D) grphcs;
    for (int i = 0 ; i < this.gridGUI.length ; i++) {
      for (int j = 0 ; j < this.gridGUI[i].length ; j++) {
        g2d.draw(this.gridGUI[j][i]);
      }
    }
  }



}
