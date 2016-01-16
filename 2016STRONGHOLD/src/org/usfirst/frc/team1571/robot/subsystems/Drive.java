package org.usfirst.frc.team1571.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team1571.robot.RobotMap;
import org.usfirst.frc.team1571.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 *
 */
public class Drive extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private RobotDrive myRobot = new RobotDrive(
		RobotMap.LeftMidMotor, RobotMap.LeftBackMotor,
		RobotMap.RightMidMotor, RobotMap.RightBackMotor);
	
	
	
	
	
	
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveWithJoystick());
    }
    
    public void arcadeDrive(Joystick mainStick) {
    	myRobot.arcadeDrive(mainStick);
    }
    
    public void stopDriving() {
    	myRobot.drive(0.0, 0.0);
    }
}

