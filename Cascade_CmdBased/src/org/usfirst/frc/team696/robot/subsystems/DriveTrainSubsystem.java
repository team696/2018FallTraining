package org.usfirst.frc.team696.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrainSubsystem extends Subsystem {
	
	RobotDrive drive1 = new RobotDrive(9, 10, 2, 4);
	RobotDrive drive2 = new RobotDrive(8, 3);
	
	public DriveTrainSubsystem() {
		
		
		
	}

   

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void tankDrive(double leftValue, double rightValue) {
    	drive1.tankDrive(leftValue, rightValue);
    	drive2.tankDrive(leftValue, rightValue);
    	
    }
}

