// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import javax.print.CancelablePrintJob;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
  private final CANSparkMax topMotor;
  private final CANSparkMax bottomMotor;
  private final DoubleSolenoid solenoid;
  /** Creates a new Intake. */
  public Intake() {
    topMotor = new CANSparkMax(Constants.kPorts.INTAKE_TOP_MOTOR, MotorType.kBrushless);
    bottomMotor = new CANSparkMax(Constants.kPorts.INTAKE_BOTTOM_MOTOR, MotorType.kBrushless);
    solenoid = new DoubleSolenoid(PneumaticsModuleType.REVPH, 0, 2);
    solenoid.set(Value.kReverse);
  }
  
  public void extendIntake() {
    solenoid.set(Value.kForward);
  }

  public void retractIntake() {
    solenoid.set(Value.kReverse);
  }

  public void runIntakeMotors() {
      topMotor.set(0.5);
      bottomMotor.set(0.5);
  }

  public void reverseIntakeMotors() {
    topMotor.set(-0.5);
    bottomMotor.set(-0.5);
  }

  public void stopIntakeMotors() {
    topMotor.set(0);
    bottomMotor.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    //topMotor.set(0.5);
    //bottomMotor.set(0.5);
  }
}
