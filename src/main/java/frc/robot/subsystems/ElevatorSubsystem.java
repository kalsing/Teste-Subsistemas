package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ElevatorSubsystem extends SubsystemBase {

    private final SparkMax MotorElevator = new SparkMax(1, 99, MotorType.kBrushless);
    private final SparkMax MotorElevatorFollower = new SparkMax(1, 99, MotorType.kBrushless);

    public ElevatorSubsystem() {
        SparkMaxConfig masterconfig = new SparkMaxConfig();
        masterconfig.inverted(false);
        MotorElevator.configure(masterconfig, null, null);

        SparkMaxConfig followerconfig = new SparkMaxConfig();
        followerconfig.inverted(true);
        followerconfig.follow(99);
        MotorElevator.configure(followerconfig, null, null);
    }

    public void runElevator(){
        MotorElevator.set(-0.2);
    }

    public void stopElevator(){
            MotorElevator.set(0);
    }

        



}

