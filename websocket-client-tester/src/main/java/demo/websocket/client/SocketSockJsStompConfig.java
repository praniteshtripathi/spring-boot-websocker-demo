package demo.websocket.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MappingJackson2MessageConverter;
import org.springframework.messaging.simp.stomp.StompSessionHandler;
import org.springframework.web.socket.client.WebSocketClient;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;
import org.springframework.web.socket.messaging.WebSocketStompClient;
import org.springframework.web.socket.sockjs.client.RestTemplateXhrTransport;
import org.springframework.web.socket.sockjs.client.SockJsClient;
import org.springframework.web.socket.sockjs.client.Transport;
import org.springframework.web.socket.sockjs.client.WebSocketTransport;

@Configuration
public class SocketSockJsStompConfig {

    @Bean
    public WebSocketStompClient webSocketStompClient(WebSocketClient webSocketClient,
        @Qualifier(value = "agvStatusStompSessionHandler")StompSessionHandler agvStatusStompSessionHandler,
        @Qualifier(value = "agvCommandStompSessionHandler")StompSessionHandler agvCommandStompSessionHandler,
        @Qualifier(value = "agvJobDefSessionHandler")StompSessionHandler agvJobDefSessionHandler) {
        WebSocketStompClient webSocketStompClient = new WebSocketStompClient(webSocketClient);
        webSocketStompClient.setMessageConverter(new MappingJackson2MessageConverter());
        webSocketStompClient.connect("http://localhost:8484/truck-integrator-websocket", agvStatusStompSessionHandler);
        webSocketStompClient.connect("http://localhost:8484/truck-integrator-websocket", agvCommandStompSessionHandler);
        webSocketStompClient.connect("http://localhost:8484/truck-integrator-websocket", agvJobDefSessionHandler);
        return webSocketStompClient;
    }

    
    @Bean
    public WebSocketClient webSocketClient() {
        List<Transport> transports = new ArrayList<>();
        transports.add(new WebSocketTransport(new StandardWebSocketClient()));
        transports.add(new RestTemplateXhrTransport());
        return new SockJsClient(transports);
    }

    @Bean( name = "agvStatusStompSessionHandler")
    public StompSessionHandler agvStatusStompSessionHandler() {
        return new AgvStatusStompSessionHandler();
    }
    
    @Bean(name="agvCommandStompSessionHandler")
    public StompSessionHandler agvCommandStompSessionHandler() {
        return new AgvCommandStompSessionHandler();
    }
    
    @Bean(name="agvJobDefSessionHandler")
    public StompSessionHandler agvJobDefSessionHandler() {
        return new AgvJobDefSessionHandler();
    }
    
}
