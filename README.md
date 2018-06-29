# description

Purpose of this repo is to provide source code of examples related to design patterns.

# ideas

1. Factory - create program that will accept one parameter filePath.
  a. program should print file content to System.out
  b. if file was not found or argument not provided it should ask user to provide 
  filePath at runtime using System.in and then print file content to System.out
  
  hint: use factory to return InputSteam from filePath or ask user

2. Strategia - payment calcualtor with with BonusStrategy, arguments
  a. position: JUNIOR, REGULAR, SENIOR, MANAGER, BOSS
  b. numer of full worked years in company
  c. salary per month 
  d. implement three strategies for bonus calcualtion:
    - JUNIOR, REGULAR: salary * 12 * 0.05
	- SENIOR, MANAGER: (salary * 12 * 0.05) * years
	- BOSS: salary * 6
		
3. Builder - subbway sanwich builder
    - Sandwitch20Builder
	- Sandwitch40Builder
	- flatBreadBuilder
	
	- methods: setType, addCheeses, addSauce, isTakeAway
	
4. Template method - calculate specified operation for n nmubers starting from k
    - abstract class with algo get  numbers
	- perform operation (print, print sum)
	
5. Decorator - 
    - logs operation invocation result
	- caches result
	- collects invocation statistics
	
6. composit - password validator
    - length
	- number
	- largLetter
	- smallLetter
	- special characters
	
7. state - 
    - two thread application
	- one thread checks if file exists
	- second reads input command

8. observer 
	- aplication checks dir content
	- print information about any changes of file lists
		
9. adapter WordIterator
   - load from file
   - load from input

10. singletgon
   - lazy
   - eager
   - thread safe
   
   - guice - https://4programmers.net/Java/Guice
   - spring - https://www.tutorialspoint.com/spring/spring_java_based_configuration.htm


# design simple program that meet following requieremenst

1. create program printing mesage: Hello
2. user provides name as a paramter ex: -name - Factory
3. program should ask user for name and print message: Hello Artur. - Strategy


4. messages should be in mutiple lanuages, user name need to be asked for languageCode - Builder
5. only user with age over 16 are allowed to use program, suitable maessage need to be printed - Template method
6. pl user are allowed over age 21

7. printed messages should be saved to file if -out paramter provided - adapter
8. application should support loading users from csv file -in parameter - composit

9. translated message texts should be loaded from file extrenal file at app start up - adapter
10. if file is not available it should wait for file will appear -observer