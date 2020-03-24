package com.fa11en.json.dataaccesslayer;

import com.fa11en.json.entitylayer.User;
import org.json.simple.JSONArray;

public class DA_User {

    public JSONArray arrayUser(){
        JSONArray arr = new JSONArray();
            arr.add(new User(10, "fa11en", "1234"));
            arr.add(new User(11, "Samael", "ABCD"));
            arr.add(new User(12, "Lucyfer", "ASD"));
        return arr;
    }

}
