public class MethodsInJava {
     static int logic(int x, int y){    //we must call a static method for a static main method
        // static is used to share the method with all the objects of the same class
         int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;

        }
        return z;
    }

    public static void main(String[] args) {
         /*
         * if we don't use static, we have to create
         * an object for the code to run..
         * */
    int a=5;
    int b=7;
    int c=logic(a,b);
    // Method invocation using object creation
    // MethodsInJava obj=new MethodsInJava();
    // c= obj.logic(a,b) ;
    int a1=5;
    int b1=3;
    int c1=logic(a1,b1) ;


        System.out.println(c);
        System.out.println(c1);
    }
}
