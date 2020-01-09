/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMSpeedController;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class drivetrain extends SubsystemBase {
  /**
   * Creates a new drivetrain.
   */
  public drivetrain() {

    //Motor controllers for 4 drive motors
    Spark spark0 = new Spark(0);
    Spark spark1 = new Spark(1);
    Spark spark2 = new Spark(2);
    Spark spark3 = new Spark(3);

     
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
