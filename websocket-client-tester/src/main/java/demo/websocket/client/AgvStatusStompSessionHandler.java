package demo.websocket.client;

import java.lang.reflect.Type;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.simp.stomp.StompCommand;
import org.springframework.messaging.simp.stomp.StompHeaders;
import org.springframework.messaging.simp.stomp.StompSession;
import org.springframework.messaging.simp.stomp.StompSessionHandlerAdapter;

import com.ntt.model.AgvStatusModel;

public class AgvStatusStompSessionHandler extends StompSessionHandlerAdapter {

    private static final Logger logger = LoggerFactory.getLogger(AgvStatusStompSessionHandler.class);
    
    
    @Override
	public Type getPayloadType(StompHeaders headers) {
		return AgvStatusModel.class;
	}
    
    
    @Override
    public void afterConnected(StompSession session, StompHeaders headers) {
        logger.info("Client connected: headers {}", headers);
         session.subscribe("/topic/ui/agv/status", this);
        
    }

    @Override
    public void handleFrame(StompHeaders headers, Object payload) {
       // logger.info("Client received: payload {}, headers {}", payload, headers);
        headers.forEach((k,v)->{
        	System.out.print(k+"-----");	v.forEach((d)->{System.out.println(d);});
        });
        System.out.println("------------agv status--------------------");
        AgvStatusModel  agvStatusModel=(AgvStatusModel)payload;
        System.out.println("getAgvId------------"+agvStatusModel.getAgvId());
    }

    @Override
    public void handleException(StompSession session, StompCommand command,
                                StompHeaders headers, byte[] payload, Throwable exception) {
        logger.error("Client error: exception {}, command {}, payload {}, headers {}",
                exception.getMessage(), command, payload, headers);
    }

    @Override
    public void handleTransportError(StompSession session, Throwable exception) {
        logger.error("Client transport error: error {}", exception.getMessage());
    }
}
