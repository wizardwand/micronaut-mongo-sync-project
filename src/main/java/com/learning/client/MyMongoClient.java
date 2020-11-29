package com.learning.client;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import java.util.Iterator;

@Singleton
public class MyMongoClient {

    @Inject
    MongoClient mongoClient;



    public void printDB(){
        MongoDatabase m = mongoClient.getDatabase("usersmongo");
        MongoIterable<String> mongoIterable =  m.listCollectionNames();
        Iterator i = mongoIterable.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("hi");
    }

    public void insertInDB(){
        mongoClient.startSession();
//        mongoClient.i
    }

}
