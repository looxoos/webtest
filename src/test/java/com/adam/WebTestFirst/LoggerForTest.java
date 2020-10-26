package com.adam.WebTestFirst;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class LoggerForTest {

    final static Logger log = Logger.getLogger("TestLog");
//    final static Logger log3 = Logger.getLogger();

    public LoggerForTest(){
        BasicConfigurator.configure();
    }
}
