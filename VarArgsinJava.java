public class VarArgsinJava {
//    static int Sum(int a, int b){
//        return a+b;
//    }
//    static int Sum(int a, int b,int c){
//        return a+b+c;
//    }
//    static int Sum(int a, int b, int c, int d){
//        return a+b+c+d;
//    }
//    static int Sum(int a, int b, int c, int d, int e){
//        return a+b+c+d+e;
//    }
    static int Sum(int f,int ...arr){
        int results=f;
        for(int elements:arr){
            results+=elements;
        }
        return results;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to VarArgs Tutorial");
        System.out.println("The Sum of 4 & 5 is: "+Sum(4,5));
        System.out.println("The Sum of 4, 3 & 5 is: "+Sum(4, 3, 5));
        System.out.println("The Sum of 4, 3, 6 & 5 is: "+Sum(4, 3, 6, 5));
        System.out.println("The Sum of 4, 3, 6, 7 & 5 is: "+Sum(4, 3, 6 , 7, 5));
        System.out.println("The Sum of Nothing is: "+Sum(1));
        //System.out.println("The Sum of Nothing is: "+Sum());

    }
}
