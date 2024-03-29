package quoridor.view;

import quoridor.model.*;
import quoridor.control.GridPanelListener;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;


/**
 * This class allow to see the grid
 * @author Arnaud Delourmel
 * @author Rémi Audoin
 */
public class GridPanel extends JPanel {
  private Square[][] grid;
  private Rectangle[][] gridGUI;
  private final int SIZESQUAREPAWN = 55;
  private final int WIDTHWALL = 15;
  private GridPanelListener listener;
  private GUI state;
  private final int POSGRIDX = 100;
  private final int POSGRIDY = 100;


/**
 * Constructor
 * @param state the gui
 * @param grid  the grid to display
 */
  public GridPanel(GUI state, Square[][] grid) {
    this.state = state;
    this.grid = grid;
    this.gridGUI = new Rectangle[this.grid.length][this.grid.length];
    this.listener = new GridPanelListener(this.state, this.gridGUI);
    setBackground(this.state.getbackColor());
    //initShape();
    int sizeGrid = ((this.grid.length/2) * (this.WIDTHWALL + this.SIZESQUAREPAWN)) + this.SIZESQUAREPAWN;
    this.setMinimumSize(new Dimension(sizeGrid, sizeGrid));
    this.setMaximumSize(new Dimension(sizeGrid, sizeGrid));
    this.setPreferredSize(new Dimension(sizeGrid, sizeGrid));
    this.addMouseListener(this.listener);
  }


/**
 * This method allow to init the shape and call drawWall or drawPawn for draw in the Graphics component
 * @param g2d Graphics component
 */
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

    drawPawn(this.state.getSettings().getGame().getPlayer1(), g2d);
    drawPawn(this.state.getSettings().getGame().getPlayer2(), g2d);

  }


  /**
   * paintComponent
   * @param grphcs Graphics elements
   */
  protected void paintComponent(Graphics grphcs) {
    super.paintComponent(grphcs);
    Graphics2D g2d = (Graphics2D) grphcs;
    initShape(g2d);


  }


  /**
   * This method allow to draw wall
   * @param x   x coordinate of the wall in grid element
   * @param y   y coordinate of the wall in grid element
   * @param g2d Graphics component
   */
  private void drawWall(int x, int y, Graphics2D g2d) {
    g2d.setColor(Color.WHITE);
    if (Wall.class.isInstance(grid[x][y])) {
      g2d.setColor(new Color(100,100,170));
    }
    int posX = (x/2)*(this.SIZESQUAREPAWN + this.WIDTHWALL) + this.POSGRIDX;
    int posY = (y/2)*(this.SIZESQUAREPAWN + this.WIDTHWALL) + this.POSGRIDY;
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



  /**
   * This method allow to draw square
   * @param x   x coordinate of the square in grid element
   * @param y   y coordinate of the square in grid element
   * @param g2d Graphics component
   */
  private void drawSquare(int x, int y, Graphics2D g2d) {
    g2d.setColor(new Color(189,189,189));


    checkPossibleMove(x, y, g2d);

    int posX = (x/2)*(this.SIZESQUAREPAWN + this.WIDTHWALL) + this.POSGRIDX;
    int posY = (y/2)*(this.SIZESQUAREPAWN + this.WIDTHWALL) + this.POSGRIDY;

    this.gridGUI[y][x] = new Rectangle(posX, posY, this.SIZESQUAREPAWN, this.SIZESQUAREPAWN);
    g2d.fill(this.gridGUI[y][x]);
  }


  /**
   * This method allow to draw pawn
   * @param player   the player
   * @param g2d Graphics component
   */
  private void drawPawn(Player player, Graphics g2d) {


    g2d.setColor(player.getColor());

    int posX = (player.getPawn().getPosX()/2)*(this.SIZESQUAREPAWN + this.WIDTHWALL) + this.POSGRIDX;
    int posY = (player.getPawn().getPosY()/2)*(this.SIZESQUAREPAWN + this.WIDTHWALL) + this.POSGRIDY;

    g2d.fillRect(posX, posY, this.SIZESQUAREPAWN, this.SIZESQUAREPAWN);

  }


  private void checkPossibleMove(int x, int y, Graphics2D g2d) {
    boolean found = false;
    for (Pair elem : this.state.getSettings().getGame().getPlayer1().getPossiblePawn()) {
      if (elem.getY() == y && elem.getX() == x) {
        found = true;
      }
    }
    for (Pair elem : this.state.getSettings().getGame().getPlayer2().getPossiblePawn()) {
      if (elem.getY() == y && elem.getX() == x) {
        found = true;
      }
    }
    if (found) {
      g2d.setColor(new Color(150,150,150));
    }
  }

/**
 * getter
 * @return WIDTHWALL
 */
  public int getWidthWall() {
    return this.WIDTHWALL;
  }

  /**
   * getter
   * @return SIZESQUAREPAWN
   */
  public int getSizeSquarePawn() {
    return this.SIZESQUAREPAWN;
  }




}
