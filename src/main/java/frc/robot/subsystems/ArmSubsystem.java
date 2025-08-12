package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystem extends SubsystemBase {

    private final SparkMax MotorEndEffector = new SparkMax(1, 99, MotorType.kBrushless);
    private final SparkMax MotorArm = new SparkMax(1, 99, MotorType.kBrushless);

    public ArmSubsystem() {}

    public void endEffectorCollect(){
        MotorEndEffector.set(0.5);
    }

    public void endEffectorExpell(){
        MotorEndEffector.set(-0.5);
    }

    public void stopEndEffector(){
        MotorEndEffector.set(0);
    }

    public void runArmLeft(){
        MotorEndEffector.set(0.2);
    }

    public void runArmRight(){
        MotorEndEffector.set(-0.2);
    }


        



}

