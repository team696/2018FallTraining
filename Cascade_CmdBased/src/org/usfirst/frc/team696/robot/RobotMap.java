package org.usfirst.frc.team696.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static int fleftmotor = 9;
	public static int mleftmotor = 8;
	public static int rleftmotor = 10;
	public static int frightmotor = 2;
	public static int mrightmotor = 3;
	public static int rrightmotor = 4;
	public static int sideswipe = 7;
	public static int leftdriveencoder1 = 2;
	public static int leftdriveencoder2 = 3;
	public static int rightdriveencoder1 = 0;
	public static int rightdriveencoder2 = 1;
	public static int conveyermotor = 1;
	public static int mastershootertalon = 1;
	public static int slaveshootertalon = 2;
	public static int climbermotorone = 5;
	public static int climbermotortwo = 6;
	public static int leftservo = 15;
	public static int rightservo = 14;
	public static int gearpivot = 3;
	public static int gearintake = 11;
	public static int gearintakepdpchannel = 9;
	public static int hopperservo1 = 19;
	public static int hopperservo2 = 18;
	
	public static int []drive1 = new int[4];{
		
		drive1[0]= 9;
		drive1[1]= 10;
		drive1[2]= 2;
		drive1[3]= 4;
	}
	public static int []drive2 = new int[2];{
		
		drive2[0] = 8;
		drive2[1] = 3;
		
	}
	
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
