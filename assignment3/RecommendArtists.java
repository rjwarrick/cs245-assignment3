package assignment3;

import java.io.IOException;
import java.util.regex.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class RecommendArtists<T> implements Queue<T> {

//	public void bfs(String source) {
//		boolean[] visited = new boolean[vertices];
//		bfs(source, visited);
//	}
//
//	void bfs(String line, boolean[] visted) {
////		Queue q = new ArrayQueue();
//		visited[line] = true;
//		q.enqueue(v);
//		while (!q.empty()) {
//			line = q.dequeue();
//			for (int adj : adjacent(line)) {
//				if (!visited[adj]) {
//					q.enqueue(adj);
//					visted[adj] = true;
//				}
//			}
//		}
//
//	}

	public static void main(String[] args) throws IOException {
		
//		Scanner scanner = new Scanner();

		Document document = Jsoup.connect("http://top40weekly.com").get();

		// disable pretty-print to not re-format the output
		Document.OutputSettings outputSettings = new Document.OutputSettings();
		outputSettings.prettyPrint(false);
		Elements page = document.select("div.x-text");
		String line = page.text();

		// Separate the entire text into lines and add to the queue
		String parts[] = line.split("\\.");
		for (int i = 0; i < parts.length; i++) {
//			System.out.println("-------" + parts[i]);
			ArrayQueue<String> q = new ArrayQueue<String>();
			q.enqueue(parts[i]);
			System.out.println(parts[i]);
		}

		// Separate each of the artists
		String artists[] = line.split("by | x | & | featuring");
//		for (int i = 0; i <= line.length(); i++) {
//			System.out.println("-------" + artists[i]);
//		}
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