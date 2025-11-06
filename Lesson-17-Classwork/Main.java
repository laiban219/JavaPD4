class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    print(swapCharacter("Cherry", "r", "*"));
    print(encryption2("abcdefgh"));
    print(encryption3("abcdef"));

    
  }
  //problem 1
  String swapCharacter(String msg, String find, String replace){
  String build = "";
  for(int i=0;i<=msg.length()-1;i++){
    if(msg.substring(i,i+1).equalsIgnoreCase(find)){
      build+= replace;
    }else{
      build+=msg.substring(i,i+1);
    }
  }
  return build;
 }
  //problem2 
   String encryption2(String msg1){
  String build = "";
  int length = msg1.length();
  String first = msg1.substring(0,length/2);
  String second = msg1.substring(length/2);
  for(int i=0;i<=first.length()-1;i++){
    build += first.substring(i,i+1) + second.substring(i,i+1);
  }
  if(length%2==1){
    build+= second.substring(second.length()-1);
  }
  return build;
 }
 //problem 3
 String encryption3(String msg2){
    String build = "";
    int msglength = msg2.length();
    String firsth = msg2.substring(0,msglength/2);
    String secondhRvrs = reverse(msg2.substring(msglength/2));
 
    for(int i=0;i<=firsth.length()-1;i++){
    build += firsth.substring(i,i+1) + secondhRvrs.substring(i,i+1);
  } 
  if(msglength%2==1){
    build+= secondhRvrs.substring(secondhRvrs.length()-1);
  }
  return build;
  }


  //will use reverse for problem 3
  String reverse(String s){
    String bld="";
    for(int x=s.length()-1; x>=0; x--)
      bld+=s.substring(x,x+1);

    return bld;
  }


}