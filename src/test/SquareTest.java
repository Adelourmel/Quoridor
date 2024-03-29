package test;
import quoridor.model.*;
import java.awt.Color;



import static org.junit.Assert.*;
import org.junit.*;




public class SquareTest {


  @Test
  public final void testSquare(){
    Square square1 = new Square(3, 2, SquareType.PAWN_ONLY);
    assertNotNull("Instance non creee", square1);
    assertSame(3, square1.getPosX());
    assertSame(2, square1.getPosY());
    assertEquals(SquareType.PAWN_ONLY, square1.getSquareType());

    Square square2 = new Square(5, 2, SquareType.WALL_ONLY);
    assertNotNull("Instance non creee", square2);
    assertSame(5, square2.getPosX());
    assertSame(2, square2.getPosY());
    assertEquals(SquareType.WALL_ONLY, square2.getSquareType());
  }

  @Test
  public final void testGetPosX(){
    Square square = new Square(3, 2, SquareType.PAWN_ONLY);
    assertSame(3, square.getPosX());
  }

  @Test
  public final void testGetPosY(){
    Square square = new Square(3, 2, SquareType.PAWN_ONLY);
    assertSame(2, square.getPosY());
  }

  @Test
  public final void testSetPosX(){
    Square square = new Square(3, 2, SquareType.PAWN_ONLY);
    square.setPosX(6);
    assertSame(6, square.getPosX());
  }

  @Test
  public final void testSetPosY(){
    Square square = new Square(3, 2, SquareType.PAWN_ONLY);
    square.setPosY(6);
    assertSame(6, square.getPosY());
  }


  @Test
  public final void testGetSquareType(){
    Square square = new Square(3, 2, SquareType.PAWN_ONLY);
    assertEquals(SquareType.PAWN_ONLY, square.getSquareType());
  }


  @Test
  public final void testSetSquareType(){
    Square square = new Square(3, 2, SquareType.PAWN_ONLY);
    square.setSquareType( SquareType.WALL_ONLY);
    assertEquals(SquareType.WALL_ONLY, square.getSquareType());
  }




  @Test
  public final void testToString(){

    Square square1 = new Square(3, 2, SquareType.PAWN_ONLY);
    assertEquals("O", square1.toString());


    Square square2 = new Square(3, 2, SquareType.WALL_ONLY);
    assertEquals(" ", square2.toString());
  }
}
