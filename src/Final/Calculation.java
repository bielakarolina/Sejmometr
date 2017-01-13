package Wersja1;

import java.util.ArrayList;
import java.util.List;

public class Calculation {

	public Deputy findDeputy(String firstName, String lastName, Cadency cadency) {

		Deputy deputy = null;
		for (Deputy element : cadency.getDeputies()) {

			if (element.getFirstName().equals(firstName) && element.getLastName().equals(lastName)) {
				deputy = element;

				break;
			}
		}

		return deputy;

	}

	public String allExpenses(String firstName, String lastName, Cadency cadency) {

		Deputy deputy = findDeputy(firstName, lastName, cadency);
		double suma = deputy.getLayers().getExpenses().getSum();
		return ": " + suma;

	}

	public String smallExpenses(String firstName, String lastName, Cadency cadency) {
		Deputy deputy = findDeputy(firstName, lastName, cadency);
		double sum = 0;
		for (Years elem : deputy.getLayers().getExpenses().getyearbooks()) {
			sum += elem.getscope().get(12);
		}
		return ": " + sum;

	}

	public String avarageSum(Cadency cadency) {
		double suma = 0;
		int i = 0;
		for (Deputy elem : cadency.getDeputies()) {
			suma += elem.getLayers().getExpenses().getSum();
			i++;
		}
		suma = suma / i;
		return ": " + suma;
	}

	public String longestTrip(Cadency cadency) {
		int max = 0;
		int tmp;
		String firstName = "";
		String lastName = "";
		for (Deputy elem : cadency.getDeputies()) {

			int suma = 0;
			int i = elem.getLayers().getTrips().size();
			;

			while (i > 0) {
				int k = i - 1;
				String days = elem.getElementNamed(k, "liczba_dni");
				tmp = Integer.parseInt(days);
				suma += tmp;
				i--;
			}

			if (suma > max) {
				max = suma;
				firstName = elem.getFirstName();
				lastName = elem.getLastName();
			}

		}
		return ": " + firstName + " " + lastName;

	}

	public String mostTravel(Cadency cadency) {
		int max = 0;
		String firstName = "";
		String lastName = "";
		for (Deputy elem : cadency.getDeputies()) {

			if (elem.getData().getdeputyNumberOfTrips() > max) {
				max = elem.getData().getdeputyNumberOfTrips();
				firstName = elem.getFirstName();
				lastName = elem.getLastName();

			}

		}
		return ": " + firstName + " " + lastName;

	}

	public String theMostExpensiveTrip(Cadency kadencja) {

		float mostExpensive = 0;
		String firstName = "";
		String lastName = "";
		double max;
		for (Deputy element : kadencja.getDeputies()) {
			int k = element.getLayers().getTrips().size();
			;
			while (k != 0) {
				String tmp = element.getElementNamed(k - 1, "koszt_suma");
				max = Double.parseDouble(tmp);
				if (max > mostExpensive) {
					mostExpensive = (float) max;
					firstName = element.getFirstName();
					lastName = element.getLastName();

				}
				k--;
			}

		}
		return ": " + firstName + " " + lastName;
	}

	public String visitorsOfItaly(Cadency cadency) {
		List<String> visitorsOfItalyList = new ArrayList<>();

		for (Deputy elem : cadency.getDeputies()) {
			int k = elem.getLayers().getTrips().size();
			;
			while (k != 0) {
				if (elem.getElementNamed(k - 1, "kraj").equals("W³ochy")) {
					StringBuilder name = new StringBuilder();
					name.append(elem.getFirstName());
					name.append("\n");
					name.append(elem.getLastName());
					visitorsOfItalyList.add(String.valueOf(name));
					break;

				}
				k--;
			}
		}
		return listToString(visitorsOfItalyList);
	}

	public String listToString(List<String> list) {
		StringBuilder result = new StringBuilder();

		for (String elem : list) {
			result.append(" ");
			result.append(elem);
			result.append(" ");
		}

		return result.toString();
	}

}