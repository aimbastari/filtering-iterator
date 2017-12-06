import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.pimco.interview.FilteringIterator;
import com.pimco.interview.IObjectTest;
import com.pimco.interview.test.TestForBadString;
import com.pimco.interview.test.TestForLargeInteger;

/**
 * Used to test Filtering Iterator Framework
 */
public class Main {

    private void runTest(){
	    System.out.println("Testing Filtering Iterator Framework.");
	    System.out.println("");
	    
	    
	    //Test String List for bad string
	    System.out.println("STRING TEST 1");
	    List<String> testList = new ArrayList<String>(Arrays.asList(
	       new String[]{"A", "B", "C", "badString", "badString", "D"}));
	    List<String> expectedList = new ArrayList<String>(Arrays.asList(
	       new String[]{"A", "B", "C", "D"}));
	    List<String> resultList = new ArrayList<String>();
	    IObjectTest testBadString = new TestForBadString("badString");
        	    
	    Iterator<String> myFilterIterator = new FilteringIterator<String>(testList.iterator(),  testBadString);
	    
	    while(myFilterIterator.hasNext()){
	        String filteredElement = myFilterIterator.next();
	        resultList.add(filteredElement);
	    }
        
	    printResults(expectedList, resultList);
	   
	   
	    //Test String array for bad string
	    System.out.println("STRING TEST 2");
	    testList = new ArrayList<String>(Arrays.asList(
	       new String[]{"badString", "A", "B", "C", "badString", "D", "badString", "E", "F"}));
	    expectedList = new ArrayList<String>(Arrays.asList(
	       new String[]{"A", "B", "C", "D", "E", "F"}));        
	    resultList = new ArrayList<String>();	       
        	    
	    myFilterIterator = new FilteringIterator<String>(testList.iterator(),  testBadString);
	    
	    while(myFilterIterator.hasNext()){
	        String filteredElement = myFilterIterator.next();
	        resultList.add(filteredElement);
	    }
        
	    printResults(expectedList, resultList);
	    
	   
	    //Test Integer List for large integer
	    System.out.println("INTEGER TEST 1");	    
	    List<Integer> testIntegerList = new ArrayList<Integer>(Arrays.asList(
	       new Integer[]{1, 2, 3, 1000, null, 4, 2000}));
	    List<Integer> expectedIntegerList = new ArrayList<Integer>(Arrays.asList(
	       new Integer[]{1, 2, 3, 4}));
	    List<Integer> resultIntegerList = new ArrayList<Integer>();
	    IObjectTest testForLargeInteger = new TestForLargeInteger(new Integer(1000));
        	    
	    Iterator<Integer> myIntegerFilterIterator = new FilteringIterator<Integer>(testIntegerList.iterator(), testForLargeInteger);
	    
	    while(myIntegerFilterIterator.hasNext()){
	        Integer filteredElement = myIntegerFilterIterator.next();
	        resultIntegerList.add(filteredElement);
	    }
        
	    printResults(expectedIntegerList, resultIntegerList);
	   
	   
		//Test Integer List for large integer
	    System.out.println("INTEGER TEST 2");	    
	    testIntegerList = new ArrayList<Integer>(Arrays.asList(
	       new Integer[]{1, 2, 3, 1000, null, 4, 2000, 5, 6, 7, null, null, 10001}));
	    expectedIntegerList = new ArrayList<Integer>(Arrays.asList(
	       new Integer[]{1, 2, 3, 4, 5, 6, 7}));
	    resultIntegerList = new ArrayList<Integer>();

	    myIntegerFilterIterator = new FilteringIterator<Integer>(testIntegerList.iterator(), testForLargeInteger);
	    
	    while(myIntegerFilterIterator.hasNext()){
	        Integer filteredElement = myIntegerFilterIterator.next();
	        resultIntegerList.add(filteredElement);
	    }
        
	    printResults(expectedIntegerList, resultIntegerList);
   
	   
        System.out.println("Testing Filtering Iterator Framework Complete.");	         
        
    }

    private <E> void printResults(List<E> expectedList, List<E> resultList){
        String testResult= isListsEqual(expectedList, resultList) ? "Test Passed" : "Test Failed";
        System.out.println(testResult);

        System.out.println("Expected List: " +  listToString(expectedList));
        System.out.println("Result   List: " +  listToString(resultList));
        System.out.println("");
       
    }

    private <E> boolean isListsEqual(List<E> expectedList, List<E> resultList){
        if(expectedList == null || resultList == null)
            return false;
            
        if(expectedList.size() != resultList.size())
            return false;
            
        if(!expectedList.containsAll(resultList))
            return false;
            
        return true;
    }
    
    private <E> String listToString(List<E> list){
        StringBuffer sb = new StringBuffer();
        for(E element : list){
            sb.append(element.toString());
            sb.append(" ");
        }
        
        return sb.toString();
    }


    public static void main(String[] args) {
        new Main().runTest();
    }
}
