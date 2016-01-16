package org.usfirst.frc.team1571.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team1571.robot.OI;
import org.usfirst.frc.team1571.robot.RobotMap;

/**
 *
 */
public class ArmMotor extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	//private Arm arm = new Arm(RobotMap.windowMotor);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());

    }
    
    public void ArmUp(Joystick mainStick) {
    	//mainStick.getClass() ;
    	///*.WhileHeld*/(new org.usfirst.frc.team1571.robot.commands.ArmUp());
    }
}	


