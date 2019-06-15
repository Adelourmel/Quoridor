package view;

import quoridor.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class GridPanel extends JPanel {
  private Square[][] grid;
  private Shape[][] gridGUI;
  private final double SIZESQUAREPAWN = 50;
  private final double WIDTHWALL = 50;

  public GridPanel(Square[][] grid) {
    this.grid = grid;
    this.gridGUI = new Shape[this.grid.length][this.grid.length];
    initShape();
  }

  private void initShape() {
    for (int i = 0 ; i < this.grid.length ; i++) {
      for (int p = 0 ; p < this.grid[i].length ; p++) {
        if (this.grid[p][i].getSquareType() == SquareType.WALL_ONLY) {
          if (i%2 == 0) {

          }
          double posX = i*(this.SIZESQUAREPAWN);
          double posY = p*(this.SIZESQUAREPAWN);
          this.gridGUI[p][i] = new Rectangle2D.Double(posX, posY, this.SIZESQUAREPAWN, this.SIZESQUAREPAWN);

        }
        else {
          double posX = i*(this.SIZESQUAREPAWN);
          double posY = p*(this.SIZESQUAREPAWN);
          this.gridGUI[p][i] = new Rectangle2D.Double(posX, posY, this.SIZESQUAREPAWN, this.SIZESQUAREPAWN);
        }
      }
    }
  }
  protected void paintComponent(Graphics grphcs) {
    super.paintComponent(grphcs);
    Graphics2D g2d = (Graphics2D) grphcs;
    //g2d.draw(this.gridGUI[0][0]);
    for (int i = 0 ; i < this.gridGUI.length ; i++) {
      for (int j = 0 ; j < this.gridGUI[i].length ; j++) {
        g2d.draw(this.gridGUI[j][i]);
      }
    }
  }



}
