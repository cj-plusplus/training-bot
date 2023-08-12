// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class kPorts {
    public static final int INTAKE_TOP_MOTOR = 26;
    public static final int INTAKE_BOTTOM_MOTOR = 20;
    public static final int INDEXER_MOTOR = 21;
    public static final int HOPPER_MOTOR = 25;
    public static final int MANIPULATOR_MOTOR = 24;
  }
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
}
