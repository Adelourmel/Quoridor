package quoridor.control;

import quoridor.view.*;
import quoridor.model.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;

public class ModeListener extends FocusAdapter implements ActionListener, CaretListener {

  private GUI state;
  public ModeListener(GUI state){
    this.state = state;
  }

  public void actionPerformed(ActionEvent e){

    if (e.getSource() == this.state.getModePanel().getHAButton() ) {
      if (this.state.getSettings().getPlayerName1() != null && this.state.getSettings().getPlayerName2()!= null){
        this.state.removeModePanel();
        this.state.getSettings().setGamemode(Gamemode.HA);
        this.state.getSettings().startGUIGame();
        this.state.setGamePanel(new GamePanel(this.state, this.state.getSettings().getGame().getBoard().getGrid()));
        SwingUtilities.updateComponentTreeUI(this.state);

        this.state.pack();



      }
    }

    else if (e.getSource() == this.state.getModePanel().getHHButton() ) {
      if (this.state.getSettings().getPlayerName1() != null && this.state.getSettings().getPlayerName2()!= null) {

        this.state.removeModePanel();
        this.state.getSettings().setGamemode(Gamemode.HH);



        this.state.getSettings().startGUIGame();
        this.state.setGamePanel(new GamePanel(this.state, this.state.getSettings().getGame().getBoard().getGrid()));
        SwingUtilities.updateComponentTreeUI(this.state);

        this.state.pack();
      }


    }
  }

  public void caretUpdate(CaretEvent e) {
    if (e.getSource() == this.state.getModePanel().getPlayer1Field() ) {
      if ( this.state.getModePanel().getPlayer1Field().getText().equals("")) {
        this.state.getModePanel().getPlayer1Field().setBackground(new Color(221, 97, 74));
      }
      else if (!this.state.getModePanel().getPlayer1Field().getText().equals("")) {
        this.state.getModePanel().getPlayer1Field().setBackground(Color.WHITE);
        this.state.getSettings().setPlayerName1(this.state.getModePanel().getPlayer1Field().getText());
      }
    }

    else if (e.getSource() == this.state.getModePanel().getPlayer2Field() ) {
      if ( this.state.getModePanel().getPlayer2Field().getText().equals("")) {
        this.state.getModePanel().getPlayer2Field().setBackground(new Color(221, 97, 74));
      }
      else if (!this.state.getModePanel().getPlayer2Field().getText().equals("")) {
        this.state.getModePanel().getPlayer2Field().setBackground(Color.WHITE);
        this.state.getSettings().setPlayerName2(this.state.getModePanel().getPlayer2Field().getText());
      }
    }
  }

  public void focusGained(FocusEvent e) {

    if (e.getSource() == this.state.getModePanel().getPlayer1Field() && this.state.getModePanel().getPlayer1Field().getText().equals("Nom du joueur 1")) {
      this.state.getModePanel().getPlayer1Field().setText("");
    }
    else if (e.getSource() == this.state.getModePanel().getPlayer2Field() && this.state.getModePanel().getPlayer2Field().getText().equals("Nom du joueur 2")) {
      this.state.getModePanel().getPlayer2Field().setText("");
    }
  }
}
