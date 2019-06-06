package quoridor.test;

import quoridor.model.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WallTest {

  private Wall wall;
  private Player player1;

  @Before
  public void setup() {

    Board board;
    this.player1 = new AIPlayer("Test1", Color.BLACK, board);
    board = new Board(this.player1, this.player2);
    this.wall = new Wall(1, 2, player1);
  }

  @Test
  public final void testWall(){

    assertNotNull("Instance non creee", this.wall);
    assertSame(1, this.wall.getPosX());
    assertSame(2, this.wall.getPosY());
  }

  @Test
  public final void testGetPlayer(){
    assertEquals(this.player1, this.wall.getPosX());
  }



  @Test
  public final void testToString(){
    Player player
  }
}
