package com.github.javadojo;

import java.util.List;

public class MarsRoverReporter implements Reporter {

	private static final Object LINE_SEPARATOR = "\r\n";
	private static final Object CURRENTPOSITION = "*";

	public String report(List<Commande> commandes, Direction CurrentDirection) {
		Commande currentCommande;

		Direction direction = Direction.EST;
		StringBuilder builder = new StringBuilder("X");
		currentCommande = commandes.get(0);
		direction = checkDirections(direction, currentCommande);

		for (int currentIndex = 1; currentIndex < commandes.size(); currentIndex++) {
			Commande commande = commandes.get(currentIndex);
			if(currentCommande == commande)
			builder.append(commande.print());
		}
		builder.append(CURRENTPOSITION);
		builder.append(LINE_SEPARATOR);
		return builder.toString();
	}

	private Direction checkDirections(Direction direction, Commande currentCommande) {

		if (direction == Direction.EST && currentCommande == Commande.GOLEFT)
			direction = Direction.NORTH;
		if (direction == Direction.EST && currentCommande == Commande.GORIGHT)
			direction = Direction.SOUD;

		if (direction == Direction.WEST && currentCommande == Commande.GORIGHT)
			direction = Direction.NORTH;
		if (direction == Direction.WEST && currentCommande == Commande.GOLEFT)
			direction = Direction.SOUD;

		if (direction == Direction.NORTH && currentCommande == Commande.GORIGHT)
			direction = Direction.EST;
		if (direction == Direction.NORTH && currentCommande == Commande.GOLEFT)
			direction = Direction.WEST;

		if (direction == Direction.SOUD && currentCommande == Commande.GORIGHT)
			direction = Direction.WEST;
		if (direction == Direction.SOUD && currentCommande == Commande.GOLEFT)
			direction = Direction.EST;

		return direction;
	}
	
	private void printPathGONorth(StringBuilder builder, List<Direction> directions) {
		for (int i = directions.size() - 1; i <= 0; i--) {
			builder.append(directions.get(i));
			builder.append(LINE_SEPARATOR);
		}
	}
	
	private void printPathGOSouth(StringBuilder builder, List<Direction> directions) {
		for (int i = 0; i < directions.size(); i++) {
			builder.append(directions.get(i));
			builder.append(LINE_SEPARATOR);
		}
	}
	
	private void printPathGONEst(StringBuilder builder, List<Direction> directions) {
		for (int i = 0; i < directions.size(); i++) {
			builder.append(directions.get(i));
		}
	}
	
	private void printPathGOWest(StringBuilder builder, List<Direction> directions) {
		for (int i = directions.size() - 1; i <= 0; i--) {
			builder.append(directions.get(i));
		}
	}

}
