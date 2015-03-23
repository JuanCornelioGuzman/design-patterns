package net.jcornelio.projects.desingpattern.builder.builders.impl;

import net.jcornelio.projects.designpattern.builder.domain.Robot;
import net.jcornelio.projects.desingpattern.builder.builders.RobotBuilder;

public class NoveltyRobotBuilder implements RobotBuilder{

	private Robot robot;
	
	public NoveltyRobotBuilder() {
		robot = new Robot();
	}
	
	@Override
	public Robot getRobot() {
		return robot;
	}

	@Override
	public void buildRobotHead() {
		robot.setRobotHead("Round Head");
	}

	@Override
	public void buildRobotTorso() {
		robot.setRobotTorso("Small Torso");
	}

	@Override
	public void buildRobotLegs() {
		robot.setRobotLegs("Long Legs");
	}

	@Override
	public void buildRobotArms() {
		robot.setRobotArms("Long Arms");
	}

}
