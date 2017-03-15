package org.usfirst.frc.team2848.robot.commands.autoncommands;

import org.usfirst.frc.team2848.robot.Robot;
import org.usfirst.frc.team2848.robot.commands.drivecommands.BackAway;
import org.usfirst.frc.team2848.robot.commands.drivecommands.DriveToDistance;
import org.usfirst.frc.team2848.robot.commands.drivecommands.GyroTurn;
import org.usfirst.frc.team2848.robot.commands.drivecommands.NoOmnis;
import org.usfirst.frc.team2848.robot.commands.drivecommands.ShiftLow;
import org.usfirst.frc.team2848.robot.commands.drivecommands.VisionTurn;
import org.usfirst.frc.team2848.robot.commands.drivecommands.testZeroGyro;
import org.usfirst.frc.team2848.robot.commands.intakecommands.IntakePID;
import org.usfirst.frc.team2848.robot.commands.intakecommands.IntakePIDNonStop;
import org.usfirst.frc.team2848.robot.commands.intakecommands.SpitGearBreakBeam;
import org.usfirst.frc.team2848.robot.commands.intakecommands.ZeroIntake;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class BluePosition3 extends CommandGroup {

    public BluePosition3() {
    	addSequential(new ShiftLow());
    	addSequential(new NoOmnis());
    	addSequential(new ZeroIntake());
    	addSequential(new testZeroGyro());
    
    	addSequential(new DriveToDistance(66.3)); //initially 70.3
    	addParallel(new IntakePIDNonStop(Robot.intake.visionPos));
    	//addParallel(new IntakePIDNonStop(Robot.intake.spitPos));
    	addSequential (new GyroTurn(-60));
    	addSequential(new DriveToDistance(38)); //initially 30
    	addSequential(new VisionTurn());
    	addParallel(new IntakePID(Robot.intake.spitPos));
    	addSequential(new DriveToDistance(34));
    	addParallel(new SpitGearBreakBeam());
    	addSequential(new BackAway());
//    	addSequential(new ShiftHigh());
//    	addSequential(new AllOmnis());
    }
}
