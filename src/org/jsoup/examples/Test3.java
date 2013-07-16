package org.jsoup.examples;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *@DEMO:jsoup
 *@Author:jilongliang
 *@Date:2013-7-14
 */
public class Test3 {
	/**
	 * 短信内容抓取...
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		String filePath="c:/dx.txt";
		int page=50;// 一百页
		String url="";
		for (int i = 1; i <=page; i++) {
			StringBuffer buffer=new StringBuffer();
			String params="div=c_sms_2&div=c_sms_2&typeid=147&pagename=smslist&pageSize=10&type=1&page="+i;
		    url ="http://www.hongduanzi.org/2011/diary.vm?"+params;
			//format("Fetching %s...", urls);//抓取地址
			Document doc = Jsoup.connect(url).get();//
			Elements imgs = doc.select("p.txt");//拿p标签下面的class=txt
			
			for (Element link : imgs) {
				
				String val=link.text();
				buffer.append(val).append("\n");
				System.out.println(val);
				//if(val.length()<=70)//长度为70就写入文本
				//{
					write(buffer.toString(), filePath);
			//	}
			}
		}
	}
	/**
	 * 格式化
	 * @param msg
	 * @param args
	 */
	private static void format(String msg, Object... args) {
		System.out.println(String.format(msg, args));
	}
	/**
	 * 文件处理
	 * @param content
	 * @param filePath
	 * @return
	 */
	public static boolean write(String content, String htmlPath) {  
        boolean flag = true;  
        try {  
            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(htmlPath), "GBK"));  
            out.write(content);  
            out.flush();
            out.close();  
        } catch (IOException ex) {  
            ex.printStackTrace();  
            return false;  
        }  
        return flag;  
    }  
	 
}
