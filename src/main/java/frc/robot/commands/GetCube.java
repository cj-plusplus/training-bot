// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.Indexer;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Manipulator;

public class GetCube extends CommandBase{
  private final Indexer indexer;
  private final Intake intake;
  private final Manipulator manipulator;
  private final boolean reversed;
  
  /** Creates a new GetCube. */
  public GetCube(Indexer indexer, Intake intake, Manipulator manipulator, boolean reversed) {
    this.indexer = indexer;
    this.intake = intake;
    this.manipulator = manipulator;
    this.reversed = reversed;
    addRequirements(indexer, intake, manipulator);
    
    // Use addRequirements() here to declare subsystem dependencies.
  }
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void initialize() {
    intake.extendIntake();
    if (!reversed) {
      indexer.runIndexer();
      intake.runIntakeMotors();
      manipulator.runManipulatorMotors();
    } else {
      indexer.reverseIndexer();
      intake.reverseIntakeMotors();
      manipulator.reverseManipulatorMotors();
    }
    }

  @Override
  public void execute() {
    
  }
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    intake.retractIntake();
    intake.stopIntakeMotors();
    indexer.stopIndexer();
    manipulator.stopManipulatorMotors();
  }

  
}
