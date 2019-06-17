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
      }
    }

    else if (e.getSource() == this.state.getModePanel().getPlayer2Field() ) {
      if ( this.state.getModePanel().getPlayer2Field().getText().equals("")) {
        this.state.getModePanel().getPlayer2Field().setBackground(new Color(221, 97, 74));
      }
      else if (!this.state.getModePanel().getPlayer2Field().getText().equals("")) {
        this.state.getModePanel().getPlayer2Field().setBackground(Color.WHITE);
      }
    }

    else if (e.getSource() == this.state.getModePanel().getHAButton() ) {
      this.state.removeModePanel();
    //  this.state.setGamePanel(new GamePanel());
    }

    else if (e.getSource() == this.state.getModePanel().getHHButton() ) {
      this.state.removeModePanel();
      //this.state.setGamePanel(new GamePanel());
    }
  }
}
