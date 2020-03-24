package com.fa11en.json.app;

import com.fa11en.json.businesslayer.BL_User;
import org.json.simple.JSONArray;

import java.io.IOException;
import java.io.StringWriter;

public class Execute {
    public static void main(String [] args){
        BL_User bl_user = new BL_User();
        JSONArray array = new JSONArray();
        array = bl_user.arraUser();

        StringWriter out = new StringWriter();
        try {
            array.writeJSONString(out);
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(out);
    }
}
