# description

Purpose of this repo is to provide source code of examples related to design patterns.

# examples

1. Factory - create program that will print 10 generated numbers
  a. fibonaci sequence
  b. increasing sequence
  
2. Strategy - mathematical operation strategy
  a. adding
  b. multiplication
  c. subtraction
		
3. Builder - meal builder
    - vegetarian
	- meat
	- fastFood
	
4. Template method - calculate specified operation for n nmubers starting from k
    - print numers
	- print operation type
	- print result (custom algorith per class)
	
5. Decorator - 
    - logs operation invocation result
	- caches result
	- collects invocation statistics
	
6. composit - password validator
    - length
	- updaerCaseLetter
	
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

1. create program printing message: Hello World
2. accepting parameter, create program printing message: Hello World


2. user provides name as a paramter ex: -name - Factory
3. program should ask user for name and print message: Hello Artur. - Strategy


4. messages should be in mutiple lanuages, user name need to be asked for languageCode - Builder
5. only user with age over 16 are allowed to use program, suitable maessage need to be printed - Template method
6. pl user are allowed over age 21

7. printed messages should be saved to file if -out paramter provided - adapter
8. application should support loading users from csv file -in parameter - composit

9. translated message texts should be loaded from file extrenal file at app start up - adapter
10. if file is not available it should wait for file will appear -observer