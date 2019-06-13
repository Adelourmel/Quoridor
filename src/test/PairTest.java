package quoridor.test;
import quoridor.model.*;

import static org.junit.Assert.*;
import org.junit.*;

@Ignore
public class PairTest {



  @Test
  public final void testPair(){
    Pair paire = new Pair(5,2);
    assertNotNull("Instance non creee", paire1);
    assertSame(5, pair1.getX());
    assertSame(2,square.getY());
  }


  @Test
  public final void testGetX(){
    Pair pair = new Pair(1,2);
    assertSame(1,getX());
  }


  @Test
  public final void testGetY(){
    Pair pair = new Pair(3,4);
    assertSame(4,getY());
  }


  @Test
  public final void testSetX(){
    Pair pair = new Pair(5,6);
    pair.setX(7);
    assertSame(7,getX());
  }

  @Test
  public final void testSetY(){
    Pair pair = new Pair(8,9);
    pair.setY(10);
    assertSame(10,getY());
  }
}
