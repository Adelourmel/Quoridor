package quoridor.test;
import org.junit.Before;
import org.junit.Test;
import quoridor.model.*;

import static org.junit.Assert.*;

public class BoardTest {
  public Board board;
  public Player player1;


  @Before
  public void setup() {

    this.player1 =  new HumanPlayer();

    this.board = new Board(11, player1, player1);

  }

  @Test
  public void testBoard() {
      assertNotNull(this.board);
  }


  @Test
  public void testGetGrid() {
    Square grid =  board.getGrid();
    assertSame(11, this.grid.length);
    assertSame(11, this.grid[0].length);

  }

  @Test
  public void testGetSize() {
    assertSame(11, player1.getSize());
  }


<<<<<<< HEAD
  @Test
  public void testSetSize() {
    int tmp = (int)(Math.random() * 20;
    board.setSize(tmp);
    assertEquals(tmp, board.getSize());
  }
=======
>>>>>>> 197a0ee061fade674cb887033286ebc583662cf7

  @Test
  public void setNewMove() {
    assertFalse(this.board.setNewMove(-1, -1, player1));

  }


}
