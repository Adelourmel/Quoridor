package quoridor.view;
import quoridor.control.*;
import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

  private GridPanel gridPanel;


  public  GamePanel(GUI state){
    this.state = state;
    this.setLayout(new BorderLayout());
    this.gridPanel = new GridPanel();
    this.add(this.gridPanel);



    }
  }




}
