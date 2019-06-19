package quoridor.control;

import quoridor.view.*;
import quoridor.model.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ModeListener implements ActionListener{

  private GUI state;
  public ModeListener(GUI state){
    this.state = state;
  }

  public void actionPerformed(ActionEvent e){
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

    else if (e.getSource() == this.state.getModePanel().getHAButton() ) {
      this.state.removeModePanel();
      this.state.getSettings().setGamemode(Gamemode.HA);
    //this.state.setGamePanel(new GamePanel());
      //this.state.getSettings().startGame();
    }

    else if (e.getSource() == this.state.getModePanel().getHHButton() ) {
      this.state.removeModePanel();
      this.state.getSettings().setGamemode(Gamemode.HH);



      this.state.getSettings().startGUIGame();
      this.state.setGamePanel(new GamePanel(this.state, this.state.getSettings().getGame().getBoard().getGrid()));
      SwingUtilities.updateComponentTreeUI(this.state);

      this.state.pack();


      //this.state.setGamePanel(new GamePanel());
    }
  }
}
