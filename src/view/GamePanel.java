package quoridor.view;
import quoridor.control.*;
import quoridor.model.*;
import javax.swing.*;
import java.awt.*;


public class GamePanel extends JPanel {

  private GridPanel gridPanel;
  private GUI state;


  public  GamePanel(Square[][] grid){
    this.state = state;
    this.setLayout(new BorderLayout());
    this.gridPanel = new GridPanel(grid);
    this.add(this.gridPanel);





  }




}
