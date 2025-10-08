class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
   
        
  }

    /*
      Problem 1:      
      Write a function groupSavings that takes number of tickets wanting 
      to purchase. Return the total cost by apply the following discount:
      1 to 8 tickets  : each ticket cost $11,
      9 to 16 tickets : each ticket cost $10.50
      over 16 tickts  : each ticket cost $8.50
    */
    double groupSavings(int tickets){ 
      if(tickets >= 1 && tickets <= 8){ 
        return tickets * 11; 
      }
      if(tickets >= 9 && tickets <= 16){
        return tickets * 10.50; 
      }
      else{ 
        return tickets * 8.50;
      }
    }
  
  /*
      Write a function groceryDiscount that takes the total amount spent at 
      a grocery store and the number of cans of beans purchased.
      Depending on the total amount and number of can of
      beans purchase, you get a savings on their total bill.
      Return the savings amount:
        Spent $100 to $200 and purchase at least 3 cans of 
        beans: $10 savings
        Spent over $200 and purchase more than 4 cans 
        of beans: $25 savings
        Otherwise: $0 savings.
    */
    double groceryDiscount(double spent,int beans){ 
      if((spent >= 100 && spent <= 200) && (beans >= 3)){ 
        return spent - 10;
      }
      if(spent > 200 && beans > 4){ 
        return spent - 25; 
      }
      else{
        return spent; 
      }
    }


}