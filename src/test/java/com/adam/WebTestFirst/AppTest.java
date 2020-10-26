package com.adam.WebTestFirst;

import org.testng.annotations.Test;

public class AppTest extends LoggerForTest{

    @Test
    public void FirstTest(){
        log.info("This is test 1.");
    }

    @Test
    public void SecondTest(){
        log.info("This is test 2.");
    }

    @Test
    public void ThirdTest(){
        log.info("This is test 3.");
    }

    @Test
    public void FourthTest(){
        log.info("This is test 4.");
    }
}
