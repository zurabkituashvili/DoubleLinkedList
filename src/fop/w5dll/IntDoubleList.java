package fop.w5dll;

public class IntDoubleList {
    private IntDoubleListElement head, tail;

    public IntDoubleList() {
        head = null;
        tail = null;
    }

    public IntDoubleListElement getFirstElement() {
        return head;
    }


    public IntDoubleListElement getLastElement() {
        return tail;
    }

    public void append(int info) {
        IntDoubleListElement element = new IntDoubleListElement(info);
        if (tail != null) {
            tail.next = element;
            element.prev = tail;
            tail = element;
            element.next = null;
        } else {
            tail = element;
            head = element;
        }
    }

    public int size(){
        IntDoubleListElement current = head;
        int counter = 0;
        while(current != null){
            counter++;
            current = current.next;
        }
        return counter;
    }

    public int get(int pos){
        int counter = 0;
        IntDoubleListElement current = head;
        if (size() <= pos || pos < 0){
            System.out.println("Position out of bounds");
            return 0;
        }
        if (pos == 0) return current.getInfo();
        while (counter != pos){
            counter++;
            current = current.next;
        }
        return current.getInfo();
    }

    public void remove(int pos){
        IntDoubleListElement current = head;
        int counter = 0;
        if (current == null){
            System.out.println("List empty");
            return;
        }
        if (size() <= pos || pos < 0){
            System.out.println("Position out of bounds");
            return;
        }
        while (counter != pos){
            counter++;
            current = current.next;
        }
        if (current == head && current == tail){
            head = null;
            tail = null;
        }
        if (current == head && current.next == tail){
            head = tail;
            tail.prev = null;
        }
        if (current == tail && current.prev == head){
            tail = head;
            head.next = null;
        }
        if (current.prev != null && current.next == null){
            tail = current.prev;
            tail.next = null;
        }
        if (current.next != null && current.prev == null){
            head = current.next;
            head.prev = null;
        }
        if (current.prev != null && current.next != null){
            (current.next).prev = current.prev;
            (current.prev).next = current.next;
        }
    }

    public String toString() {
        IntDoubleListElement current = head;
        StringBuilder stringBuilder = new StringBuilder();

        while (current != null){
            if (current == tail){
                stringBuilder.append(current.getInfo());
            }
            if (current.next != null){
                stringBuilder.append(current.getInfo()).append(", ");
                current = current.next;
            }
            else current = null;
        }
        return stringBuilder.toString();
    }
}
