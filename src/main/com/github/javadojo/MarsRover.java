package com.github.javadojo;

import java.util.List;

/**
 * The Mars rover is programmed to drive around Mars. Its programming is very
 * simple. The commands are the following:
 * <dl>
 * <dt>s</dt>
 * <dd>drive in a straight line</dd>
 * <dt>r</dt>
 * <dd>turn right</dd>
 * <dt>l</dt>
 * <dd>turn left</dd>
 * </dl>
 *
 * Note that the Mars rover always land at the <code>X</code> and starts by
 * facing east.
 * 
 * The Mars rover can send a 2D string representation of its path back to
 * Mission Control. The following character are used with the following
 * meanings:
 * <dl>
 * <dt>X</dt>
 * <dd>where the Mars rover landed</dd>
 * <dt>*</dt>
 * <dd>current position of the Mars rover</dd>
 * <dt>-</dt>
 * <dd>path in the west-east direction</dd>
 * <dt>|</dt>
 * <dd>path in the north-south direction</dd>
 * <dt>+</dt>
 * <dd>a place where the Mars rover turned or a crossroad</dd>
 * <dt>S</dt>
 * <dd>a place where a sample was taken</dd>
 * </dl>
 */
public class MarsRover {

	private List<Commande> commands;
	private Direction currentDirection;
	private int currentPosition;

	static final String LINE_SEPARATOR = System.getProperty("line.separator");

	private Reporter reporter;

	public MarsRover(String operations) {
		reporter = new MarsRoverReporter();
		Parser parserCommands = MarsRoverCommandParser.getInstance();
		commands = parserCommands.parseCommandes(operations);
	}

	public String path() {
		return reporter.report(commands, currentDirection);
	}

	public MarsRover turnLeft() {
		currentDirection = Direction.WEST;
		commands.add(Commande.GOLEFT);
		return this;
	}

	public MarsRover turnRight() {
		currentDirection = Direction.EST;
		commands.add(Commande.GORIGHT);
		return this;
	}

	public MarsRover moveForward() {
		if (currentDirection == Direction.EST)
			currentDirection = Direction.SOUD;
		else if (currentDirection == Direction.WEST)
			currentDirection = Direction.NORTH;
		commands.add(Commande.GOSTRAIGHTLINE);
		return this;
	}

	public MarsRover takeSample() {
		commands.add(Commande.CATCH);
		return this;
	}
}
