package HttpClientExample;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Properties;

public class Example1 {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        Properties PROPERTIES = new Properties();
        try{
            PROPERTIES.load(new FileReader("apikey.properties"));
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

        /* HttpRequest request = HttpRequest
                .newBuilder(new URI("https://postman-echo.com/get"))
                .build();
        */

        /*
        Header attributes can relate to several different things, but for the most part, we’re dealing with four categories of metadata.
        These are:
            Information about the format of the request and response body.
            Authorization details.
            Response caching.
            Response cookies.
         */
        // Need of Headers :-
        // This is where you can provide extra information about the request.
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(new URI("https://www.alphavantage.co/query?function=OVERVIEW&symbol=MSFT&apikey="+PROPERTIES.getProperty("ALPHAVANTAGE_API_KEY")))
                .version(HttpClient.Version.HTTP_2) //HTTP_1_1 //client will fall back to, e.g., HTTP/1.1 if HTTP/2 isn’t supported.
                .GET()
                .headers("Key1","Value1","Key2","Value2") //.header("K1","V1").header("K2","V2")
                .timeout(Duration.ofSeconds(10)) //amount of time we want to wait for a response.
                .build();

        HttpRequest request1 = HttpRequest
                .newBuilder()
                .uri(new URI("https://postman-echo.com/post"))
                .POST(HttpRequest.BodyPublishers.noBody())
                .build();


        //StringBodyPublisher
        HttpRequest request2 = HttpRequest
                .newBuilder()
                .uri(new URI("https://postman-echo.com/post"))
                .header("content-type","text/plain;charset=UTF-8")
                .POST(HttpRequest.BodyPublishers.ofString("Hello Vinay"))
                .build();

        //InputStreamBodyPublisher
        byte[] sampleData = "Sample Request Body".getBytes();
        HttpRequest request3 = HttpRequest
                .newBuilder()
                .uri(new URI("https://postman-echo.com/post"))
                .header("content-type","int")
                .POST(HttpRequest.BodyPublishers.ofInputStream(
                        () -> new ByteArrayInputStream(sampleData)
                ))
                .build();

        HttpRequest request4 = HttpRequest
                .newBuilder()
                .uri(new URI("https://postman-echo.com/post"))
                .header("content-type","text/plain;charset=UTF-8")
                .POST(HttpRequest.BodyPublishers.ofFile(Path.of("src/test/Resources/SampleText")))
                .build();

        //Setting Up a Client
        HttpClient client = HttpClient.newBuilder().build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("\n------Simple GET() method request(request) output------");
        System.out.println("Status Code :- "+response.statusCode());
        System.out.println("Response Body :- "+response.body());
        System.out.println("Response :- "+response);

        HttpResponse<String> response1 = client.send(request1, HttpResponse.BodyHandlers.ofString());
        System.out.println("\n------Simple POST() method request(request1 with noBody()) output------");
        System.out.println("Status Code :- "+response1.statusCode());
        System.out.println("Response Body :- "+response1.body());
        System.out.println("Response :- "+response1);

        HttpResponse<String> response2 = client.send(request2, HttpResponse.BodyHandlers.ofString());
        System.out.println("\n------Simple POST() method request(request2 with ofString()) output------");
        System.out.println("Status Code :- "+response2.statusCode());
        System.out.println("Response Body :- "+response2.body());
        System.out.println("Response :- "+response2);

        HttpResponse<String> response3 = client.send(request3, HttpResponse.BodyHandlers.ofString());
        System.out.println("\n------Simple POST() method request(request1 with ofInputStream) output------");
        System.out.println("Status Code :- "+response3.statusCode());
        System.out.println("Response Body :- "+response3.body());
        System.out.println("Response :- "+response3);

        HttpResponse<String> response4 = client.send(request4, HttpResponse.BodyHandlers.ofString());
        System.out.println("\n------Simple POST() method request(request2 with ofFile()) output------");
        System.out.println("Status Code :- "+response4.statusCode());
        System.out.println("Response Body :- "+response4.body());
        System.out.println("Response :- "+response4);
    }
}
// API LEY :- T5EWX1P2XUCVYYLN