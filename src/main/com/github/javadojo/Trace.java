package com.github.javadojo;

public class Trace {

	private Direction direction;
	private int xPosition;
	private int yPosition;

	public Trace(Direction direction, int xPosition, int yPosition) {
		super();
		this.direction = direction;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}

	public boolean isInEst() {
		return direction == Direction.EST;
	}

	public boolean isInWest() {
		return direction == Direction.WEST;
	}

	public boolean isInNorth() {
		return direction == Direction.NORTH;
	}

	public boolean isInSouth() {
		return direction == Direction.SOUD;
	}

	public void followTrace(Trace trace) {
		
	}
}
