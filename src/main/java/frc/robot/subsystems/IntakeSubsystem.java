package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {

    private final SparkMax MotorIntake = new SparkMax(1, 99, MotorType.kBrushless);

    public IntakeSubsystem() {}

    public void runIntake(){
        MotorIntake.set(0.7);
    }

    public void stopIntake(){
        MotorIntake.set(0);
    }

        



}

