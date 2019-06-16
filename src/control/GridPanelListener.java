package quoridor.control;

import java.awt.event.*;
import java.awt.Rectangle;

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
    if (this.gridGUI[0][0].contains(e.getPoint()))
      System.out.println("yop");

  }
  public void mouseClicked(MouseEvent e) {

  }
  public void mouseExited(MouseEvent e) {

  }
}
