package AppacheHttpClient;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;


public class Example1 {
    public static void main(String[] args) throws IOException {

        //create the http client
        CloseableHttpClient httpclient = HttpClients.createDefault();

        //send basic GET request
        HttpGet httpget = new HttpGet("https://www.tutorialspoint.com/");

        System.out.println("Request Type: "+httpget.getMethod());

    }
}
