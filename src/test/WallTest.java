package quoridor.model;

import quoridor.model.*;


import static org.junit.Assert.*;
import org.junit.*;


@Ignore
public class WallTest {

  private Wall wall;
  private Player player1;

  @Before
  public void setup() {

    Board board;
    this.player1 = new AIPlayer("Test1", Color.BLACK, board);
    this.player2 =  new AIPlayer("Test2", Color.WHITE, board);
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
  public final void testSetPlayer(){
    this.wall = new Wall(1, 2, player1);
    this.wall.setPlayer(player2);
    assertEquals(this.player2, this.wall.getPlayer());
  }


  @Test
  // TODO - Modifier le toString en fonction.
  public final void testToString(){
    assertEquals("", this.wall.toString());
  }




}
