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
		checkDirections(currentCommande);
		for (int currentIndex = 1; currentIndex < commandes.size(); currentIndex++) {
			Commande commande = commandes.get(currentIndex);
			builder.append(commande.print());
		}
		builder.append(CURRENTPOSITION);
		builder.append(LINE_SEPARATOR);
		return builder.toString();
	}

	private Direction checkDirections(Commande currentCommande) {
		Direction direction = Direction.EST;
		if (currentCommande == Commande.GOSTRAIGHTLINE)
			direction = Direction.EST;
		else if (currentCommande == Commande.GOLEFT) {
			direction = Direction.WEST;
		} else if (currentCommande == Commande.GONORTH) {
			direction = Direction.NORTH;
		} else if (currentCommande == Commande.GOSOUDTH) {
			direction = Direction.SOUD;
		}

		return direction;
	}

}
