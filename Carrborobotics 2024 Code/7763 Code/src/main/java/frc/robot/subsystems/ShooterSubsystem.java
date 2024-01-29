// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ShooterSubsystem extends SubsystemBase {
  /** Creates a new ShooterSubsystem. */
  CANSparkMax ShooterRight = new CANSparkMax(Constants.ShooterConstants.kShooterRightId, MotorType.kBrushless);
  CANSparkMax ShooterLeft = new CANSparkMax(Constants.ShooterConstants.kShooterLeftId, MotorType.kBrushless);
  CANSparkMax intake1 = new CANSparkMax(Constants.ShooterConstants.kintake1Id, MotorType.kBrushless);
  CANSparkMax intake2 = new CANSparkMax(Constants.ShooterConstants.kintake2Id, MotorType.kBrushless);
  public ShooterSubsystem() {
   

  }

    public void shooterON(){
        // ArmLeft.setNeutralMode(NeutralMode.Brake);
        ShooterRight.set(25);
        ShooterLeft.set(50);
    }
    public void intakeON(){
     intake1.set(50);
     intake2.set(-50);
    }
    
  
    public void intakeOFF(){
     intake1.set(0);
     intake2.set(0);
    }
    

  

      public void shooterOFF() {
        // ArmLeft.setNeutralMode(NeutralMode.Brake);
        ShooterRight.set(0);
        ShooterLeft.set(0);
    
      }

  @Override
  public void periodic() {
    
    // This method will be called once per scheduler run
  }

 

}
