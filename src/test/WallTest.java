package test;



import java.awt.Color;
import quoridor.model.*;

import static org.junit.Assert.*;
import org.junit.*;



public class WallTest {

  private Wall wall;
  private Player player1;
  private Player player2;
  private Board board;

  @Before
  public void setup() {

    this.player1 = new HumanPlayer("Test1", Color.BLACK, this.board, PlayerPos.BOTTOM);
    this.player2 =  new HumanPlayer("Test2", Color.WHITE, this.board, PlayerPos.BOTTOM);
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
  public final void testToString(){
    assertEquals("X", this.wall.toString());
  }




}
