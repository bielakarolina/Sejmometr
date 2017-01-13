package Wersja1;

import java.util.Scanner;

public class ArgumentParser {
	private int number;
	private Cadency Kadencja = new Cadency();
	private Calculation calculation = new Calculation();

	public void ReadArguments(String[] args) throws Exception {

		System.out.println("Podaj numer kadencji. ");
		Scanner reading = new Scanner(System.in);
		String numerkadencji;
		numerkadencji = reading.nextLine();
		System.out.println("Co chcia�aby� wczyta�? ");
		String description;
		description = reading.nextLine();

		if (numerkadencji.equals("7")) {
			number = 7;
			Kadencja = generateCadence(number);
		} else if (numerkadencji.equals("8")) {

			number = 8;
			Kadencja = generateCadence(number);
		} else {

			System.out.println("Nie ma danych dla takiej kadencji");
			reading.close();
			System.exit(0);
		}

		if (description.equals("1")) {

			System.out.println("Podaj imie ");
			String imie;
			imie = reading.nextLine();
			System.out.println("Podaj nazwisko ");
			String nazwisko;
			nazwisko = reading.nextLine();
			reading.close();
			System.out.print("suma wydatk�w pos�a/pos�anki o imieniu " + imie + " i nazwisku " + nazwisko + " ");
			String suma = calculation.allExpenses(imie, nazwisko, Kadencja);
			System.out.print(suma);

		} else if (description.equals("2")) {

			System.out.println("Podaj imie ");
			String imie1;
			imie1 = reading.nextLine();
			System.out.println("Podaj nazwisko ");
			String nazwisko1;
			nazwisko1 = reading.nextLine();
			reading.close();
			System.out.print("wysoko�ci wydatk�w na 'drobne naprawy i remonty biura poselskiego' " + imie1 + " "
					+ nazwisko1 + " ");
			System.out.print(calculation.smallExpenses(imie1, nazwisko1, Kadencja));
		}

		else if (description.equals("3")) {

			System.out.print("�rednia warto�ci sumy wydatk�w wszystkich pos��w ");
			System.out.print(calculation.avarageSum(Kadencja));
			reading.close();
		} else if (description.equals("4")) {
			System.out.print("pose�/pos�anka, kt�ry wykona� najwi�cej podr�y zagranicznych ");
			System.out.print(calculation.mostTravel(Kadencja));
			reading.close();
		} else if (description.equals("5")) {
			System.out.print("pose�/pos�anka, kt�ry najd�u�ej przebywa� za granic� ");
			System.out.print(calculation.longestTrip(Kadencja));
			reading.close();
		} else if (description.equals("6")) {
			System.out.print("pose�/pos�anka, kt�ry odby� najdro�sz� podr� zagraniczn� ");
			System.out.print(calculation.theMostExpensiveTrip(Kadencja));
			reading.close();
		} else if (description.equals("7")) {
			System.out.print("lista wszystkich pos��w, kt�rzy odwiedzili W�ochy ");
			System.out.print(calculation.visitorsOfItaly(Kadencja));
			reading.close();
		} else {
			reading.close();
			System.out.print("Poda�a� z�� zmienn�");
		}
	}

	public Cadency generateCadence(int a) throws Exception {
		ParserJson parserJson = new ParserJson();
		Cadency cadency = new Cadency();
		cadency = parserJson.deputyParse(a);
		return cadency;
	}

}
