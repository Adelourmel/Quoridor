package test;

import quoridor.model.*;

import java.awt.Color;
import static org.junit.Assert.*;
import org.junit.*;


@Ignore
public class WallTest {

  private Wall wall;
  private Player player1;
  private Player player2;
  private Board board;

  @Before
  public void setup() {

    this.player1 = new AIPlayer("Test1", Color.BLACK, this.board);
    this.player2 =  new AIPlayer("Test2", Color.WHITE, this.board);
    this.board = new Board(11, this.player1, this.player2);

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
    assertEquals(this.player1, this.wall.getPlayer());
  }


  @Test
  // TODO - Modifier le toString en fonction.
  public final void testToString(){
    assertEquals("", this.wall.toString());
  }




}
