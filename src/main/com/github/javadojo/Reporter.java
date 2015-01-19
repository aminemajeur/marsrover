package com.github.javadojo;

import java.util.List;

public interface Reporter {

	String report(List<Commande>commandes, Direction CurrentDirection);
}
