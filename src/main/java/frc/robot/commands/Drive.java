package frc.robot.commands;

import frc.robot.subsystems.DriveTrain;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class Drive extends CommandBase{
    private final DriveTrain m_subsystem;
    private DoubleSupplier ml_speed;
    private DoubleSupplier mr_speed;
    


    public Drive(DriveTrain subsystem, DoubleSupplier lspeed, DoubleSupplier rspeed){
        m_subsystem = subsystem;
        ml_speed = lspeed;
        mr_speed = rspeed;
    
        // Use addRequirements() here to declare subsystem dependencies.
        this.addRequirements(subsystem);
    }


    @Override
    public void initialize() {
        m_subsystem.stop();
    }

    @Override
    public void execute() {
        m_subsystem.setMotorSpeed(ml_speed.getAsDouble(), mr_speed.getAsDouble());
    }

    @Override
    public void end(boolean interrupted) {
        m_subsystem.stop();
    }

    @Override
    public boolean isFinished() {
      return false;
    }
}