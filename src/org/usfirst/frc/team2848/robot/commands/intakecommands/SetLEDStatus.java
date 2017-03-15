package org.usfirst.frc.team2848.robot.commands.intakecommands;

import org.usfirst.frc.team2848.robot.Robot;
import org.usfirst.frc.team2848.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SetLEDStatus extends Command {

    public SetLEDStatus() {
    	requires(Robot.intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    
	Intake.out1.set(!Robot.intake.isBeamBroken());
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    
    	Intake.out1.set(!Robot.intake.isBeamBroken());
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
