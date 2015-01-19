package com.github.javadojo;

import java.util.ArrayList;
import java.util.List;

public class Path {

	private List<Trace> traces;

	public Path() {
		traces = new ArrayList<Trace>();
	}

	public void goLeft() {

		Trace currentTrace = traces.get(traces.size() - 1);

		if (currentTrace.isInNorth()) {
			traces.add(new Trace(Direction.WEST, xPosition, yPosition))
		} else if (currentTrace.isInSouth()) {
			
		}
	}

	public void goRight() {

	}

	public void goStraithLine() {

	}

}
