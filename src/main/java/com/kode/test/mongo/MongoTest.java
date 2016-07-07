package com.kode.test.mongo;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


/**
 * Created by zhongcy on 2016/4/19.
 */
public class MongoTest {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("192.168.72.128");
        MongoDatabase database = mongoClient.getDatabase("test");
        System.out.println(database.getName());
        MongoCollection<Document> coll = database.getCollection("test");
        Document doc = new Document("name", "mongo").append("info", new BasicDBObject("ver", "3.0"));
        coll.insertOne(doc);
        System.out.println(coll.count());
    }
}
