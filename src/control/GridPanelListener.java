package quoridor.control;

import quoridor.view.*;
import quoridor.model.*;
import java.awt.event.*;
import java.awt.Rectangle;
import java.io.ByteArrayInputStream;
import java.awt.Color;
import javax.swing.*;


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

    int x = 0;
    int y = 0;

    if (this.state.getSettings().getGameMode() == Gamemode.HH) {

      if (!endOfGame) {
        while (!found && y < this.gridGUI.length) {
          x = 0;
          while (!found && x < this.gridGUI[y].length) {
            if (this.gridGUI[y][x].contains(e.getPoint())) {
              found = true;
              System.out.println(x + ";" + y);

              if (player1Play) {

                if (this.state.getSettings().getGame().getPlayer1().play(x,y)) {
                  this.player1Play = false;
                  this.state.getGamePanel().getLabelName2().setForeground(new Color(0, 255, 0));
                  this.state.getGamePanel().getLabelName1().setForeground(new Color(0, 0, 0));
                }

              }
              else {

                if (this.state.getSettings().getGame().getPlayer2().play(x,y)) {
                  this.player1Play = true;
                  this.state.getGamePanel().getLabelName1().setForeground(new Color(0, 255, 0));
                  this.state.getGamePanel().getLabelName2().setForeground(new Color(0, 0, 0));
                }
              }


            }
            x++;
          }
          y++;
        }

      }

    }
    else {
      if (!endOfGame) {
        while (!found && y < this.gridGUI.length) {
          x = 0;
          while (!found && x < this.gridGUI[y].length) {
            if (this.gridGUI[y][x].contains(e.getPoint())) {
              found = true;
              //System.out.println(x + ";" + y);
              if (this.state.getSettings().getGame().getPlayer1().play(x,y)) {


                this.state.getSettings().getGame().getPlayer2().play();
              }
            }
            x++;
          }
          y++;
        }

      }
    }





    this.state.repaint();

    if (this.state.getSettings().getGame().getPlayer1().getPawn().getPosY() == this.state.getSettings().getGame().getBoard().getSize()-1) {
    	//System.out.println("Le gagnant est "+player1.toString());
    	this.endOfGame = true;
      this.state.removeGamePanel();
      this.state.setWinnerPanel(new WinnerPanel(this.state));
      this.state.getWinnerPanel().getWinnerLabel().setText(this.state.getSettings().getPlayerName1() + " remporte la partie");
      this.state.setSize(1300, 1000);

    }
    else if (this.state.getSettings().getGame().getPlayer2().getPawn().getPosY() == 0) {
    	//System.out.println("Le gagnant est "+player2.toString());
    	this.endOfGame = true;
      this.state.removeGamePanel();
      this.state.setWinnerPanel(new WinnerPanel(this.state));
      this.state.getWinnerPanel().getWinnerLabel().setText(this.state.getSettings().getPlayerName2() + " remporte la partie");
      this.state.setSize(1300, 1000);
    }


  }

  public void mouseExited(MouseEvent e) {

  }
}
