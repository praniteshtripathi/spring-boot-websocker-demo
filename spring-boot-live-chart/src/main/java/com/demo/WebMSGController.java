package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class WebMSGController{
	
	@Autowired
	SimpMessagingTemplate template;
	@SubscribeMapping("/topic/temperature")
	public void consume() {
		double i=0.0;
		
		while(true) {
			i=i+1;
			template.convertAndSend("/topic/temperature",i);
		}
		
			
		
	}
	public  boolean isNumeric(String str)  
	{  
	  try  
	  {  
	    @SuppressWarnings("unused")
		double d = Double.parseDouble(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}
	
}
