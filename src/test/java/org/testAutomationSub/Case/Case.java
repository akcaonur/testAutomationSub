package org.testAutomationSub.Case;


import org.junit.jupiter.api.Test;
import org.testAutomationSub.Base.BaseTest;
import org.testAutomationSub.Log.Log;

public class Case extends BaseTest {
    Log log= new Log();

    @Test
    public void deneme(){
        System.out.println("Hello World");
        log.info("onurasd");
    }
}
