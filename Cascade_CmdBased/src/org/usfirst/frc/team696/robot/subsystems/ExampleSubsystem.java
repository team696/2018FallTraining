package org.usfirst.frc.team696.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */ 
public class ExampleSubsystem extends Subsystem {
	VictorSP sideswipemotor;
	
	

	public ExampleSubsystem(int sideswipeport) {
		this.sideswipemotor = new VictorSP(sideswipeport);
		
	}
	
	
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
