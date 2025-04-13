public class arraysInJava {
    public static void main(String[] args) {
        //int [] marks={100,93,84,65,48,85};
        float [] marks={95.5f,56.5f,45.5f,86.5f,98.5f};
        String []studs={"Rakibul","Hasan","Rakib","Rahat"};
        System.out.println("length of Array: "+marks.length);
        System.out.println(marks[4]);
        System.out.println("length of Student Array: "+studs.length);
        System.out.println("Name of Student: "+studs[2]);

        //for-each loop example
        for(float element: marks){
            System.out.println(element);
        }
    }
}
