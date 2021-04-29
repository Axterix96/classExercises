package ExtraExercises;

public class ExtraExercises {

    public static void followingOutput(){
        String s = "Hello";
        String t = new String(s);
        if ("Hello".equals(s))
            System.out.println("one");
        if (t == s) System.out.println("two");
        if (t.equals(s)) System.out.println("three");
        if ("Hello" == s) System.out.println("four");
        if ("Hello" == t) System.out.println("five");
        //Prints one three four
    }

    public static void resultFollowing(){
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb);
        //result abbaccca
    }
    public static void followingApp(){
        int x = 0;
        while(x++ < 10) {

        }
        String message = x > 10 ? "Greater than" : "false";
        System.out.println(message+", "+x);
        //greater than 11
    }
    public static void manyTimes(){
        for(int i=0; i<10 ;i ++ ) {
            i = i++;
            System.out.println("Hello World");
        }
        //infinite loop
    }
    public static void codeSnippet(){
        int x1 = 50, x2 = 75;
        boolean b = x1 >= x2;
        if(b = true)
            System.out.println("Success");
        else
            System.out.println("Failure");
        //success
    }
    public enum Flavors {
        VANILLA, CHOCOLATE, STRAWBERRY
    }

    public static void main(String[] args) {
        followingOutput();
        resultFollowing();
        followingApp();
        manyTimes();
        codeSnippet();

        Flavors f = Flavors.STRAWBERRY;

        switch (f) {
        }
    }
}
