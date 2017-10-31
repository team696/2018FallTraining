package org.usfirst.frc.team696.robot.subsystems;

import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ExampleSubsystem extends Subsystem {
	
	TalonSRX mastershootertalon = new TalonSRX(1);
	VictorSP gearintake = new VictorSP(11);
	TalonSRX gearpivot = new TalonSRX(13);
	
	
	

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
