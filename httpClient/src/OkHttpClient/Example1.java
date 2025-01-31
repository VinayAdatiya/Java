package OkHttpClient;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Example1 {
    OkHttpClient client = new OkHttpClient();

    String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().toString();
    }

    public static void main(String[] args) throws IOException {

        Example1 okHttpDemo = new Example1();

        Properties PROPERTIES = new Properties();
        try{
            PROPERTIES.load(new FileReader("apikey.properties"));
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

        String Output = okHttpDemo.run("https://www.alphavantage.co/query?function=OVERVIEW&symbol=MSFT&apikey="+PROPERTIES.getProperty("ALPHAVANTAGE_API_KEY"));
        System.out.println(Output);
    }
}
