package Abstract;

abstract class Abstract {
    abstract void callme();

    void callmetoo(){
        System.out.println("This a concrete method");
        String s = "";
    }

    abstract class B extends Abstract{

    }
}
