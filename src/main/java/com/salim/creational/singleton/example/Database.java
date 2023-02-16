package com.salim.creational.singleton.example;

public class Database {
    //The dbObject is a class type field. This will refer to the object of the class Database
    private static Database dbObject;

    //The private constructor Database() prevents object creation outside of the class.
    private Database() {
    }

    //The static class type method getInstance() returns the instance of the class to the outside world.
    public static Database getInstance() {

        // create object if it's not already created
        if(dbObject == null) {
            dbObject = new Database();
        }

        // returns the singleton object
        return dbObject;
    }

    public void getConnection() {
        System.out.println("You are now connected to the database.");
    }
}