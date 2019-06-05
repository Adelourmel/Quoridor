package quoridor.test;
import org.junit.Before;
import org.junit.Test;
import quoridor.model.*;

import static org.junit.Assert.*;

public class QuoridorSettingsTest {


  @Test
  public final void testQuoridorSettings(){
    settings = new QuoridorSettings("a", "b");
    assertNotNull("instance non creee", settings);
  }



  @Test
  public final void testSaveGame(){

  }


  @Test
  public final void testLoadGame(){

  }
}
