package net.jcornelio.projects.desingpattern.builder.builders;

import net.jcornelio.projects.designpattern.builder.domain.Robot;

public interface RobotBuilder {

	Robot getRobot();
	void buildRobotHead();
	void buildRobotTorso();
	void buildRobotLegs();
	void buildRobotArms();
	
}
