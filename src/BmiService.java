public class BmiService {
   public double calculate (int weight, double height){
       double heightSquare = height*height;
       double bmi = weight/heightSquare;
       return bmi;
   }
}
