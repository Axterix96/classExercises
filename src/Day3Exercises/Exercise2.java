package Day3Exercises;

public class Exercise2 {
    public static void main(String[] args) {
        
        int[] num = {3,4,5,-5,0,12};
        int result = 0;
        for(int num1 : num){
            result += num1;
        }
        System.out.println("result = " + result);
    }
}
