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
		if (tail != null) {
			IntDoubleListElement element = new IntDoubleListElement(info);
			element.prev = tail;
			tail = element;
			element.next = null;
		}

		else {
			tail = new IntDoubleListElement(info);
		}

	}
}
