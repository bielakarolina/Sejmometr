package Wersja1;

import com.google.gson.Gson;

public class ParserJson {

	public Cadency cadency = null;
	public Cadency temp;
	String Url1;
	String json;

	public Cadency deputyParse(int number) throws Exception {

		int tmp=0;
		if (number == 7)
			tmp=11;
		else if (number == 8)
			tmp = 10;
		Gson gson = new Gson();
		Url1 = "https://api-v3.mojepanstwo.pl/dane/poslowie.json?conditions[poslowie.kadencja]=" + number;
		this.cadency = gson.fromJson(UrlReader.read(Url1), Cadency.class);
		for (int i = 2; i <= tmp; i++) {

			Url1 = Url1 + "&_type=objects&page=" + i;
			json = UrlReader.read(Url1);
			temp = gson.fromJson(json, Cadency.class);
			this.cadency.addTo(temp.getDeputies());

		}

		this.dataParser();
		return cadency;
	}

	public void dataParser() throws Exception {
		Deputy deputytmp;

		for (Deputy ele : this.cadency.getDeputies()) {

			String newURL = "https://api-v3.mojepanstwo.pl/dane/poslowie/" + ele.getId()
					+ ".json?layers[]=wydatki&layers[]=wyjazdy";
			json = UrlReader.read(newURL);
			Gson gson = new Gson();
			deputytmp = gson.fromJson(json, Deputy.class);
			ele.setLayers(deputytmp.getLayers());
			ele.getLayers().loadtrips();
		}
	}
}
