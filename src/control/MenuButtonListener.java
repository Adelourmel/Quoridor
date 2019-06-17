package quoridor.control;

import quoridor.view.*;
import quoridor.model.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuButtonListener implements ActionListener {

  private GUI state;

  public MenuButtonListener(GUI state){
    this.state = state;
  }

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
    }
  }
}
