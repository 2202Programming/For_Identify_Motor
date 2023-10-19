// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Motor extends SubsystemBase {
  /** Creates a new Motor. */
  private Spark motor;
  public Motor() {
    motor = new Spark(7);//Change accordingly
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void run() {
    motor.set(0.1);
  }
  public void stop() {
    motor.set(0);
  }
}
