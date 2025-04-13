public class methods_Overloading {
    static void tellJoke(){
        System.out.println("A spring without you is coming...!");
    }
    static void change(int a){
        a=98;
    }
    static void foo(){
        System.out.println("Good Game Bro!");
    }
    static void foo(int v){
        System.out.println("Good Game "+v+" bro!");
    }
    static void foo(int v,int u){
        System.out.println("Good Game "+v+" & "+u+" bro!");
    }
    /*
     Method overloading can't be performed by changing the return type of methods
    static int foo(int v,int u){
        System.out.println("Good Game "+v+" & "+u+" bro!");
        return 3 ;
    }
    */
    static void change2(int [] array){
        array[1]=99;
    }
    public static void main(String[] args) {
       /* tellJoke();

        CASE1: Changing the integer
        int x=45;
        change(x);
        System.out.println("The value of x after change is: "+ x);
        Case2: changing the array
        int [] marks={48,65,95,32,15,45,75};
        change2(marks);
        System.out.println("The value of array's 2nd index after change: "+marks[1]);
        */
        // method Overloading
        foo();
        foo(999,404);
        foo(403);
    }
}
