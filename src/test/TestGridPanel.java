package test;

import quoridor.model.*;
import quoridor.view.*;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class TestGridPanel extends JFrame {

  public GridPanel gridPane;


  public TestGridPanel(Square[][] grid) {
    super("Test");

    this.gridPane = new GridPanel(grid);

    getContentPane().setLayout(new BorderLayout(15,0));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.add(this.gridPane);



    this.pack();
    this.setVisible(true);

  }


}
