//package com.apachecamel.routes;
//
//import org.apache.camel.builder.RouteBuilder;
//
//public class ActiveMQSenderRoute extends RouteBuilder {
//    @Override
//    public void configure() throws Exception {
//        from("timer://test?period:10000") // test route will send the message
//                .setBody(simple("Welcome to Sakshi side"))
//                .to("activemq:test-mq");
//    }
//}
