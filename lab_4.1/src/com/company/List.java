package com.company;

import java.util.ArrayList;

public abstract class List {
    private ArrayList<Object> objects = new ArrayList<>();

    public List(ArrayList<Object> objects) {
        this.objects = objects;
    }

    public void putObject(List list){}

    public void removeObject(){}
}
