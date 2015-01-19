package com.github.javadojo;

import java.util.List;

public interface Parser {

	List<Commande> parseCommandes(String commandes);
}
