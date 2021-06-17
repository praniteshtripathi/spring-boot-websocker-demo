package demo.websocket.client.example3;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ClientWebSocketSockJsStompApplication {

    public static void main(String[] args) {
    	//SpringApplication.run(ClientWebSocketSockJsStompApplication.class, args);
    	
    	SpringApplication application = new SpringApplication(ClientWebSocketSockJsStompApplication.class);
        application.setDefaultProperties(Collections.singletonMap("server.port", "8888"));
        application.run(args);
    }
}
