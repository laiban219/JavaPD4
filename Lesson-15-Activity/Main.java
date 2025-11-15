class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    print(spaces(4));
    print("harmonic: "+harmonic(5)); 
    print("Sine: "+sine(5, Math.PI/6));
    fib(1);
    fib(2);
    fib(3);
    fib(10);
   
    
  }
   
  String spaces(int N){ 
    N>=0; 
    if(i=N;i;i++){
      return 1; // 0! = 1
    else{
      int f=1;
      for(int x=1;x<=n; x++)
        f*=x;
      return f;
    }
    
  }

  String spaces(int N){
    String bld = "";
    
    for(int x=0; x<N;x++){
      bld+=" ";
    }
    return bld + "DONE";
  }

  double harmonic(int N){
    double sum=0;
    for(int x=1; x<=N; x++){
      sum += 1./x;
    }
    return sum;
  }

  double sine(int N, double rad){
    double sum=0;
    for(int i=0; i<=N; i++){
      sum+= (Math.pow(-1,i)*Math.pow(rad,2*i+1))/fact(2*i+1);
    }
    return sum;
  } 

  double fib(int N, double rad){
    double sum=0;
    int sign=1;
    for(int i=1; i<2*N; i+=2){
      sum+= sign * Math.pow(rad,i)/fact(i);
      sign*=-1;
    }
    return sum;
  }

  
   
}