package com.learning.controller;

import com.learning.client.MyMongoClient;
import com.learning.document.Student;
import com.mongodb.client.MongoClient;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

import java.util.UUID;

@Controller("/student")
public class StudentController {

    MyMongoClient myMongoClient;
    MongoClient mongoClient;

    public StudentController(MyMongoClient myMongoClient) {
        this.myMongoClient = myMongoClient;
    }

    @Get(value = "hi/{name}", produces = MediaType.TEXT_PLAIN)
    public String hiStudent(@PathVariable String name) {

        myMongoClient.printDB();

        return "Hi " + name + "!";
    }
}
