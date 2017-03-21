//package com.kode.rabbitmq;
//
//import com.rabbitmq.client.Channel;
//import com.rabbitmq.client.Connection;
//import com.rabbitmq.client.ConnectionFactory;
//
//import java.io.IOException;
//import java.util.concurrent.TimeoutException;
//
///**
// * Created by zhongcy on 2016/4/20.
// */
//public class Producer {
//    private static String QUENE_NAME="hello";
//
//    public static void main(String[] args) {
//        try {
//            ConnectionFactory factory = new ConnectionFactory();
//            factory.setHost("localhost");
//            Connection connection = factory.newConnection();
//            Channel channel = connection.createChannel();
//            channel.queueDeclare(QUENE_NAME,false,false,false,null);
//            String message="hello,rabbit";
//            for(int i=0;i<1000;i++) {
//                message=message+i;
//                channel.basicPublish("", QUENE_NAME, null, message.getBytes());
//            }
//            System.out.println("send"+message);
//            channel.close();
//            connection.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (TimeoutException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
