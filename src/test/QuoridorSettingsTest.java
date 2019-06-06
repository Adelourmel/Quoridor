package quoridor.test;
import org.junit.Before;
import org.junit.Test;
import quoridor.model.*;

import static org.junit.Assert.*;

public class QuoridorSettingsTest {
  private QuoridorSettings settings;



  @Before
  public final void setUp(){
    settings = new QuoridorSettings("a", "b");
  }

  @Test
  public final void testQuoridorSettings(){
    assertNotNull("instance non creee", settings);
  }



  @Test
  public final void testSaveGame(){
    //settings.saveGame();
  }


  @Test
  public final void testLoadGame(){
    // TODO - spécifier le nom du fichier de sauvegarde.
    settings.saveGame();
    QuoridorSettings settings2;
    settings2.loadGame("nom du fichier");

    assertEquals(settings, settings2);
  }
}
