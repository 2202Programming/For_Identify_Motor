// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.moveMotor;
import frc.robot.commands.stopMotor;
import frc.robot.subsystems.Motor;
import frc.robot.subsystems.hid.HID_Xbox_Subsystem;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  private static RobotContainer rc;
  public final HID_Xbox_Subsystem dc;
  public final Motor motor;

  public static RobotContainer RC() {
    return rc;
  }

  enum Bindings {
    test,
  }
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    RobotContainer.rc = this; 
    dc = new HID_Xbox_Subsystem(0.3, 0.9, 0.05);

    motor = new Motor();
    configureBindings(Bindings.test);
  }

  private void configureBindings(Bindings bindings) {
    var driver = dc.Driver();
    //var operator = dc.Operator();

    switch(bindings) {
      case test:
        driver.x().onTrue(new moveMotor());
        driver.b().onTrue(new stopMotor());
    }
  }
}
