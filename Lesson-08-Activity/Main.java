class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
	print("hello");
	double cel = FtoC(73.6);
	double V = sphereVolume(2.5);
	System.out.println(r);
	double cV = coneVolume(15.9, 31.2);
	double D = distance(2,3,6,5);
  }

  void print(String msg){ 
	System.out.println(msg); 
  }
  double FtoC(double f){ 
	double cel = (f - 32)*5/9.0;
	return cel; 
  }
  double sphereVolume(double r){ 
	double V = 4/3.0*Math.PI*Math.pow(r,3); 
    return V;
  }
  double coneVolume(double r, double h){ 
	double cV = 1/3.0*h*Math.PI*Math.pow(r,2));  
    return cV;
  }
  double distance(double x1, double y1, double x2, double y2){ 
	double D = (y2-y1) / (x2-x1);
	return D;
  }
}