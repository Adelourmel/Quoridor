package view;

import quoridor.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class GridPanel extends JPanel {
  private Square[][] grid;
  private Rectangle[][] gridGUI;
  private final int SIZESQUAREPAWN = 50;
  private final int WIDTHWALL = 15;

  public GridPanel(Square[][] grid) {
    this.grid = grid;
    this.gridGUI = new Rectangle[this.grid.length][this.grid.length];
    //initShape();
    int sizeGrid = ((this.grid.length/2) * (this.WIDTHWALL + this.SIZESQUAREPAWN)) + this.SIZESQUAREPAWN;
    this.setPreferredSize(new Dimension(sizeGrid, sizeGrid));
  }

  private void initShape(Graphics2D g2d) {
    for (int i = 0 ; i < this.grid.length ; i++) {
      for (int p = 0 ; p < this.grid[i].length ; p++) {
        if (this.grid[p][i].getSquareType() == SquareType.WALL_ONLY) {
          g2d.setColor(Color.WHITE);
          int posX = (i/2)*(this.SIZESQUAREPAWN + this.WIDTHWALL);
          int posY = (p/2)*(this.SIZESQUAREPAWN + this.WIDTHWALL);
          if (i%2 == 0) {
            posY += this.SIZESQUAREPAWN;
            this.gridGUI[p][i] = new Rectangle(posX, posY, this.SIZESQUAREPAWN, this.WIDTHWALL);
            g2d.fill(this.gridGUI[p][i]);

          }
          else if (p%2 == 0) {
            posX += this.SIZESQUAREPAWN;
            this.gridGUI[p][i] = new Rectangle(posX, posY, this.WIDTHWALL, this.SIZESQUAREPAWN);
            g2d.fill(this.gridGUI[p][i]);

          }
          else {
            posX += this.SIZESQUAREPAWN;
            posY += this.SIZESQUAREPAWN;
            this.gridGUI[p][i] = new Rectangle(posX, posY, this.WIDTHWALL, this.WIDTHWALL);
            g2d.fill(this.gridGUI[p][i]);

          }

        }
        else {

          int posX = (i/2)*(this.SIZESQUAREPAWN + this.WIDTHWALL);
          int posY = (p/2)*(this.SIZESQUAREPAWN + this.WIDTHWALL);
          this.gridGUI[p][i] = new Rectangle(posX, posY, this.SIZESQUAREPAWN, this.SIZESQUAREPAWN);
          g2d.setColor(Color.RED);
          g2d.fill(this.gridGUI[p][i]);

        }
      }
    }

  }
  protected void paintComponent(Graphics grphcs) {
    super.paintComponent(grphcs);
    Graphics2D g2d = (Graphics2D) grphcs;
    initShape(g2d);
    //

  }





}
