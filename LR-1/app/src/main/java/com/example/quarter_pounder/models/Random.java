package com.example.quarter_pounder.models;

import com.orm.SugarRecord;

public class Random extends SugarRecord {
    String name = "";
    int Age = 0;

    public Random() {};
    public Random(String inName, int inAge){
        this.name = inName;
        this.Age = inAge;
    }

    public int getAge(){
        return Age;
    }
    public String getName(){
        return name;
    }
}
