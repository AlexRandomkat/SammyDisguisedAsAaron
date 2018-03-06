package org.usfirst.frc.team6644.robot.commands;

import org.usfirst.frc.team6644.robot.subsystems.drive.DriveMotors;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RunGearboxUntilEmergencyStop extends Command {

    public RunGearboxUntilEmergencyStop() {
        requires(DriveMotors.getInstance());
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	DriveMotors.getInstance().startAutoMode();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	DriveMotors.getInstance().arcadeDrive(0.55,0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	DriveMotors.getInstance().stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
