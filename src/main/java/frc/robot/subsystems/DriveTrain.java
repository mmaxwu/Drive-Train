package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
    TalonFX frontLeftMotor = new TalonFX(Constants.DriveTrainConstants.frontLeftMotor);
    TalonFX bottomLeftMotor = new TalonFX(Constants.DriveTrainConstants.bottomLeftMotor);
    TalonFX frontRightMotor = new TalonFX(Constants.DriveTrainConstants.frontRightMotor);
    TalonFX bottomRightMotor = new TalonFX(Constants.DriveTrainConstants.bottomRightMotor);
    
    public DriveTrain() {
        frontLeftMotor.setInverted(true);
        bottomLeftMotor.setInverted(true);
    }

    public DriveTrain(DriveTrain m_DriveTrain, Object object) {
    }

    public void setMotorSpeed(double lspeed, double rspeed) {
        frontLeftMotor.set(ControlMode.PercentOutput, lspeed);
        bottomLeftMotor.set(ControlMode.PercentOutput, lspeed);
        frontRightMotor.set(ControlMode.PercentOutput, rspeed);
        bottomRightMotor.set(ControlMode.PercentOutput, rspeed);
    }
    
    public void stop() {
        frontLeftMotor.set(ControlMode.PercentOutput, 0);
        bottomLeftMotor.set(ControlMode.PercentOutput, 0);
        frontRightMotor.set(ControlMode.PercentOutput, 0);
        bottomRightMotor.set(ControlMode.PercentOutput, 0);
    } 
}