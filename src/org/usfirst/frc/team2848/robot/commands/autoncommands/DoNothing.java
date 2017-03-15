package org.usfirst.frc.team2848.robot.commands.autoncommands;

import org.usfirst.frc.team2848.robot.commands.drivecommands.AllOmnis;
import org.usfirst.frc.team2848.robot.commands.drivecommands.ShiftHigh;
import org.usfirst.frc.team2848.robot.commands.drivecommands.testZeroGyro;
import org.usfirst.frc.team2848.robot.commands.intakecommands.ZeroIntake;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DoNothing extends CommandGroup {

    public DoNothing() {
    	addSequential(new ShiftHigh());
    	addSequential(new AllOmnis());
    	addSequential(new ZeroIntake());
    	addSequential(new testZeroGyro());
    	
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}