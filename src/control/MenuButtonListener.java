package quoridor.control;

import quoridor.view.*;
import quoridor.model.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * MenuButtonListener Class. It returns on the menu, opens the quitPanel or closes the JFrame if it is triggered.
 */
public class MenuButtonListener implements ActionListener {

  private GUI state;

  public MenuButtonListener(GUI state){
    this.state = state;
  }

  /**
   * Invoked when an action occurs.
   * @param e the event generated if an action occurs
   */
  public void actionPerformed(ActionEvent e){
    if (e.getSource() == this.state.getMenuButton()) {
      if (this.state.getModePanel() != null) {
        this.state.removeModePanel();
        this.state.setMenuPanel(new MenuPanel(this.state));
        SwingUtilities.updateComponentTreeUI(this.state);
      }
      else if (this.state.getloadSavePanel() != null) {
        this.state.removeLoadSavePanel();
        this.state.setMenuPanel(new MenuPanel(this.state));
        SwingUtilities.updateComponentTreeUI(this.state);
      }

      else if (this.state.getQuitPanel() != null) {
        this.state.removeQuitPanel();
        this.state.setMenuPanel(new MenuPanel(this.state));
        SwingUtilities.updateComponentTreeUI(this.state);
      }


      else if (this.state.getGamePanel() != null) {
        this.state.removeGamePanel();
        this.state.setQuitPanel(new QuitPanel(this.state));
        this.state.setSize(1300, 1000);
        //this.state.getSettings().getGame() = null;
        SwingUtilities.updateComponentTreeUI(this.state);
      }

      else if (this.state.getWinnerPanel() != null) {
        this.state.removeWinnerPanel();
        this.state.setMenuPanel(new MenuPanel(this.state));

        //this.state.getSettings().getGame() = null;
        SwingUtilities.updateComponentTreeUI(this.state);
      }




      else  if (this.state.getMenuPanel() != null ) {
        this.state.dispose();
      }


    }
  }
}
