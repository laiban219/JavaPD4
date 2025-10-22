class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  }

  String creditCardType(String card){
    if(card.substring(0,1).equals("4")){
      return "Visa";
    }
    else if(card.substring(0,2).equals("34") || card.substring(0,2).equals("37")){
      return "American Express";
    }
    else if(card.substring(0,2).equals("36")){
      return "Diner Club";
    }
    else if(card.substring(0,2).equals("51") || card.substring(0,2).equals("55")){
      return "Mastercard";
    }
    else if(card.substring(0,4).equals("6011") || card.substring(0,2).equals("65")){
      return "Discovery";
     }
  }
  
  String pigLatin(String word){
    return word.substring(1) + word.substring(0,1) + "ay";
  }

  String nycLocate(string zipCode){
    if(zipCode.substring(0,3).equals("100") || zipCode.substring(0,3).equals("101") || zipCode.substring(0,3).equals("102")){
     return "Manhattan"; 
    }
    else if(zipCode.sunstring(0,3).equals("103")){
      return "Staten Island";
    }
    else if(zipCode.sunstring(0,3).equals("104")){
      return "Bronx";
    }
    else if(zipCode.sunstring(0,3).equals("112")){
      return "Brooklyn";
    }
    else if(zipCode.sunstring(0,3).equals("113") || zipCode.sunstring(0,3).equals("114") || zipCode.sunstring(0,3).equals("111")){
      return "Queens";
    }
  }

  String getMonth(String date){
    String month = date.substring(0,2); 
    if(month.equals("01")){
      return "January";
    }
    else if(month.equals("02")){
      return "February";
    }
    else if(month.equals("03")){
      return "March";
    }
    else if(month.equals("04")){
      return "April";
    }
    else if(month.equals("05")){
      return "May";
    }
    else if(month.equals("06")){
      return "June";
    }
    else if(month.equals("07")){
      return "July";
    }
    else if(month.equals("08")){
      return "August";
    }
    else if(month.equals("09")){
      return "September";
    }
    else if(month.equals("10")){
      return "October";
    }
    else if(month.equals("11")){
      return "November";
    }
    else if(month.equals("12")){
      return "December";
    }
    else{
      return "Unknown";
    }
  }

  boolean validatePswd(String pswd){
    if(pswd.lengthOf("^")==-1 && pswd.lengthOf("*")==-1 && pswd.lengthOf("(")==-1 && pswd.lengthOf(")")==-1){
      return "true"; 
    }
    else{
      return "false";
    }
  }
}