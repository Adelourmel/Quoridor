package quoridor.test;

import quoridor.model.*;


import static org.junit.Assert.*;
import org.junit.*;


import java.awt.Color;


@Ignore
public class PlayerTest {
  private Player player1;
  private Player player2;

  @Before
  public void setup() {

    Board board;


    this.player1 =  new AIPlayer("Test1", Color.BLACK, board);
    this.player2 =  new AIPlayer("Test2", Color.WHITE, board);

    board = new Board(this.player1, this.player2);
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

      this.player1.decWallsNbTest();

      int tmp =  player2.getWallsNb();

      assertEquals(i, tmp -1);
    }

    int tmp = decWallsNbTest();

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
