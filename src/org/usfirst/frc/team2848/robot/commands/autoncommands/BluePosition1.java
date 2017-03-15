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
public class BluePosition1 extends CommandGroup {

    public BluePosition1() {
    	addSequential(new ShiftLow());
    	addSequential(new NoOmnis());
    	addSequential(new ZeroIntake());
    	addSequential(new testZeroGyro());
    
    	addSequential(new DriveToDistance(70.3)); 
    	addParallel(new IntakePIDNonStop(Robot.intake.visionPos));
    	//addParallel(new IntakePIDNonStop(Robot.intake.spitPos));
    	addSequential (new GyroTurn(60));
    	addSequential(new DriveToDistance(39));
    	addSequential(new VisionTurn());
    	addSequential(new IntakePID(Robot.intake.spitPos));
    	addSequential(new DriveToDistance(29)); 
    	addParallel(new SpitGearBreakBeam());
    	addSequential(new BackAway());
//    	addSequential(new GyroTurn(60));
//    	addSequential(new DriveToDistance(60));
//    	addSequential(new ShiftHigh());
//    	addSequential(new AllOmnis());
    }
}
