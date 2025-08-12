// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.subsystems.ElevatorSubsystem;
import frc.robot.subsystems.IntakeSubsystem;


public class RobotContainer {

  private final IntakeSubsystem intakeSubsystem = new IntakeSubsystem();
  private final ArmSubsystem armSubsystem = new ArmSubsystem();
  private final ElevatorSubsystem elevatorSubsystem = new ElevatorSubsystem();

   private final Joystick joystick = new Joystick(0);
    private final XboxController controller = new XboxController(0);
  public RobotContainer() {

    configureBindings();
  }
  private void configureBindings() {

    new Trigger(controller::getAButton)
    .onTrue(
        Commands.run(() -> intakeSubsystem.runIntake(), intakeSubsystem)
            .until(() -> controller.getBButton())
            .andThen(() -> intakeSubsystem.stopIntake(), intakeSubsystem)
    );

new Trigger(controller::getYButton)
    .onTrue(
        Commands.run(() -> elevatorSubsystem.runElevator(), elevatorSubsystem)
            .until(() -> controller.getBButton())
            .andThen(() -> elevatorSubsystem.stopElevator(), elevatorSubsystem));

            new Trigger(controller::getXButton)
    .onTrue(
        Commands.run(() -> armSubsystem.endEffectorCollect(), armSubsystem)
            .until(() -> controller.getBButton())
            .andThen(() -> armSubsystem.stopEndEffector(), elevatorSubsystem)
    );
  }
}