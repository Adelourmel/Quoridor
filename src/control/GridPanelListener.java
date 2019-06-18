package quoridor.control;

import java.awt.event.*;
import java.awt.Rectangle;
import java.io.ByteArrayInputStream;

public class GridPanelListener extends MouseAdapter {

  private Rectangle[][] gridGUI;

  public GridPanelListener(Rectangle[][] gridGUI) {
    this.gridGUI = gridGUI;
  }

  public void mousePressed(MouseEvent e) {
  }
  public void mouseEntered(MouseEvent e) {

  }
  public void mouseReleased(MouseEvent e) {
    boolean found = false;
    boolean b = false;
    int x = 0;
    int y = 0;
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
    /*ByteArrayInputStream in = new ByteArrayInputStream("2".getBytes());
    System.setIn(in);
    System.setIn(System.in);
*/

  }
  public void mouseClicked(MouseEvent e) {

  }
  public void mouseExited(MouseEvent e) {

  }
}
