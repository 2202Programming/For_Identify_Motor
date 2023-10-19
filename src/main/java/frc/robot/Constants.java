// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. 
 * This class should not be used for any other purpose. 
 * All constants should be declared globally (i.e. public static). 
 * Do not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {

  // RoboRio and CAN ports

  public static final class CAN {
    // FRC DEFAULTS
    public static final int PDP = 1; // for rev
    public static final int PCM1 = 2; // for rev

  }

  // PWM assignments on the Rio
  public static final class PWM {
    // TODO - MrL put the drivetrain pwm ports here

  }

  // Digital IO on the RIO
  public static final class DigitalIO {
    // TODO - MrL encoders will use DIO ports
  }

  public static final class AnalogIn {
    // public static final int MAGAZINE_ANGLE = 0;
  }

  // PWM assignments on the Rio
  public static final class PCM1 {
    // static final int <name> = 0;

  }

  // if we use a second PCM
  public static final class PCM2 {
  }

  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

  public static final class DriverControls {

    public enum Id {
      Driver(0), Operator(1), SwitchBoard(2), Phantom(3);

      public final int value;

      Id(int value) {
        this.value = value;
      }
    }

    public enum DriverMode {
      Arcade(0), Tank(1), XYRot(2);

      public final int value;

      DriverMode(int value) {
        this.value = value;
      }
    }
  }
}