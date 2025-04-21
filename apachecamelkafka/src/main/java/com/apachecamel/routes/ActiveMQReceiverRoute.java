//package com.apachecamel.routes;
//
//import org.apache.camel.builder.RouteBuilder;
//import org.springframework.stereotype.Component;
//
//@Component
//public class ActiveMQReceiverRoute extends RouteBuilder {
//    @Override
//    public void configure() throws Exception {
//        from("activemq:test-mq") // test-mq will receive message
//                .log("log:receiving messages => ${body}");
//    }
//}
