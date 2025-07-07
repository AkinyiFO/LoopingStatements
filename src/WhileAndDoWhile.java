public class WhileAndDoWhile {

    void demoWhile() {
        int count = 1;

        while (count < 11) {
            System.out.println("Count is: " + count);
            count++; // Risk an infinite loop without this
        }
    }

    void demoDoWhile(){
        int count = 1;
        // do block always evaluated at least once
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    }

    public static void main(String[] args) {
        WhileAndDoWhile instance = new WhileAndDoWhile();
        instance.demoWhile();

        instance.demoDoWhile();
    }

}
