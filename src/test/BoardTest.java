package test;

import java.awt.Color;
import org.junit.Test;
import quoridor.model.*;

import static org.junit.Assert.*;
import org.junit.*;





public class BoardTest {
  public Board board;
  public HumanPlayer player1;
  public HumanPlayer player2;


  @Before
  public void setup() {

    this.board = new Board(11, player1, player1);
    this.player1 =  new HumanPlayer("test1", Color.BLACK, this.board, PlayerPos.TOP);
    this.player2 =  new HumanPlayer("test2", Color.WHITE, this.board, PlayerPos.BOTTOM);


  }

  @Test
  public void testBoard() {
      assertNotNull(this.board);
  }


  @Test
  public void testGetSize() {
    assertSame(11, this.board.getSize());
  }



  @Test
  public void setNewMove() {

    assertFalse(this.board.setNewMove(-1, -1, this.player1));

  }


}
