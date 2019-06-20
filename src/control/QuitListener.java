package quoridor.control;

import quoridor.view.*;
import quoridor.model.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * QuitListener class. Allows to chose to save a game and quit or quit the game.
 */
public class QuitListener implements ActionListener{

  private GUI state;
  public QuitListener(GUI state){
    this.state = state;
  }

  /**
   * Invoked when an action occurs.
   * @param e the event generated if an action occurs
   */
  public void actionPerformed(ActionEvent e){
    if (e.getSource() == this.state.getQuitPanel().getQuitButton() ) {
      this.state.removeQuitPanel();
      this.state.setMenuPanel(new MenuPanel(this.state));
      SwingUtilities.updateComponentTreeUI(this.state);
    }
    else if (e.getSource() == this.state.getQuitPanel().getSaveButton()) {
      this.state.getSettings().saveGame();

      this.state.removeQuitPanel();
      this.state.setMenuPanel(new MenuPanel(this.state));
      SwingUtilities.updateComponentTreeUI(this.state);

    }



  }
}
