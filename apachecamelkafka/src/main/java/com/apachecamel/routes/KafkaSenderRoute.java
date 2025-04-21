package com.apachecamel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class KafkaSenderRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer://test-kafka?period=1000")
                .setBody(simple("Send the message to consumer"))
                .to("kafka:topicNameOne");
    }
}
