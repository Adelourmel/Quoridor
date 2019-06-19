package quoridor.view;

import quoridor.model.*;
import quoridor.control.GridPanelListener;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class GridPanel extends JPanel {
  private Square[][] grid;
  private Rectangle[][] gridGUI;
  private final int SIZESQUAREPAWN = 60;
  private final int WIDTHWALL = 15;
  private GridPanelListener listener;
  private GUI state;


  public GridPanel(GUI state, Square[][] grid) {
    this.state = state;
    this.grid = grid;
    this.gridGUI = new Rectangle[this.grid.length][this.grid.length];
    this.listener = new GridPanelListener(this.state, this.gridGUI);
    //initShape();
    int sizeGrid = ((this.grid.length/2) * (this.WIDTHWALL + this.SIZESQUAREPAWN)) + this.SIZESQUAREPAWN;
    this.setPreferredSize(new Dimension(sizeGrid, sizeGrid));
    this.addMouseListener(this.listener);
  }

  private void initShape(Graphics2D g2d) {
    for (int i = 0 ; i < this.grid.length ; i++) {
      for (int p = 0 ; p < this.grid[i].length ; p++) {
        if (this.grid[p][i].getSquareType() == SquareType.WALL_ONLY) {
          drawWall(p, i, g2d);

        }
        else {
          drawSquare(p, i, g2d);


        }
      }
    }

  }
  protected void paintComponent(Graphics grphcs) {
    super.paintComponent(grphcs);
    Graphics2D g2d = (Graphics2D) grphcs;
    initShape(g2d);


  }
  private void drawWall(int x, int y, Graphics2D g2d) {
    g2d.setColor(Color.WHITE);
    if (Wall.class.isInstance(grid[x][y])) {
      g2d.setColor(Color.RED);
    }
    int posX = (x/2)*(this.SIZESQUAREPAWN + this.WIDTHWALL);
    int posY = (y/2)*(this.SIZESQUAREPAWN + this.WIDTHWALL);
    if (x%2 == 0) {
      posY += this.SIZESQUAREPAWN;
      this.gridGUI[y][x] = new Rectangle(posX, posY, this.SIZESQUAREPAWN, this.WIDTHWALL);
      g2d.fill(this.gridGUI[y][x]);

    }
    else if (y%2 == 0) {
      posX += this.SIZESQUAREPAWN;
      this.gridGUI[y][x] = new Rectangle(posX, posY, this.WIDTHWALL, this.SIZESQUAREPAWN);
      g2d.fill(this.gridGUI[y][x]);

    }
    else {
      posX += this.SIZESQUAREPAWN;
      posY += this.SIZESQUAREPAWN;
      this.gridGUI[y][x] = new Rectangle(posX, posY, this.WIDTHWALL, this.WIDTHWALL);
      g2d.fill(this.gridGUI[y][x]);

    }
  }

  private void drawSquare(int x, int y, Graphics2D g2d) {
    g2d.setColor(new Color(100, 100, 100));
    if (Pawn.class.isInstance(grid[x][y])) {
      g2d.setColor(Color.BLUE);
    }
    int posX = (x/2)*(this.SIZESQUAREPAWN + this.WIDTHWALL);
    int posY = (y/2)*(this.SIZESQUAREPAWN + this.WIDTHWALL);

    this.gridGUI[y][x] = new Rectangle(posX, posY, this.SIZESQUAREPAWN, this.SIZESQUAREPAWN);
    g2d.fill(this.gridGUI[y][x]);
  }




}
