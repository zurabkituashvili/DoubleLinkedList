package fop.w5dll;

public class IntDoubleListElement {
    private int info;
    public IntDoubleListElement next, prev;

    public IntDoubleListElement(int info) {
        this.info = info;
        next = null;
        prev = null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public boolean isEqual(IntDoubleListElement other){
        if (other == null){
            return false;
        }
        return this.info == other.info;
    }
}
