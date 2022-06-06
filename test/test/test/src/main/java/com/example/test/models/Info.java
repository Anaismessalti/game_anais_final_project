package com.example.test.models;

public class Info {

    public  String name;
    //public  String surName;
    public  String groupNumber;
    public  int variant;
    public  String examDate;

    public Info() {
    }
    public Info(String name, String group, int variant, String examDate) {
        this.name = name;
        //this.surName = surName;
        this.groupNumber = group;
        this.variant = variant;
        this.examDate = examDate;
    }
}
