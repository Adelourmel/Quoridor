package quoridor.control;

import quoridor.view.*;
import quoridor.model.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuitListener implements ActionListener{

  private GUI state;
  public QuitListener(GUI state){
    this.state = state;
  }

  public void actionPerformed(ActionEvent e){
    if (e.getSource() == this.state.getQuitPanel().getQuitButton() ) {
      this.state.dispose();
    }
    else if (e.getSource() == this.state.getQuitPanel().getSaveButton()) {
      this.state.getSettings().saveGame();
      this.state.dispose();
    }


  }
}
