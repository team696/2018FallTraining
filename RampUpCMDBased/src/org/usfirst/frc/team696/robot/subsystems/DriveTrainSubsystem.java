package org.usfirst.frc.team696.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrainSubsystem extends Subsystem {
	
	RobotDrive drive1;
	RobotDrive drive2;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public DriveTrainSubsystem(int frontLeft, int backLeft, int midLeft, 
								int frontRight, int backRight, int midRight) {
		
		this.drive1 = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
		this.drive2 = new RobotDrive(midLeft, midRight);
		
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void run(double leftDrive, double rightDrive) {
    	
    	drive1.tankDrive(leftDrive, rightDrive);
    	drive2.tankDrive(leftDrive, rightDrive);
    	
    }
}

