class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
    

/*  
    Challenge 1:
    Create two integer variables and Assign values to them. 
    Calculate the sum of the two numbers and store the 
    calculated sum and then display it.
    
*/
   
int x1 = 10; 
int x2 = -90; 
int Sum = x1 + x2; 
System.out.println("The sum is:"+ Sum); 

/*  
    Challenge 2:
    Create three variables to assign three grades and Assign values to each grade. 
    Calculate the sum of the three grades and store the 
    calculated sum and then display it.
    
*/
int grade1 = 98; 
int grade2 = 87; 
int grade3 = 65; 
int Sum2 = grade1 + grade2 + grade3; 
System.out.println("The sum is:" + Sum2); 


/*  
    Challenge 3:
    Calculate the average from the three grades from challenge 2,
    store the value and then display it.
    Declare and assign values to any new variables
    NOTE: Does it look correct, check with a calculator?
*/
double avg = Sum2/3.0; 
System.out.println("The average is:" + avg); 



/*  
    Challenge 4:
    Write the following equation in EQ1.PNG file in Java; store the result and the display it:
    Declare and assign values to any new variables

*/

double A = 2.1; 
double x = 0.9; 
double y = A/(x + 1); 
System.out.println("y is" +y);

/*  
    Challenge 5:
    Using the variables same variables from challenge4 above, write the following equation in EQ2.PNG file in Java, store the result and the display it:

    Declare and assign values to any new variables

*/
 double Y = ((2*x)*(x+1)*(-x/2))/A; 
 System.out.println("y is"+Y);





/*  
    Challenge 6:
    Create the variables and write the equation in
    file  EQ3.PNG

    Declare and assign values to any new variables
*/
 double b = 4.0; 
 double h = 2.5; 
 double average = (1/2)*(b*h); 
 System.out.println("The average is" + average); 

/*  
    **** Bonus Challenge ****:
    Create a variable that stores the total number of eggs 
    and assign it 100. We want to fill as many baskets with 
    eggs as we can. Each basket can hold only 12 eggs.

    1) Write the java code that will calcute how many baskets
    of 12 eggs can we fill fully.

    HINT: What do we get when we divide an integer by 
    an integer in Java

    2) Write the java code that will calculate how many eggs
    are left over after we filled as many baskets of 12 eggs.
*/

 int eggs = 100; 
 int baskets = eggs/12; 
 double remaining = eggs - baskets; 
 System.out.println("There will be " + baskets + " full baskets and " + remaining + " eggs left.");




    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}