package assignment3;

import java.util.Scanner;
import java.io.IOException;
import java.util.regex.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class RecommendArtists<T> implements Queue<T> {
	

//	public static boolean stringContains(String artist, String[] parts) {
//		for (int i = 0; i < parts.length; i++) {
//			if (artist.contains(artists[i])) {
//				return true;
//			}
//		}
//		return false;
//	}

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		String artist = "";
		System.out.println("Please enter an artist: ");

		Document document = Jsoup.connect("http://top40weekly.com").get();

		// disable pretty-print to not re-format the output
		Document.OutputSettings outputSettings = new Document.OutputSettings();
		outputSettings.prettyPrint(false);
		Elements page = document.select("div.x-text");
		String line = page.text();

		// Separate the entire text into lines and add to the queue (contains artists
		// and songs)-
		String parts[] = line.split("\\.");
		for (int i = 0; i < parts.length; i++) {
//			System.out.println("-------" + parts[i]);
			ArrayQueue<String> q = new ArrayQueue<String>();
			q.enqueue(parts[i]);
//			System.out.println(parts[i]);	// retrieve the song
		}

		// Separate each of the artists
		String artists[] = line.split("by | x | & | featuring");
		for (int i = 0; i < line.length(); i++) {
			String line1 = artists[i];
			String result = line1.substring(0, line1.indexOf(" (") + 1);
			System.out.println(result); // retrived the artist
		}
//		String page_content = document.text();
//		System.out.print(page_content);

	}

	@Override
	public T dequeue() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void enqueue(T item) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return false;
	}
}

//implement jsoup
//parse html to get source page
//after parsing the source/file, abstract the data
//store and sort