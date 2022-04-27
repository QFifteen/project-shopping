package org.example.Controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.OnError;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;
import java.io.IOError;
import java.io.IOException;

@ServerEndpoint("/push")
@Component
public class ShoppingWebSocket {
    @OnOpen
    public void onOpen(){
        System.out.println("了解了");
    }
    @OnError
    public void onErr(){
        System.out.println("失败了");
    }
}
