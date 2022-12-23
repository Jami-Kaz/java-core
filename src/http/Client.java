package http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Client {
    public static void main(String[] args) throws IOException {

        HttpURLConnection connection = (HttpURLConnection) new URL("http://google.com").openConnection();
//        connection.setRequestMethod("GET");
//        connection.setConnectTimeout(5000);
//        connection.setReadTimeout(5000);
//        connection.connect();
//
//        int status = connection.getResponseCode();
//        System.out.println(status + ": " + connection.getResponseMessage());
//
//        Set<Entry<String, List<String>>> entries = connection.getHeaderFields().entrySet();
//
//        for (Entry<String, List<String>> entry : entries) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//
//        status >= 300
//                ? connection.getErrorStream()
//                :

        BufferedReader in = new BufferedReader(new InputStreamReader( connection.getInputStream()));

        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();

        connection.disconnect();
    }
}
