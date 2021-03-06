package org.usfirst.frc.team5104.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Joystick;

public class Winch {

	CANTalon winchMotor;
	Joystick stick;

	public Winch(Joystick mystick) {
		winchMotor = new CANTalon(34); // need the number
		stick = mystick;

	}

	public void teleop() {
		if (stick.getRawAxis(Charlotte.winch_axis) < 0.05)
			winchMotor.set(0); // do nothing if input is too low
		else
			winchMotor.set(stick.getRawAxis(Charlotte.winch_axis));

	}

}
