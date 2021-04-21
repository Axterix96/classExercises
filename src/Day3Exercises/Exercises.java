package Day3Exercises;

//Exercise1
public class Exercises {
    public static void main(String[] args) {
        double[] num = {2,-9,0,5,12,-25,22,9,8,12};
        int result = 0;
        for(double num1: num){
            result += num1;
           
        }
        double prom = result/10;
        System.out.println("result = " + result);
        System.out.println("prom = " + prom);
    }
}


