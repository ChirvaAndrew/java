public class Counter {
    private int attemt;

    public Counter(int attemt)
    {
        this.attemt = attemt;
    }

    public int getAttemt() {
        return attemt;
    }

    public void up() {
        attemt++;

    }

}
