package fop.w5dll;

public class IntDoubleList {
	private IntDoubleListElement head, tail;

	public IntDoubleList() {
		head = null;
		tail = null;
	}

	public IntDoubleListElement getFirstElement(){
		return head;
	}


	public IntDoubleListElement getLastElement(){
		return tail;
	}

	public void append(int info){
		IntDoubleListElement element = new IntDoubleListElement(info);
		if (tail != null) {
			tail.next = element;
			element.prev = tail;
			tail = element;
			element.next = null;
		}
		else {
			tail = element;
			head = element;
		}
	}
}
