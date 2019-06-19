package quoridor.control;

import quoridor.view.*;
import quoridor.model.*;
import java.awt.event.*;
import java.awt.Rectangle;
import java.io.ByteArrayInputStream;

public class GridPanelListener extends MouseAdapter {

  private Rectangle[][] gridGUI;
  private GUI state;

  public GridPanelListener(GUI state, Rectangle[][] gridGUI) {
    this.gridGUI = gridGUI;
    this.state = state;
  }


  public void mouseEntered(MouseEvent e) {

  }
  public void mouseReleased(MouseEvent e) {
    boolean found = false;
    boolean b = false;
    int x = 0;
    int y = 0;


    boolean player1Play = true;

		boolean quitGame = false;
		while (true ){
			if (player1Play) {
        while (!found && y < this.gridGUI.length) {
          x = 0;
          while (!found && x < this.gridGUI[y].length) {
            if (this.gridGUI[y][x].contains(e.getPoint())) {
              found = true;
              System.out.println(x + ";" + y);

            }
            x++;
          }
          y++;
        }
				this.state.getSettings().getGame().getPlayer1().play(x,y);
				player1Play = false;
			}
			else {
        while (!found && y < this.gridGUI.length) {
          x = 0;
          while (!found && x < this.gridGUI[y].length) {
            if (this.gridGUI[y][x].contains(e.getPoint())) {
              found = true;
              System.out.println(x + ";" + y);

            }
            x++;
          }
          y++;
        }
				this.state.getSettings().getGame().getPlayer2().play(x,y);
				player1Play = true;
			}
		}
    /*ByteArrayInputStream in = new ByteArrayInputStream("2".getBytes());
    System.setIn(in);
    System.setIn(System.in);
*/

  }

  public void mouseExited(MouseEvent e) {

  }
}
