package quoridor.control;

import quoridor.view.*;
import quoridor.model.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class LoadSaveListener implements  ListSelectionListener{

  private GUI state;
  public LoadSaveListener(GUI state){
    this.state = state;
  }

  public void valueChanged(ListSelectionEvent e){
    JList savesList = (JList)e.getSource();
    this.state.getSettings().loadGUIGame("../data/"+(String) savesList.getSelectedValue());
    this.state.setGamePanel(new GamePanel(this.state, this.state.getSettings().getGame().getBoard().getGrid()));
    this.state.removeLoadSavePanel();
    SwingUtilities.updateComponentTreeUI(this.state);

    //this.state.pack();
  }
}
