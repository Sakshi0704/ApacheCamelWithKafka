//package com.apachecamel.routes;
//
//import org.apache.camel.builder.RouteBuilder;
//import org.springframework.stereotype.Component;
//
//
//@Component
//class Calculator{
//    public String add(){
//        return "Welcome to add method !!";
//    }
//
//    public String sub(){
//        return "Welcome to sub method !!";
//    }
//}
//@Component
//public class BeanTestRoutes extends RouteBuilder {
//
//    @Override
//    public void configure() throws Exception {
//            from("timer:bean-test-time?period=5000") // timer is component
//                    .bean("calculator","sub")
//                    .to("log:bean-test-timer"); // log is component so here consumer is binding by log component
//    }
//
//}
