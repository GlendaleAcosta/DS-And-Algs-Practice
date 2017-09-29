package ds.Graph.WebCrawler;

public class App {
    public static void main(String[] args) {
        WebCrawler crawler = new WebCrawler();
        String root1 = "http://www.bbc.com";
        crawler.discoverWeb(root1);
    }
}
