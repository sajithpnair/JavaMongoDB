package com.spike.java;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

/**
 * Created by Sajith on 6/5/2014.
 */
public class HelloWorldSparkStyle {
    public static void main(String[] args) {
        Spark.get("/",new Route() {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello World from Spark";
            }
        });
    }
}
