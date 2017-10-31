package org.usfirst.frc.team696.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	final String defaultAuto = "Default";
	final String customAuto = "My Auto";
	String autoSelected;
	SendableChooser<String> chooser = new SendableChooser<>();
	
//	RobotDrive drive1 = new RobotDrive(9, 10, 2, 4);
	RobotDrive drive2 = new RobotDrive(8, 3);
	Joystick joy = new Joystick(0);
	PowerDistributionPanel pdp = new PowerDistributionPanel();
	double midLeftCurrentDraw = pdp.getCurrent(2);
	double midRightCurrentDraw = pdp.getCurrent(13);
	double speed;
	double wheel;
	double currentDrawJoy;
	double leftDrive;
	double rightDrive;

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		chooser.addDefault("Default Auto", defaultAuto);
		chooser.addObject("My Auto", customAuto);
		SmartDashboard.putData("Auto choices", chooser);
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString line to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional comparisons to the
	 * switch structure below with additional strings. If using the
	 * SendableChooser make sure to add them to the chooser code above as well.
	 */
	@Override
	public void autonomousInit() {
		autoSelected = chooser.getSelected();
		// autoSelected = SmartDashboard.getString("Auto Selector",
		// defaultAuto);
		System.out.println("Auto selected: " + autoSelected);
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		switch (autoSelected) {
		case customAuto:
			// Put custom auto code here
			break;
		case defaultAuto:
		default:
			// Put default auto code here
			break;
		}
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		
		currentDrawJoy = joy.getRawAxis(1) * 3;
		
		speed = joy.getRawAxis(1);
		wheel = joy.getRawAxis(4);
		leftDrive = speed + wheel;
		rightDrive = speed - wheel;
		
		
		
//		if(joy.getRawAxis)
//		for(midRightCurrentDraw = 0; midRightCurrentDraw < 3.325; leftDrive+=0.05) {
//		
//		}
				
		// pdp channel 13 is midright
		// pdp channel 3 is midleft
		
//		System.out.println(joy.getRawAxis(1) * 3);
		System.out.println(pdp.getCurrent(3) * 10);
		
//		drive1.tankDrive(leftDrive, rightDrive);
		drive2.tankDrive(leftDrive, rightDrive);
	}

	/**
	 * This function is called periodically during test mode
	 */
	
	
	@Override
	public void testPeriodic() {
		
		
		
		
	}
}

