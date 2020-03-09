package com.baidu.speech.restapi.asrdemo;

import com.baidu.speech.restapi.common.DemoException;

import java.io.IOException;

public class demoMain {
    public static void main(String[] args) throws IOException, DemoException {
//        AsrMain test=new AsrMain();
        ASR ars=new ASR();
        ars.ToText();
    }
}
