import robocode.*;
//import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * TheShredder2000 - a robot by (your name here)
 */
public class TheShredder2000 extends Robot
{
	/**
	 * run: TheShredder2000's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here
		setBodyColor(java.awt.Color.yellow);
        setGunColor(java.awt.Color.yellow);
        setRadarColor(java.awt.Color.yellow);
        setBulletColor(java.awt.Color.yellow);
        setScanColor(java.awt.Color.yellow);

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(800);

			turnLeft(25);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		double absoluteBearing = getHeading() + e.getBearing();
    
    	// Turn the gun to aim at the enemy
    	double gunTurn = absoluteBearing - getGunHeading();
    	turnGunRight(gunTurn);
		fire(1);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		turnLeft(33);
		ahead(500);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		turnLeft(33);
	}	
}
