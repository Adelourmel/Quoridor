package quoridor.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


@Ignore
public class MoveCalculator {
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
    insertNotNull(this.calcul);
  }

  @Test
  public void testGetPossibleMovesPlayer1() {
    insertNotNull(this.calcul.getPossibleMovesPlayer1());
  }
  @Test
  public void testGetPossibleMovesPlayer2() {
    insertNotNull(this.calcul.getPossibleMovesPlayer2());
  }
  @Test
  public void testGetPossibleWalls() {
    insertNotNull(this.calcul.getPossibleMovesWalls());
  }

}
