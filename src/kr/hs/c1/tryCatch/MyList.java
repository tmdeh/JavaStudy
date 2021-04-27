package kr.hs.c1.tryCatch;

public class MyList {

	private MyListNode head;

	public void add(String value) {
		MyListNode node = new MyListNode();
		node.setValue(value);

		if (head == null) {
			head = node;
		} else {
			MyListNode pointer = head;
			while (true) {
				if (pointer.getNext() == null) {
					pointer.setNext(node);
					break;
				} else {
					pointer = pointer.getNext();
				}
			}
		}
	}

	public void delete(int index) {
		MyListNode nextnode = getNode(index).getNext();
		if(getNode(index) == null)
			System.out.println("값이 없습니다.");
		
		if(index < 1) {
			head = getNode(index+1);
		}
		else{
			getNode(index-1).setNext(nextnode);
		}
	}

	public String get(int index) {
		return getNode(index).getValue();
	}

	public int getSize() {
		MyListNode node = head;
		if(head == null)
			return 0;
		
		int i = 1; //헤드 포함
		while(true) {
			node = node.getNext();
			if(node == null) {
				return i;
			}
			i++;
		}
			
	}
	
	public void allShow() {
		MyListNode Node = getNode(0); 
		while(true) {
			System.out.println(Node.getValue());
			Node = Node.getNext();
			if(Node == null) {
				break;
			}
		}
	}

	private MyListNode getNode(int index) {
		MyListNode node = head;

		if (node == null || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}

		for (int i = 0; i < index; i++) {
			node = node.getNext();
			if (node == null) {
				throw new ArrayIndexOutOfBoundsException();
			}
		}

		return node;
	}

	public static void main(String[] args) {

		MyList list = new MyList();

		list.add("대소고");
		list.add("자바 수업");
		list.add("지루하다");
		list.add("히히");
//		list.delete(1);

//		System.out.println(list.get(0));
//
//		
//		System.out.println(list.get(0));
//
//		System.out.println(list.getSize());
		
		list.allShow();
	}
}