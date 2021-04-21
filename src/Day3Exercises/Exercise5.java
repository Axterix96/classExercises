package Day3Exercises;
enum Months{
    JANUARY,
    FEBRAURY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
}
public class Exercise5 {
    
    public static void main(String[] args) {
    for(Months month: Months.values()){
        System.out.println("month = " + month);
    }
        System.out.println("---------------Another result for the same problem:-------------");
    Months[] m = Months.values();
    for(int i = 0; i<m.length;i++){
        System.out.println("month = " + m[i]);
    }
    }
}
