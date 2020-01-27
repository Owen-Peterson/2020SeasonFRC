/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {

  public DifferentialDrive m_drive;

  

  /**
   * Creates a new drivetrain.
   */
  public  Drivetrain() {

    
  
    //Motor controllers for 4 drive motors
    SpeedController m_frontLeft = new Spark(0);
    SpeedController m_rearLeft = new Spark(1);
    SpeedController m_frontRight = new Spark(2);
    SpeedController m_rearRight = new Spark(3);
   
    //Speed Controller Groups that allow independent motor control for seperate sides
    SpeedControllerGroup driveLeft = new SpeedControllerGroup(m_frontLeft, m_rearLeft);
    SpeedControllerGroup driveRight = new SpeedControllerGroup(m_frontRight, m_rearRight);

    //m_drive = new DifferentialDrive(driveLeft, driveRight);
  

    }  

    public void teleop(double x, double y){
      tankDrive(x,y);
      }


    private void tankDrive(double incomingX, double incomingY){

      
    
    }
    
    
    
    

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }
}
