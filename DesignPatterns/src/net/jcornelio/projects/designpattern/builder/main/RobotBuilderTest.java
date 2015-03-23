package net.jcornelio.projects.designpattern.builder.main;

import net.jcornelio.projects.designpattern.builder.creator.RobotCreator;
import net.jcornelio.projects.desingpattern.builder.builders.RobotBuilder;
import net.jcornelio.projects.desingpattern.builder.builders.impl.NoveltyRobotBuilder;

public class RobotBuilderTest {

	public static void main(String[] args) {
		RobotBuilder robotBuilder = new NoveltyRobotBuilder();
		
		RobotCreator creator = new RobotCreator(robotBuilder);
		
		creator.makeRobot();
		System.out.println("Head: " +creator.getRobot().getRobotHead());
		System.out.println("Torso: " +creator.getRobot().getRobotTorso());
		System.out.println("Arms: " +creator.getRobot().getRobotArms());
		System.out.println("Legs: " +creator.getRobot().getRobotLegs());
	}

}
