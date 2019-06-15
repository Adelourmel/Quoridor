package view;

import quoridor.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class GridPanel extends JPanel {
  private Square[][] grid;
  private Rectangle[][] gridGUI;
  private final int SIZESQUAREPAWN = 60;
  private final int WIDTHWALL = 20;

  public GridPanel(Square[][] grid) {
    this.grid = grid;
    this.gridGUI = new Rectangle[this.grid.length][this.grid.length];
    initShape();
  }

  private void initShape() {
    for (int i = 0 ; i < this.grid.length ; i++) {
      for (int p = 0 ; p < this.grid[i].length ; p++) {
        if (this.grid[p][i].getSquareType() == SquareType.WALL_ONLY) {
          int posX = (i/2)*(this.SIZESQUAREPAWN + this.WIDTHWALL);
          int posY = (p/2)*(this.SIZESQUAREPAWN + this.WIDTHWALL);
          if (i%2 == 0) {
            posY += this.SIZESQUAREPAWN;
            this.gridGUI[p][i] = new Rectangle(posX, posY, this.SIZESQUAREPAWN, this.WIDTHWALL);

          }
          else if (p%2 == 0) {
            posX += this.SIZESQUAREPAWN;
            this.gridGUI[p][i] = new Rectangle(posX, posY, this.WIDTHWALL, this.SIZESQUAREPAWN);
          }
          else {
            posX += this.SIZESQUAREPAWN;
            posY += this.SIZESQUAREPAWN;
            this.gridGUI[p][i] = new Rectangle(posX, posY, this.WIDTHWALL, this.WIDTHWALL);
          }

        }
        else {
          int posX = (i/2)*(this.SIZESQUAREPAWN + this.WIDTHWALL);
          int posY = (p/2)*(this.SIZESQUAREPAWN + this.WIDTHWALL);
          this.gridGUI[p][i] = new Rectangle(posX, posY, this.SIZESQUAREPAWN, this.SIZESQUAREPAWN);
        }
      }
    }

  }
  protected void paintComponent(Graphics grphcs) {
    super.paintComponent(grphcs);
    Graphics2D g2d = (Graphics2D) grphcs;
    for (int i = 0 ; i < this.gridGUI.length ; i++) {
      g2d.setColor(Color.RED);
      for (int j = 0 ; j < this.gridGUI[i].length ; j++) {

        g2d.fill(this.gridGUI[j][i]);
        g2d.setColor(Color.BLUE);
      }
    }
  }



}
