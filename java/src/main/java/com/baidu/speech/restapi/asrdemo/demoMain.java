package com.baidu.speech.restapi.asrdemo;

import com.baidu.speech.restapi.common.DemoException;
import org.json.JSONObject;
import org.json.JSONStringer;

import java.io.IOException;

public class demoMain {
    public static void main(String[] args) throws IOException, DemoException {
        ASR ars=new ASR();
        String UserSpeakResult=ars.ToText();
        UserSpeakResult = ars.analyse(UserSpeakResult);





//        JSONStringer str=new JSONStringer();
//        str.toString(result);

    }
}
