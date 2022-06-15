package jana60.shop;

import java.text.DecimalFormat;

public class Prodotto {
	// Attributi della classe
	String marca;
	String nome;
	double prezzo;
	double iva;

	// Costruttore che inizializza gli attributi
	Prodotto(String marca, String nome, Double prezzo, double iva) {
		this.marca = marca;
		this.nome = nome;
		this.prezzo = prezzo;
		this.iva = iva;

	}

	// Metodo per calcolare prezzo comprensivo di iva
	double prezzoConIva() {
		return prezzo + iva;

	}

	// Metodo per formattare il prezzo restituendo restituendo una stringa con un
	// determinato numero di decimali e il carattere €
	DecimalFormat df = new DecimalFormat("#0.00€");

	String prezzoFormattato() {
		return df.format(prezzo - iva);

	}
}
