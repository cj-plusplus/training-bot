// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Manipulator extends SubsystemBase {
  private final CANSparkMax manipulator_motor;
  /** Creates a new Manipulator. */
  public Manipulator() {
    manipulator_motor = new CANSparkMax(Constants.kPorts.MANIPULATOR_MOTOR, MotorType.kBrushless);
    manipulator_motor.setSmartCurrentLimit(20);
  }

  public void runManipulatorMotors() {
    manipulator_motor.set(0.5);
  }
  public void reverseManipulatorMotors() {
    manipulator_motor.set(-0.5);
  }

  public void stopManipulatorMotors() {
    manipulator_motor.set(0);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
