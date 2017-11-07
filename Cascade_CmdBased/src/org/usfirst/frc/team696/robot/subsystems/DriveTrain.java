package org.usfirst.frc.team696.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	RobotDrive drive1 = new RobotDrive(9, 10, 2, 4);
	RobotDrive drive2 = new RobotDrive(8,3);
	
	public DriveTrain(RobotDrive drive1, RobotDrive drive2) {
		
	
		
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

