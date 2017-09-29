package ds.Graph.WebCrawler;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.net.URL;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class WebCrawler {
    private Queue<String> queue;
    private List<String> discoveredWebsitesList;

    public WebCrawler() {
        queue = new LinkedList<>();
        discoveredWebsitesList = new ArrayList<>();
    }

    public void discoverWeb(String root) {
        this.queue.add(root);
        this.discoveredWebsitesList.add(root);

        while(!queue.isEmpty()) {
            String v = this.queue.remove();
            String rawHtml = readURL(v);

            String regexp = "http://(\\w+\\.)*(\\w+)";
            Pattern pattern = Pattern.compile(regexp);
            Matcher matcher = pattern.matcher(rawHtml);

            while(matcher.find()) {
                String actualURL = matcher.group();

                if (!discoveredWebsitesList.contains(actualURL)) {
                    discoveredWebsitesList.add(actualURL);
                    System.out.println("Website has been found with URL: " + actualURL);
                    queue.add(actualURL);
                }
            }
        }
    }

    private String readURL(String v) {
        String rawHtml = "";
        try {
            URL url = new URL(v);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine = "";

            while((inputLine = in.readLine()) != null) {
                rawHtml += inputLine;
            }

            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return rawHtml;
    }
}
