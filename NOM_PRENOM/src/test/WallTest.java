package test;



import java.awt.Color;
import quoridor.model.*;

import org.junit.*;
import static org.junit.Assert.*;



public class WallTest {

  private Wall wall;
  private Player player1;
  private Player player2;
  private Board board;

  @Before
  public void setup() {


    this.board = new Board(11, this.player1, this.player2);
    this.player1 = new HumanPlayer("Test1", Color.BLACK, this.board, PlayerPos.BOTTOM);
    this.player2 =  new HumanPlayer("Test2", Color.WHITE, this.board, PlayerPos.BOTTOM);
    this.board.setPlayers(this.player1, this.player2);


    this.wall = new Wall(1, 2);
  }


  @Test
  public final void testWall(){

    assertNotNull("Instance non creee", this.wall);
    assertSame(1, this.wall.getPosX());
    assertSame(2, this.wall.getPosY());
  }



  


  @Test
  public final void testToString(){
    assertEquals("X", this.wall.toString());
  }




}
