package com.pimco.interview.test;

import com.pimco.interview.IObjectTest;

/**
 * Test for a "badString".
 * The test method uses Object parameter, due to the exercise requirements.
 * An alternative is to use a type parameter such as <E> then the use of instanceof 
 * would not be needed.
 * 
 */
public class TestForBadString implements IObjectTest{
    
    private String testString = "BadString";
    
    public TestForBadString(String testString){
        this.testString = testString;
    }
    
    @Override
    public boolean test(Object o) {
        if(o == null)
            return false;
        
        if(!(o instanceof String))
            return false;
    
        String oString = (String)o;
        
        if(oString.equalsIgnoreCase(testString))
            return false;
        
        return true;
        
    }
    
    
}
