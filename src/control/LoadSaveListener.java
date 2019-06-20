package quoridor.control;

import quoridor.view.*;
import quoridor.model.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * ListSaveListener Class. It load a save when it is selected
 */
public class LoadSaveListener implements  ListSelectionListener{

  private GUI state;
  public LoadSaveListener(GUI state){
    this.state = state;
  }

  /**
   * valueChanged Listener. It listens if a value of a JList is selected or deselected.
   * @param e the listSelectionEvent generated when a value changes
   */
  public void valueChanged(ListSelectionEvent e){
    JList savesList = (JList)e.getSource();
    this.state.getSettings().loadGUIGame("../data/"+(String) savesList.getSelectedValue());
    this.state.setGamePanel(new GamePanel(this.state, this.state.getSettings().getGame().getBoard().getGrid()));
    this.state.removeLoadSavePanel();
    SwingUtilities.updateComponentTreeUI(this.state);

  }
}
