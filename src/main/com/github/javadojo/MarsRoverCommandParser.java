package com.github.javadojo;

import java.util.ArrayList;
import java.util.List;

public class MarsRoverCommandParser implements Parser {

	private static Parser parser = new MarsRoverCommandParser();

	private MarsRoverCommandParser() {
	}

	public static Parser getInstance() {
		return parser;
	}

	@Override
	public List<Commande> parseCommandes(String commandes_) {

		List<Commande> commands = new ArrayList<Commande>();

		String[] commandes = commandes_.split("");

		for (String command : commandes) {

			if (command.equals("s")) {
				commands.add(Commande.GOSTRAIGHTLINE);
			} else if (command.equals("l")) {
				commands.add(Commande.GOLEFT);
			} else if (command.equals("r")) {
				commands.add(Commande.GORIGHT);
			} else if (command.equals("S")) {
				commands.add(Commande.CATCH);
			}
		}

		return commands;
	}

}
