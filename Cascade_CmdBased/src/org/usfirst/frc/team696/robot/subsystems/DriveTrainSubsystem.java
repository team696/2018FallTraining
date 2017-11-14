package org.usfirst.frc.team696.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrainSubsystem extends Subsystem {
	
	public static RobotDrive drive1;
	public static RobotDrive drive2;
	
	public DriveTrainSubsystem(int fleftmotor, int mleftmotor, int rleftmotor, 
			int frightmotor, int mrightmotor, int rrightmotor ) {
		
	this.drive1 = new RobotDrive(fleftmotor, rleftmotor, 
			frightmotor, rrightmotor);
	this.drive2 = new RobotDrive(mleftmotor, mrightmotor);
		
	
	
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

