package test;

import quoridor.model.*;
import view.*;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class TestGridPanel extends JFrame {
  public TestGridPanel(Square[][] grid) {
    super("Test");

    getContentPane().setLayout(new BorderLayout(15,0));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.add(new GridPanel(grid));



    this.pack();
    this.setVisible(true);

  }


}
