package test;

import quoridor.model.*;
import static org.junit.Assert.*;
import org.junit.*;

@Ignore
public class MoveCalculatorTest {
  private Player player1;
  private Player player2;
  private Board board;
  private MoveCalculator calcul;

  @Before
  public void setup() {
    this.calcul = new MoveCalculator(player1, player2);
  }

  @Test
  public void testMoveCalculator() {
    assertNotNull(this.calcul);
  }

  @Test
  public void testGetPossibleMovesPlayer1() {
    assertNotNull(this.calcul.getPossibleMovesPlayer1());
  }
  @Test
  public void testGetPossibleMovesPlayer2() {
    assertNotNull(this.calcul.getPossibleMovesPlayer2());
  }
  @Test
  public void testGetPossibleWalls() {
    assertNotNull(this.calcul.getPossibleWalls());
  }

}
