package com.apachecamel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


@Component
public class KafkaReceiverRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("kafka:topicNameOne")
                .log("${body}");
    }

}
