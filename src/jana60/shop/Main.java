package jana60.shop;

public class Main {

	public static void main(String[] args) {
//Instanziare i nuovi prodotti in una stringa
		Prodotto nuovoProdotto = new Prodotto("Apple", "IPhone", 500.0, 22.0);
		Prodotto nuovoProdotto1 = new Prodotto("Hp", "Notebook", 250.0, 22.0);
		Prodotto nuovoProdotto2 = new Prodotto("Samsung", "Tablet", 350.0, 22.0);
		Prodotto[] prodotti = new Prodotto[3];
		prodotti[0] = nuovoProdotto;
		prodotti[1] = nuovoProdotto1;
		prodotti[2] = nuovoProdotto2;
// Calcolo prezzo con iva
		for (int i = 0; i < prodotti.length; i++) {
			System.out.println("Il prezzo del prodotto con l'iva è: " + prodotti[i].calcPrezzoConIva());

		}

//Calcolo prezzo con formattazione

		for (int i = 0; i < prodotti.length; i++) {
			System.out.println("Il prezzo totale del prodotto è: " + prodotti[i].prezzoFormattato());
		}
	}

}
