package com.stanfordnlp.ner;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Jsonconvertor extends Entityextract {
	public String Jsonconvertor() throws IOException {

		Person p = new Person();
		Percent pe = new Percent();
		Date d = new Date();
		Time t = new Time();
		Money m = new Money();
		Location l = new Location();
		Organization o = new Organization();

		JSONObject obj = new JSONObject();

		obj.put("PERSON", p.Person().replace("\n", ", "));
		obj.put("Percent", pe.Percent().replace("\n", ", "));
		obj.put("Date", d.Date().replace("\n", ", "));
		obj.put("Time", t.Time().replace("\n", ", "));
		obj.put("Money", m.Money().replace("\n", ", "));
		obj.put("Location", l.Location().replace("\n", ", "));
		obj.put("Organization", o.Organization().replace("\n", ", "));

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonOutput = gson.toJson(obj);
		System.out.print(jsonOutput);

		return jsonOutput;
	}

	public static void main(String[] args) throws IOException {
		Jsonconvertor js = new Jsonconvertor();
		js.Jsonconvertor();
	}
}
