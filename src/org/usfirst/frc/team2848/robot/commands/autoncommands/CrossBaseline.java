package org.usfirst.frc.team2848.robot.commands.autoncommands;

import org.usfirst.frc.team2848.robot.commands.drivecommands.AllOmnis;
import org.usfirst.frc.team2848.robot.commands.drivecommands.DriveToDistance;
import org.usfirst.frc.team2848.robot.commands.drivecommands.NoOmnis;
import org.usfirst.frc.team2848.robot.commands.drivecommands.ShiftHigh;
import org.usfirst.frc.team2848.robot.commands.drivecommands.ShiftLow;
import org.usfirst.frc.team2848.robot.commands.drivecommands.testZeroGyro;
import org.usfirst.frc.team2848.robot.commands.intakecommands.ZeroIntake;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CrossBaseline extends CommandGroup {

    public CrossBaseline() {
    	addSequential(new ShiftLow());
    	addSequential(new NoOmnis());
    	addSequential(new ZeroIntake());
    	addSequential(new testZeroGyro());
    	
    	addSequential(new DriveToDistance(100));
    	addSequential(new ShiftHigh());
    	addSequential(new AllOmnis());
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
