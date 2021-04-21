package Day3Exercises;

enum Weeks{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY,FRIDAY,SATURDAY,SUNDAY;
}


public class Exercise6 {
        Weeks day;

    public Exercise6(Weeks day) {
        this.day = day;
    }

    public void selectWeek(){
        switch (day){
            case MONDAY:
                System.out.println("week = " + day);
                break;
            case TUESDAY:
                System.out.println("day = " + day);
                break;
            case WEDNESDAY:
                System.out.println("day = " + day);
                break;
            case THURSDAY:
                System.out.println("day = " + day);
                break;
            case FRIDAY:
                System.out.println("day = " + day);
                break;
            case SATURDAY:
                System.out.println("day = " + day);
                break;
            case SUNDAY:
                System.out.println("day = " + day);
                break;
        }
    }

    public static void main(String[] args) {
        Exercise6 week = new Exercise6(Weeks.FRIDAY);
        week.selectWeek();
    }
}
