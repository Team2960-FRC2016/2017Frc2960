package org.usfirst.frc.team2960.robot.subsystems;

import org.usfirst.frc.team2960.robot.PeriodicUpdate;
import org.usfirst.frc.team2960.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DriveTrain extends Subsystem implements PeriodicUpdate  {
	CANTalon rt1;
	CANTalon rt2;
	CANTalon lt1;
	CANTalon lt2;
	DigitalInput photoeye;
	
	public DriveTrain(){
		rt1 = new CANTalon(RobotMap.rt1);
		rt2 = new CANTalon(RobotMap.rt2);
		lt1 = new CANTalon(RobotMap.lt1);
		lt2 = new CANTalon(RobotMap.lt2);
		photoeye = new DigitalInput(RobotMap.photoeye);
		
	}
	public void setSpeed(double right, double left){
		rt1.set(right);
		rt2.set(right);
		lt1.set(-left);
		lt2.set(-left);
	}
	@Override
	public void update() {
		SmartDashboard.putBoolean("photoeye", photoeye.get());
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void initDefaultCommand() {
		rt1.set(0);
		rt2.set(0);
		lt1.set(0);
		lt2.set(0);
		
	}

}