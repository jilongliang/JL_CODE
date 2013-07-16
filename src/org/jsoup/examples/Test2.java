package org.jsoup.examples;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test2 {
	public static void main(String [] args) throws IOException {
		File input = new File("D:\\MyEclipse\\index.html");  
		Document doc = Jsoup.parse(input, "UTF-8"); 
		Elements links = doc.getElementsByTag("a"); //获取a标签
		for (Element link : links) {  
		  String linkHref = link.attr("href");  //获取属性连接
		  String linkText = link.text();//获取文本内容
		  System.out.print("Attr:\t"+linkHref);
		  System.out.println("Text:\t"+linkText);
		} 
	}
}