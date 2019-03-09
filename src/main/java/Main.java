import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

public class Main {
    class AppHandler implements HttpHandler {
        public void handle (HttpExchange exchange) throws IOException {
            String requestMethod = exchange.getRequestMethod();
        }
    }


    private void init () throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/", new AppHandler());
        server.setExecutor(Executors.newCachedThreadPool());
        server.start();
    }

    public static void main(String[] args) throws IOException {
        new Main().init();
    }
}
