package fop.w5dll;

public class IntDoubleListElement {
    private int[] info;
    public IntDoubleListElement next, prev;

    public IntDoubleListElement(int info, IntDoubleListElement next, IntDoubleListElement prev) {
        this.info = new int[]{info} ;
        this.next = next;
        this.prev = prev;
    }
}
