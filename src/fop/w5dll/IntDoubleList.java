package fop.w5dll;

public class IntDoubleList {
	private IntDoubleListElement head, tail;
	private IntDoubleListElement[] listElements;

	public IntDoubleList(IntDoubleListElement head, IntDoubleListElement tail, IntDoubleListElement[] listElements) {
		this.head = head;
		this.tail = tail;
		this.listElements = listElements;
	}

	public IntDoubleListElement getFirstElement(){
		return this.head;
	}

	public IntDoubleListElement getLastElement(){
		return this.tail;
	}

//	public int append(int info){
//
//	}
}
