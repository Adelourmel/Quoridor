package test;

import quoridor.model.*;
import quoridor.view.*;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class TestGridPanel extends JFrame {

  public GamePanel gridPane;


  public TestGridPanel(Square[][] grid) {
    super("Test");

    this.gridPane = new GamePanel(grid);

    getContentPane().setLayout(new BorderLayout(15,0));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.add(this.gridPane);



    this.pack();
    this.setVisible(true);

  }


}
