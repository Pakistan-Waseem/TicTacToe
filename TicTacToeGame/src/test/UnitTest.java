/**
 * 
 */
package test;
import java.util.ArrayList;
import java.util.Scanner;

import player.*;
import simulator.*;
import visual.*;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author waseem
 *
 */
public class UnitTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
    //This test method is test either simulator object is created or not
	@Test
	public void testSimulatorConstructor() {
		Simulator simulator;
		Visualizer visualizer=new Visualizer();
		ArrayList<Player> Players=new ArrayList<Player>();
		PlayerFactory playerfactory=new PlayerFactory();
		Player player=playerfactory.createPlayer("Player", true);
		Players.add(player);
		simulator=new Simulator(Players,visualizer);
		assertNotEquals(simulator, null);
	}
	//This test method is test either field is empty or not
	@Test
	public void testGameFieldIsEmpty() {
		Simulator simulator;
		Visualizer visualizer=new Visualizer();
		ArrayList<Player> Players=new ArrayList<Player>();
		PlayerFactory playerfactory=new PlayerFactory();
		Player player=playerfactory.createPlayer("Player", true);
		Players.add(player);
		simulator=new Simulator(Players,visualizer);
		assertTrue(simulator.IsFieldEmpty(4));
	}
	//This test method is test Player is created well or not 
		@Test
		public void testPlayer() {
			PlayerFactory playerfactory=new PlayerFactory();
			Player player=playerfactory.createPlayer("Player", true);
			assertNotEquals(player,null);
		}
}
