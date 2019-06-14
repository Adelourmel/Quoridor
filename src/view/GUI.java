package view;

//import controller.*;
import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
  private MenuPanel menuPanel;



  public GUI(){

    getContentPane().setLayout(new BorderLayout(15,0));
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setTitle("QUORIDOR");
    this.add(new MenuPanel(this));



    this.pack();
    this.setVisible(true);

  }





}
