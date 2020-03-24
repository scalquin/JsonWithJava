package com.fa11en.json.businesslayer;

import com.fa11en.json.dataaccesslayer.DA_User;
import org.json.simple.JSONArray;

public class BL_User {

    public JSONArray arraUser(){
        DA_User da_user = new DA_User();
        return da_user.arrayUser();
    }
}
