package test;
import quoridor.model.*;
import quoridor.model.*;
import java.awt.Color;

import static org.junit.Assert.*;
import org.junit.*;


public class PawnTest {


  @Test
  public final void testPawn(){
    Pawn pawn1 = new Pawn(1, 2, Color.WHITE);
    assertNotNull("Instance non creee", pawn1);
    assertSame(1, pawn1.getPosX());
    assertSame(2, pawn1.getPosY());
  }

  @Test
  public final void testToString(){
    Pawn pawn1 = new Pawn(1, 2, Color.WHITE);
    assertEquals("PAWN", pawn1.toString());
  }
}
