package test;

import quoridor.model.*;
import static org.junit.Assert.*;
import org.junit.*;


public class MoveCalculatorTest {
  private Player player1;
  private Player player2;
  private Board board;
  private MoveCalculator calcul;

  @Before
  public void setup() {
    this.calcul = new MoveCalculator(null);
  }

  @Test
  public void testMoveCalculator() {
    assertNotNull(this.calcul);
  }


  @Test
  public void testGetPossibleWalls() {
    assertNull(this.calcul.getPossibleWalls());
  }

}
