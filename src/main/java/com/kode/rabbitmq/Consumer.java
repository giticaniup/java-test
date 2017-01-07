//package com.kode.rabbitmq;
//
//import com.rabbitmq.client.Channel;
//import com.rabbitmq.client.Connection;
//import com.rabbitmq.client.ConnectionFactory;
//import com.rabbitmq.client.QueueingConsumer;
//
//import java.io.IOException;
//import java.util.concurrent.TimeoutException;
//
///**
// * Created by zhongcy on 2016/4/20.
// */
//public class Consumer {
//    private final static String QUENE_NAME="hello";
//
//    public static void main(String[] args) {
//        try {
//            ConnectionFactory factory = new ConnectionFactory();
//            factory.setHost("localhost");
//            Connection connection = factory.newConnection();
//            Channel channel=connection.createChannel();
//            channel.queueDeclare(QUENE_NAME,false,false,false,null);
//            System.out.println("waiting for message");
//            QueueingConsumer consumer=new QueueingConsumer(channel);
//            channel.basicConsume(QUENE_NAME,true,consumer);
//            while (true){
//                QueueingConsumer.Delivery delivery = consumer.nextDelivery();
//                String msg=new String(delivery.getBody());
//                System.out.println("received" +msg);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (TimeoutException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//}
