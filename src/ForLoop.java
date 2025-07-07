public class ForLoop {

    void checkFor(){
//        for(int i=1; i<11; i++){
//            System.out.println("Count is: " + i);
//        }

        // infinite loop
//        for ( ; ; ) {
//            System.out.println("Infinity!");
//        }

        // Designed for iteration with Collections or Arrays
        //      enhanced for statement
        //      saw it in switch example - prev session
        int[] numbers = {1,2,3,4,5,6};

        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }
    }

    public static void main(String[] args) {
        ForLoop forLoop = new ForLoop();

        forLoop.checkFor();
    }
}
