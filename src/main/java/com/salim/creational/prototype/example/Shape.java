package com.salim.creational.prototype.example;
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object cloneObject = null;
        try {
            cloneObject = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("cloning failed");
            e.printStackTrace();
        }
        return cloneObject;
    }
}