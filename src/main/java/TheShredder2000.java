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
		setBodyColor(java.awt.Color.green);
        setGunColor(java.awt.Color.green);
        setRadarColor(java.awt.Color.green);
        setBulletColor(java.awt.Color.green);
        setScanColor(java.awt.Color.green);

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			turnRadarLeft(45);
			ahead(100);
			turnLeft(90);
			ahead(200);
			turnLeft(90);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		if (e.getDistance() < 300) {
            // Turn the radar to focus on the enemy
            turnRadarRight(getRadarTurnRemaining());
            // Turn the gun to target the enemy
            turnGunRight(getHeading() - getGunHeading() + e.getBearing());
            // Fire at the enemy
            fire(3);
        } else {
            // If the enemy is far away, turn the radar to continue scanning
            turnRadarRight(360);
        }
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		turnLeft(90);
		ahead(300);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		turnLeft(90);
	}	
}
