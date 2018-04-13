package com.pimco.interview;

import java.util.Iterator;

/**
 * Takes an iterator and skips elements that do not meet the test
 * provided by the IObjectTest inteface.
 * 
 * author: Alex Imbastari
 */
public class FilteringIterator<E> implements Iterator<E>{
    
    Iterator<E> iterator;
    IObjectTest test;    

    E nextElement;
    
    public FilteringIterator(Iterator<E> myIterator, IObjectTest myTest){
        this.iterator = myIterator;
        this.test = myTest;        
    }

    @Override
    public boolean hasNext() {
        boolean nextElementPassedTest = false;
        while(iterator.hasNext()){
            nextElement = iterator.next();
            nextElementPassedTest = test.test(nextElement);
            
            if(nextElementPassedTest)
                break;
            else
                continue;
            
        }
        
        return nextElementPassedTest;
        
    }

    @Override
    public E next() {
        return nextElement;
        
    }
    
}
