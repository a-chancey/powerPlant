package powerPlant;

import static org.junit.Assert.*;

import org.junit.*;

public class PowerPlantTest {
	PowerPlant powerPlant;
	private int totalDays;
	
	@Before
	public void Setup(){
		powerPlant = new PowerPlant();
	}
	
	@Test
	public void testPowerPlantSimulation10Days(){
		totalDays = 10;
		int daysRunning;
		daysRunning = powerPlant.simulate(totalDays);
		
		assertEquals(7, daysRunning);
	}
	
	@Test
	public void testPowerPlantSimulation20Days(){
		totalDays = 20;
		int daysRunning;
		daysRunning = powerPlant.simulate(totalDays);
		
		assertEquals(13, daysRunning);
	}
	@Test
	public void testPowerPlantSimulation101Days(){
		totalDays = 101;
		int daysRunning;
		daysRunning = powerPlant.simulate(totalDays);
		
		assertEquals(62, daysRunning);
	}
	
}
