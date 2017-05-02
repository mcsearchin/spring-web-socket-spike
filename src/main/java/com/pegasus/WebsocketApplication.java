package com.pegasus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import java.util.Timer;

@SpringBootApplication
public class WebsocketApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WebsocketApplication.class, args);
	}

	@Autowired
	private SimpMessagingTemplate messagingTemplate;

	@Override
	public void run(String... args) throws Exception {
        new Timer().schedule(new UnicornBroadcaster(messagingTemplate), 0, 2000);
	}
}
