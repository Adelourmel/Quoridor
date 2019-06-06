package quoridor.test;

import quoridor.model.*;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

import java.awt.Color;

public class PlayerTest {
  private Player player1;
  private Player player2;

  @After
  public void setup() {
    Board board;


    this.player1 =  new AIPlayer("Test1", Color.BLACK, board);
    this.player2 =  new AIPlayer("Test2", Color.WHITE, board);

    board = new Board(this.player1, this.player2);
  }

  @Test
  public void decWallsNbTest() {


    while (this.player1.getWallsNb() != 1) {

      int i = this.player1.getWallsNb();

      this.player1.decWallsNbTest();

      int tmp2 =  player2.getWallsNb();

      assertEquals(tmp, tmp2 -1);
    }

    int tmp = decWallsNbTest();

    assertEquals(0, tmp);

  }
}
