package org.usfirst.frc.team2848.robot.commands.autoncommands;

import org.usfirst.frc.team2848.robot.Robot;
import org.usfirst.frc.team2848.robot.commands.drivecommands.BackAway;
import org.usfirst.frc.team2848.robot.commands.drivecommands.DriveToDistance;
import org.usfirst.frc.team2848.robot.commands.drivecommands.NoOmnis;
import org.usfirst.frc.team2848.robot.commands.drivecommands.ShiftLow;
import org.usfirst.frc.team2848.robot.commands.drivecommands.VisionTurn;
import org.usfirst.frc.team2848.robot.commands.intakecommands.IntakePID;
import org.usfirst.frc.team2848.robot.commands.intakecommands.SpitGearBreakBeam;
import org.usfirst.frc.team2848.robot.commands.intakecommands.ZeroIntake;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class MiddleAuton extends CommandGroup {

    public MiddleAuton() {
    //non vision	
    	/*
    	addSequential(new ShiftLow());
    	addSequential(new NoOmnis());
    	addSequential(new ZeroIntake());
        addSequential(new DriveToDistance(68));
        addSequential(new IntakePID(Robot.intake.spitPos));
        addSequential(new SpitGearBreakBeam());
        addSequential(new Wait(.25));
   		addSequential(new DriveToDistance(-20));
   		*/
    	addSequential(new ShiftLow());
    	addSequential(new NoOmnis());
    	addSequential(new ZeroIntake());
    	addParallel(new IntakePID(Robot.intake.visionPos));
        addSequential(new DriveToDistance(45));
        addSequential(new VisionTurn());
       
       
        //addSequential(new IntakePID(Robot.intake.spitPos));
        System.out.println(Robot.distance);
        addSequential(new IntakePID(Robot.intake.spitPos));
         addSequential(new DriveToDistance(27));
         
        addParallel(new SpitGearBreakBeam());
        addSequential(new Wait(.25));
   		addSequential(new BackAway());
   		
   		
    }
    
}
