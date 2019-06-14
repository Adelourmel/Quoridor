package test;

import quoridor.model.*;

import static org.junit.Assert.*;
import org.junit.*;

@Ignore
public class QuoridorSettingsTest {
  private QuoridorSettings settings;



  @Test
	public final void testQuoridorSettings() {
    QuoridorSettings settings = new QuoridorSettings();
    assertNotNull("instance non creee", settings);
	}


  @Test
	public final void testSetPlayerName1(String playerName1) {
    QuoridorSettings settings = new QuoridorSettings();
    settings.setPlayerName1("a");
    assertEquals("a", settings.getPlayerName1());

	}

  @Test
	public final void testSetPlayerName2(String playerName2) {
    QuoridorSettings settings = new QuoridorSettings();
    settings.setPlayerName2("b");
    assertEquals("b", settings.getPlayerName2());
	}

  @Test
	public final void testSetGamemode(Gamemode gamemode) {
		QuoridorSettings settings = new QuoridorSettings();
    settings.setGamemode(Gamemode.HH);
    assertEquals(Gamemode.HH, settings.getGameMode());
	}
}
