package test;

import quoridor.model.*;


import static org.junit.Assert.*;
import org.junit.*;


import java.awt.Color;



public class PlayerTest {
  private Player player1;
  private Player player2;
  private Board board;

  @Before
  public void setup() {



    this.player1 =  new AIPlayer("Test1", Color.BLACK, this.board, PlayerPos.TOP);
    this.player2 =  new AIPlayer("Test2", Color.WHITE, this.board, PlayerPos.BOTTOM);

    this.board = new Board(11, this.player1, this.player2);
  }

  @Test
  public void TestPlayer() {
    assertNotNull(this.player1);
    assertNotNull(this.player2);
  }

  @Test
  public void TestDecWalls() {

    assertEquals(10, this.player1.getWallsNb());

    while (this.player1.getWallsNb() != 1) {

      int i = this.player1.getWallsNb();

      this.player1.decWalls();

      int tmp =  player1.getWallsNb();

      assertEquals(i, tmp -1);
    }

    int tmp = this.player1.getWallsNb();

    assertEquals(0, tmp);

  }

  @Test
  public void TestgetPawn() {
    assertNotNull(this.player1.getPawn());
  }

  @Test
  public void TestGetPlayerName() {
    assertEquals("Test1", this.player1.getPlayerName());
    assertEquals("Test2", this.player2.getPlayerName());
  }
}
