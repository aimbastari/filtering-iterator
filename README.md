Running java Main.class produces the following output:  

# Testing Filtering Iterator Framework.
   
### STRING TEST 1 ###  
**Test Passed**     

LIST NAME | DATA
------------ | -------------
test | A B C badString badString D  
Expected | A B C D     
Result | A B C D   
<br>

### STRING TEST 2 ###  
**Test Passed**  
   
LIST NAME | DATA
------------ | -------------
test | badString A B C badString D badString E F 
Expected | A B C D E F    
Result | A B C D E F  
<br>
 
### INTEGER TEST 1 ###  
**Test Passed**  

LIST NAME | DATA
------------ | -------------
test | 1 2 3 1000 null 4 2000 
Expected | 1 2 3 4  
Result | 1 2 3 4
<br>
   
### INTEGER TEST 2 ###  
**Test Passed**  

LIST NAME | DATA
------------ | -------------
test | 1 2 3 1000 null 4 2000 5 6 7 null null 10001
Expected | 1 2 3 4 5 6 7
Result | 1 2 3 4 5 6 7
<br>

Testing Filtering Iterator Framework Complete.
