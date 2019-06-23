package test;

import java.awt.Color;
import org.junit.Test;
import quoridor.model.*;

import static org.junit.Assert.*;
import org.junit.*;





public class GameTest {

  Board board;

  @Test
  public void testGame() {
      Game game = new Game(11, "test1", "test2", Gamemode.HA);
      assertNotNull(game);
      assertNotNull(game.getPlayer1());
      assertNotNull(game.getPlayer2());

  }




  @Test
  public void testGetPlayer1() {
    Game game = new Game(11, "test1", "test2", Gamemode.HH);
    assertEquals("test1", game.getPlayer1().toString());
  }

  @Test
  public void testGetPlayer2() {
    Game game = new Game(11, "test1", "test2", Gamemode.HH);
    assertEquals("test2", game.getPlayer2().toString());
  }






}
