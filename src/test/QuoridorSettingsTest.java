package quoridor.test;

import quoridor.model.*;

import static org.junit.Assert.*;
import org.junit.*;

@Ignore
public class QuoridorSettingsTest {
  private QuoridorSettings settings;



  @Test
	public final void testQuoridorSettings() {
    Quoridorsettings settings = new QuoridorSettings();
    assertNotNull("instance non creee", settings);
	}


  @Test
	public final void testSetPlayerName1(String playerName1) {
    Quoridorsettings settings = new QuoridorSettings();
    settings.setPlayerName1("a");
    assertEquals("a", settings.getPlayerName1());

	}

  @Test
	public final void testSetPlayerName2(String playerName2) {
    Quoridorsettings settings = new QuoridorSettings();
    settings.setPlayerName2("b");
    assertEquals("b", settings.getPlayerName2());
	}

  @Test
	public final void testSetGamemode(Gamemode gamemode) {
		Quoridorsettings settings = new QuoridorSettings();
    settings.setGamemode(Gamemode.HH);
    assertEquals(Gamemode.HH, settings.getGameMode());
	}
}
