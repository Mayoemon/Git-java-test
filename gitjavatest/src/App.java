public class App {
    public static void main(String[] args) throws Exception {

        for(int i=0;i<50;i++){
            Techan t = new Techan(i);
            t.printPageLearned();
        }
        // Techan t = new Techan(50);
        // t.printPageLearned();

        System.out.println("Hello, World!");

        mayo n = new mayo();
        n.mayo();

    }
}
