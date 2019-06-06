package quoridor.test;
import quoridor.model.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {


  @Test
  public final void testSquare(){
    Square square1 = new Square(3, 2, squareType.PAWN_ONLY);
    assertNotNull("Instance non creee", square1);
    assertSame(3, square1.getX());
    assertSame(2, square1.getY());
    assertEquals(squareType.PAWN_ONLY, square1.getSquareType());

    Square square2 = new Square(5, 2, squareType.WALL_ONLY);
    assertNotNull("Instance non creee", square);
    assertSame(5, square2.getPosX());
    assertSame(2, square2.getPosY());
    assertEquals(squareType.WALL_ONLY, square2.getSquareType())
  }

  @Test
  public final void testGetPosX(){
    Square square = new Square(3, 2,squareType.PAWN_ONLY);
    assertSame(3, square.getPosX());
  }

  @Test
  public final void testGetPosY(){
    Square square = new Square(3, 2, squareType.PAWN_ONLY);
    assertSame(2, square.getPosY());
  }

  @Test
  public final void testSetPosX(){
    Square square = new Square(3, 2, squareType.PAWN_ONLY);
    Square square.setPosX(6);
    assertSame(6, square.getPosX());
  }

  @Test
  public final void testSetPosY(){
    Square square = new Square(3, 2, squareType.PAWN_ONLY);
    Square square.setY(6);
    assertSame(6, square.getY());
  }

  @Test
  public final void testSetSquareType(){
    Square square = new Square(3, 2, squareType.PAWN_ONLY);
    Square square.testSetSquareType( square);
    assertSame(6, square.getY());
  }

  @Test
  public final void testToString(){
    Pawn pawn1 = new Pawn(1, 2);
    assertEquals("PAWN", pawn1.toString());
  }
}
