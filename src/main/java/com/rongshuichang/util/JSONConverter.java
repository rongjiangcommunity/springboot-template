package com.rongshuichang.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rongshuichang.entity.Pinfo;
import com.rongshuichang.entity.Userinfo;

import java.io.IOException;

public class JSONConverter {

    public Pinfo getPinfofromJSON(String JSON){
        ObjectMapper mapper = new ObjectMapper();

        try {
            Pinfo pinfo = mapper.readValue(JSON,Pinfo.class);
            return pinfo;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public Userinfo getUserinfofromJSON(String JSON){
        ObjectMapper mapper = new ObjectMapper();

        try {
            Userinfo Userinfo = mapper.readValue(JSON,Userinfo.class);
            return Userinfo;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
