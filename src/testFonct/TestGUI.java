package test;
import quoridor.view.*;
import quoridor.model.*;




public class TestGUI{
  /**
  * @param args the command line arguments
  */
  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new GUI(new QuoridorSettings());
      }
    });
  }

}
