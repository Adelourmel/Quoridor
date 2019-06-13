package quoridor.test;
import quoridor.model.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@Ignore
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
    assertEquals(squareType.WALL_ONLY, square2.getSquareType());
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
    square.setPosX(6);
    assertSame(6, square.getPosX());
  }

  @Test
  public final void testSetPosY(){
    Square square = new Square(3, 2, squareType.PAWN_ONLY);
    square.setY(6);
    assertSame(6, square.getY());
  }


  @Test
  public final void testGetSquareType(){
    Square square = new Square(3, 2, squareType.PAWN_ONLY);
    assertEquals(squareType.WALL_ONLY, square.getSquareType());
  }


  @Test
  public final void testSetSquareType(){
    Square square = new Square(3, 2, squareType.PAWN_ONLY);
    square.setSquareType( square.WALL_ONLY);
    assertEquals(squareType.WALL_ONLY, square.getSquareType());
  }




  @Test
  public final void testToString(){
    // TODO - Modifier le toString en fonction
    Square square1 = new Square(3, 2, squareType.PAWN_ONLY);
    assertEquals("[]", square1.toString());

    // TODO - Modifier le toString en fonction
    Square square2 = new Square(3, 2, squareType.WALL_ONLY);
    assertEquals("", square2.toString());
  }
}
