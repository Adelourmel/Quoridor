package view;

//import controller.*;
import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
  private MenuPanel menuPanel;



  public GUI(){

    getContentPane().setLayout(new BorderLayout());
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setTitle("QUORIDOR");
    //this.add(new MenuPanel(this));
    //this.add(new ModePanel(this));
    this.add(new LoadSavePanel(this));

    this.setSize(1300, 900);



    //this.pack();
    this.setVisible(true);

  }





}
