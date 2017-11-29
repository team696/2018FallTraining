package org.usfirst.frc.team696.robot.subsystems;

import org.usfirst.frc.team696.robot.OI;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ConveyerBelt extends Subsystem {

	public static VictorSP conveyer;
	
	public ConveyerBelt(int conveyer) {
	
		 this.conveyer = new VictorSP(conveyer);
		
	}
	
	

    public void initDefaultCommand() {
    	
    	
    	}
    
   
	public void ConveyerCommand() {
		conveyer.set(1.0);
		
	}
	
	
	public void  off() {
		conveyer.set(0.0);
	}
}

