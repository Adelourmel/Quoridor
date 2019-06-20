package quoridor.control;

import quoridor.view.*;
import quoridor.model.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * MenuListener class. It allows to display the ModePanel or the LoadSavePanel if the buttons are triggered.
 */
public class MenuListener implements ActionListener{

  private GUI state;

  public MenuListener(GUI state){
    this.state = state;
  }

  /**
   * Invoked when an action occurs.
   * @param e the event generated if an action occurs
   */
  public void actionPerformed(ActionEvent e){

    if (e.getSource() == this.state.getMenuPanel().getLoadGameButton()) {
      this.state.removeMenuPanel();
      this.state.setLoadSavePanel(new LoadSavePanel(this.state));
      SwingUtilities.updateComponentTreeUI(this.state);
    }
    else if (e.getSource() == this.state.getMenuPanel().getNewGameButton()) {
      this.state.removeMenuPanel();
      this.state.setModePanel(new ModePanel(this.state));
      SwingUtilities.updateComponentTreeUI(this.state);
    }
  }


}
