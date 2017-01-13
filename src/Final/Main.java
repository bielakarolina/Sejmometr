package Wersja1;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws Exception {

		try {
			ArgumentParser parser = new ArgumentParser();
			parser.ReadArguments(args);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());

		}

	}

}
