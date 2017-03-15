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
public class RedPosition3 extends CommandGroup {

    public RedPosition3() {
    	// non vision
    	/*
    	addSequential(new ShiftLow());
    	addSequential(new NoOmnis());
    	addSequential(new ZeroIntake());
    	addSequential(new testZeroGyro());
//    	addParallel(new IntakePIDNonStop(Robot.intake.visionPos));
    	addSequential(new DriveToDistance(70.3));
    	addSequential(new Wait(.75));
    	addSequential (new GyroTurn(-60));
    	
    	addSequential(new Wait(.75));
    	addSequential(new DriveToDistance(55));//ian lowered at 813
    	addParallel(new IntakePID(Robot.intake.spitPos));
//    	addSequential(new VisionTurn());
//    	addSequential(new IntakePIDNonStop(Robot.intake.spitPos));
//    	addSequential(new DriveToDistance(45));
    	addSequential(new SpitGearBreakBeam());
    	addSequential(new DriveToDistance(-20));
    	*/
    	

    	addSequential(new ShiftLow());
    	addSequential(new NoOmnis());
    	addSequential(new ZeroIntake());
    	addSequential(new testZeroGyro());
    
    	addSequential(new DriveToDistance(74.3)); //was 70.3
    	addParallel(new IntakePIDNonStop(Robot.intake.visionPos));
    	//addParallel(new IntakePIDNonStop(Robot.intake.spitPos));
    	addSequential (new GyroTurn(-60));
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
