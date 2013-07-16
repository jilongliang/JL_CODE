package org.jsoup.examples;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Test1 {
	public static void main(String... args) {
		String url="http://localhost:8081/jsoup/index.jsp";
		try {
			Document doc = Jsoup.connect(url).get();
			Elements hrefs = doc.select("a[href]");
			System.out.println(hrefs);
			System.out.println("------------------");
			System.out.println(hrefs.select("[href^=http]"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}