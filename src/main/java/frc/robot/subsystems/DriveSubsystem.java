package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveSubsystem extends Subsystem{
    private DifferentialDrive differentialDrive;
    

    public DriveSubsystem(SpeedController leftSpeedController, SpeedController rightSpeedController){
        this.differentialDrive = new DifferentialDrive(leftSpeedController, rightSpeedController);
        

    }

    public void arcadeDrive(double velocity, double heading){
        differentialDrive.arcadeDrive(velocity, heading);

    }
    
    @Override
    protected void initDefaultCommand() {
        // TODO Auto-generated method stub

    }
    
}