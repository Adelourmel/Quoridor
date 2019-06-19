package quoridor.control;

import quoridor.view.*;
import quoridor.model.*;
import java.awt.event.*;
import java.awt.Rectangle;
import java.io.ByteArrayInputStream;

public class GridPanelListener extends MouseAdapter {

  private Rectangle[][] gridGUI;
  private GUI state;
  private static boolean player1Play ;
  private static boolean endOfGame;

  public GridPanelListener(GUI state, Rectangle[][] gridGUI) {
    this.gridGUI = gridGUI;
    this.state = state;
    this.player1Play = true;
    this.endOfGame = false;
  }


  public void mouseEntered(MouseEvent e) {

  }

  public void mouseReleased(MouseEvent e) {
    boolean found = false;
    //boolean b = false;
    int x = 0;
    int y = 0;

    if (!endOfGame) {

      while (!found && y < this.gridGUI.length) {
        x = 0;
        while (!found && x < this.gridGUI[y].length) {
          if (this.gridGUI[y][x].contains(e.getPoint())) {
            found = true;
            System.out.println(x + ";" + y);

            if (player1Play) {
              this.state.getSettings().getGame().getPlayer1().play(x,y);
              this.player1Play = false;
            }
            else {
              this.state.getSettings().getGame().getPlayer2().play(x,y);
              this.player1Play = true;
            }


          }
          x++;
        }
        y++;
      }
    }



    this.state.repaint();

    if (this.state.getSettings().getGame().getPlayer1().getPawn().getPosY() == this.state.getSettings().getGame().getBoard().getSize()-1) {
    	//System.out.println("Le gagnant est "+player1.toString());
    	this.endOfGame = true;
    }
    else if (this.state.getSettings().getGame().getPlayer2().getPawn().getPosY() == 0) {
    	//System.out.println("Le gagnant est "+player2.toString());
    	this.endOfGame = true;
    }

    /*ByteArrayInputStream in = new ByteArrayInputStream("2".getBytes());
    System.setIn(in);
    System.setIn(System.in);
*/

  }

  public void mouseExited(MouseEvent e) {

  }
}
