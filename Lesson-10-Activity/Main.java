
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
  
   

  }
   double gpa(double GPA){ 
	if(GPA > 90){ 
		return GPA*1.1; 
	}
	else{
		return GPA;
	}
  }
  boolean isGraduating(int gradeLevel, int credits){ 
    if (gradeLevel == Senior || credits >= 44){ 
		return true;
	}
	else{
		return false;
	}
  }
  string BMI(double weight, double height){
	bmi = weight/height;
	if(bmi <= 18.4){
		return Underweight;
	}
	if else(bmi >= 18.4 && bmi <= 24.9){
		return Normal; 
	}
	if else(bmi >= 25.0 && bmi <= 39.9){
		return Overweight;
	}
	else{
		return Obese;
	}
  }
  double shippingCost(double weight){
	if(weight <= 10){ 
		return 0.00;
	}
	if else(weight > 10 && weight <= 15){
		return 5.00; 
	}
	if else(weight > 15 && weight <= 25){
		return 10.00;
	}
	else{
		return 10.00;
	}
  }
  boolean blueOrViolet(double frequence){
	if((frequence >= 600 && frequence <= 670) || (frequence >= 700 && frequence <= 750)){
		return true; 
	}
	else{
		return false;
	}
  }
}