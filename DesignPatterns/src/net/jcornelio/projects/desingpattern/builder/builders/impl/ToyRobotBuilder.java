package net.jcornelio.projects.desingpattern.builder.builders.impl;

import net.jcornelio.projects.designpattern.builder.domain.Robot;
import net.jcornelio.projects.desingpattern.builder.builders.RobotBuilder;

public class ToyRobotBuilder implements RobotBuilder{

	private Robot robot;
	
	public ToyRobotBuilder() {
		robot = new Robot();
	}
	
	@Override
	public Robot getRobot() {
		return robot;
	}

	@Override
	public void buildRobotHead() {
		robot.setRobotHead("Small Head");
	}

	@Override
	public void buildRobotTorso() {
		robot.setRobotTorso("Relatively Small Torso");
	}

	@Override
	public void buildRobotLegs() {
		robot.setRobotLegs("Short Legs");
	}

	@Override
	public void buildRobotArms() {
		robot.setRobotArms("Short Arms");
	}

}
