package Day3Exercises;

public class Exercise3 {
    public static void main(String[] args) {
        int[] num = {25,9,5,-3};
        int pos = 0;
        for(int num1:num){
            if(num1 >0){
                pos+= num1;
            }
        }
        System.out.println("pos = " + pos);
    }
}
