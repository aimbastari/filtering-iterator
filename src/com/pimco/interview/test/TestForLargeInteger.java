package com.pimco.interview.test;

import com.pimco.interview.IObjectTest;

/**
 * Test for a large Integer.
 * The test method uses Object parameter, due to the exercise requirements.
 * An alternative is to use a type parameter such as <E> then the use of instanceof 
 * would not be needed.
 * 
 */
public class TestForLargeInteger implements IObjectTest{
    
    private Integer largeInteger = 1000;
    
    public TestForLargeInteger(Integer largeInteger){
        this.largeInteger = largeInteger;
    }
    
    @Override
    public boolean test(Object o) {
        if(o == null)
            return false;
        
        if(!(o instanceof Integer))
            return false;
    
        Integer oInteger = (Integer)o;
        
        if(oInteger >= largeInteger)
            return false;
        
        return true;
        
    }
    
    
}
