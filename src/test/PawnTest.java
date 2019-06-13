package quoridor.test;
import quoridor.model.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


@Ignore
public class PawnTest {


  @Test
  public final void testPawn(){
    Pawn pawn1 = new Pawn(1, 2);
    assertNotNull("Instance non creee", pawn1);
    assertSame(1, pawn1.getX());
    assertSame(2, pawn1.getY());
  }

  @Test
  public final void testToString(){
    Pawn pawn1 = new Pawn(1, 2);
    assertEquals("PAWN", pawn1.toString());
  }
}
