package test;
import quoridor.model.*;

import static org.junit.Assert.*;
import org.junit.*;

public class PairTest {



  @Test
  public final void testPair(){
    Pair pair1 = new Pair(5,2);
    assertNotNull("Instance non creee", pair1);
    assertSame(5, pair1.getX());
    assertSame(2, pair1.getY());
  }


  @Test
  public final void testGetX(){
    Pair pair = new Pair(1,2);
    assertSame(1, pair.getX());
  }


  @Test
  public final void testGetY(){
    Pair pair = new Pair(3,4);
    assertSame(4,pair.getY());
  }


  @Test
  public final void testSetX(){
    Pair pair = new Pair(5,6);
    pair.setX(7);
    assertSame(7,pair.getX());
  }

  @Test
  public final void testSetY(){
    Pair pair = new Pair(8,9);
    pair.setY(10);
    assertSame(10,pair.getY());
  }
}
