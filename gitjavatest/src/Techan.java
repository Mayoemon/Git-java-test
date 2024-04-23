public class Techan {
    private int pageLearned;

    public Techan(int pageLearned) {
        this.pageLearned = pageLearned;
    }

    public void printPageLearned() {
        System.out.println("I have learned up to page " + pageLearned + ".");
    }

    public int getPageLearned() {
        return pageLearned;
    }

    public void setPageLearned(int pageLearned) {
        this.pageLearned = pageLearned;
    }
}
