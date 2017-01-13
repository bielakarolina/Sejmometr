package Wersja1;

import java.net.*;
import java.io.*;

public class UrlReader

{
	private static URL url2;

	public static String read(String url) throws Exception {

		url2 = new URL(url);
		URLConnection urlconnection = url2.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(urlconnection.getInputStream()));
		String inputLine;
		StringBuilder sbuilder = new StringBuilder();
		while ((inputLine = in.readLine()) != null) {
			sbuilder.append(inputLine);

		}
		in.close();
		return String.valueOf(sbuilder);
	}

}
