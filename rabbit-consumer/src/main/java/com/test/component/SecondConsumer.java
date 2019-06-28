package com.test.component;


import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;
import java.io.IOException;

@Component
@RabbitListener(queues = "second")
public class SecondConsumer {

    @RabbitHandler
    public void processMessage2(String message, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long tag) {
        System.out.println(message);
        try {
            channel.basicAck(tag, false);            // 确认消息
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
