package org.usfirst.frc.team2848.robot.commands.drivecommands;

import org.usfirst.frc.team2848.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class VisionDrive extends Command {
	private double setpoint;
	Timer timer = new Timer();
	
	public VisionDrive() {
		requires(Robot.drivetrain);
	}
    

    protected void initialize() {
    	Robot.drivetrain.leftEncoder.reset();
    	Robot.drivetrain.rightEncoder.reset();
    	
    	Robot.drivetrain.leftEncoder.setDistancePerPulse(.0493);
    	Robot.drivetrain.rightEncoder.setDistancePerPulse(.0488);
    	 setpoint=Robot.distance-16;
    	Robot.drivetrain.setOutputRange(-.5, .5); //good at .9
    	Robot.drivetrain.setSetpoint(setpoint);
    	
    	Robot.drivetrain.enable();
    	timer.start();
    	 setpoint=Robot.distance-20;
    }

    protected void execute() {
    	
    }

    protected boolean isFinished() {
    	System.out.println("Error: " + Robot.drivetrain.getPIDController().getError());
    	System.out.println("PID Out: " + Robot.drivetrain.getPIDController().get());
    	
    	if(timer.get() > 3)
    		return true;
    	return false;
        //return (Math.abs(Robot.drivetrain.getPosition()-setpoint) < .5);
    }

    protected void end() {
    	Robot.drivetrain.disable();
//    	Robot.drivetrain.leftDrive1.set(0);
//    	Robot.drivetrain.leftDrive2.set(0);
//    	Robot.drivetrain.leftDrive3.set(0);
//    	Robot.drivetrain.rightDrive1.set(0);
//    	Robot.drivetrain.rightDrive2.set(0);
//    	Robot.drivetrain.rightDrive3.set(0);
    }

    protected void interrupted() {
    	end();
    }
}