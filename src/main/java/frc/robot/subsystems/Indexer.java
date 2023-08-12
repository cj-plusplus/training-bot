// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.CAN;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Indexer extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private final CANSparkMax indexer;
  private final CANSparkMax hopper;


  public Indexer() {
    indexer = new CANSparkMax(Constants.kPorts.INDEXER_MOTOR, MotorType.kBrushless);
    indexer.setInverted(false);
    hopper = new CANSparkMax(Constants.kPorts.HOPPER_MOTOR, MotorType.kBrushless);
    

    indexer.restoreFactoryDefaults();
    indexer.setIdleMode(IdleMode.kCoast);

    hopper.restoreFactoryDefaults();
    hopper.setIdleMode(IdleMode.kCoast);

  }

  public void runIndexer() {
    indexer.set(0.5);
    hopper.set(0.5); 
  }
  public void reverseIndexer() {
    indexer.set(-0.5);
    hopper.set(-0.5); 
  }
  public void stopIndexer() {
    indexer.set(0);
    hopper.set(0); 
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    //indexer.set(0.5);
    //hopper.set(0.5);
  }
}
