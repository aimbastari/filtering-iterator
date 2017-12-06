Running java Main.class produces the following output:  

# Testing Filtering Iterator Framework.
   
**STRING TEST 1**  
Test Passed
Test     List: A B C badString badString D   
Expected List: A B C D   
Result   List: A B C D   
   
**STRING TEST 2**  
Test Passed
Test     List: badString A B C badString D badString E F   
Expected List: A B C D E F   
Result   List: A B C D E F   
   
**INTEGER TEST 1**  
Test Passed
Test     List: 1 2 3 1000 null 4 2000  
Expected List: 1 2 3 4   
Result   List: 1 2 3 4   
   
**INTEGER TEST 2**  
Test Passed
Test     List: 1 2 3 1000 null 4 2000 5 6 7 null null 10001   
Expected List: 1 2 3 4 5 6 7   
Result   List: 1 2 3 4 5 6 7   
   
Testing Filtering Iterator Framework Complete.
