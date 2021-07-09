package demo.websocket.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SockJsStompApplication {

    public static void main(String[] args) {
    	SpringApplication application = new SpringApplication(SockJsStompApplication.class);
        //application.setDefaultProperties(Collections.singletonMap("server.port", "8888"));
        application.run(args);
    }
}
