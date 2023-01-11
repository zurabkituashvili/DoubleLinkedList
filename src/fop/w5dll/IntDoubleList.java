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

//	public int append(int info){
//
//	}
}
