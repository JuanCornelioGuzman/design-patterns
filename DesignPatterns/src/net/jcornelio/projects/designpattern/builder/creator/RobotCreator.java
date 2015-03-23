package net.jcornelio.projects.designpattern.builder.creator;

import net.jcornelio.projects.designpattern.builder.domain.Robot;
import net.jcornelio.projects.desingpattern.builder.builders.RobotBuilder;

public class RobotCreator {

	private RobotBuilder builder;
	
	public RobotCreator(RobotBuilder builder) {
		this.builder = builder;
	}
	
	public Robot getRobot() {
		return builder.getRobot();
	}
	
	public void makeRobot(){
		builder.buildRobotHead();
		builder.buildRobotTorso();
		builder.buildRobotArms();
		builder.buildRobotLegs();
	}
}
