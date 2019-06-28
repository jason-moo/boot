package com.test.configuration;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SenderConf {

    @Bean
    public Queue queue(){
        return new Queue("queue");
    }

    @Bean(name = "second")
    public Queue secondQueue(){
        return new Queue("second");
    }

    @Bean(name = "first")
    public Queue firstQueue(){
        return new Queue("first");
    }

    @Bean(name = "fanoutExchange")
    public FanoutExchange mulit(){
        return new FanoutExchange("cast");
    }

    @Bean
    public TopicExchange topic(){
        return new TopicExchange("topic");
    }

    @Bean
    Binding bindingExchangeMessage(@Qualifier("first") Queue queueMessage, @Qualifier("fanoutExchange") FanoutExchange exchange) {
        return BindingBuilder.bind(queueMessage).to(exchange);
    }

    @Bean
    Binding secondBindingExchangeMessage(@Qualifier("second") Queue queueMessage,@Qualifier("fanoutExchange") FanoutExchange exchange) {
        return BindingBuilder.bind(queueMessage).to(exchange);
    }

//    @Bean
//    Binding bindingExchangeMessage(@Qualifier("first") Queue queueMessage, TopicExchange exchange) {
//        return BindingBuilder.bind(queueMessage).to(exchange).with("");
//    }

}
