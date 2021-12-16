package assignment3;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.Jsoup;
import java.io.IOException;
import java.util.ListIterator;

public class Artists {

	public static void main(String[] args) throws IOException {
		Document document = Jsoup.connect("http://top40weekly.com").get();

		// disable pretty-print to not re-format the output
//		Document.OutputSettings outputSettings = new Document.OutputSettings();
//		outputSettings.prettyPrint(false);
//		
		Elements elements = document.select("*");

		for (Element element : elements) {
		    System.out.println(element.ownText());
		}
		//////////////////////////////////
//		Elements rows = document.select("div#contentHiscores table tr");
//		ListIterator<Element> itr = rows.listIterator();
//
//		while (itr.hasNext()) {
//			Element row = itr.next();
//
//			if (row.select("td:nth-child(2) a:contains(1.)").first() != null) {
//				String song = row.select("td:nth-child(3)").text();
//				String artist = row.select("td:nth-child(4)").text();
//
//				System.out.printf("song=%s artist=%s", song, artist);
//
//				break;
//				
//			} else {
//				System.out.println("Song not found!");
//			}
//
//		}
		//////////////////////////////////
		// to get links
//		Elements links = document.getElementsByTag("a");
//		for (Element link : links) {
//			String l = link.attr("href");
//			if (l.length()>0) {
//				if (l.length() < 4) {
//					l = document.baseUri() + l.substring(1);
//				} else if (!l.substring(0, 4).equals("http")) {
//					l = document.baseUri() + l.substring(1);
//				}
//				System.out.println(l);
//			}
//			
//		}
//		System.out.println(document.outerHtml());
//		String page_content = document.text();
//		String strWithNewLines = Jsoup.clean(page_content, "", Whitelist.none(), outputSettings);
//		System.out.println(Jsoup.parse(page_content));

	}
//		System.out.print(page_content);

}
// implement jsoup
// parse html to get source page
// after parsing the source/file, abstract the data
// store and sort
