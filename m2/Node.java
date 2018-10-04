class Node {
	private int data;
	private Node link;

	Node(int data) {
		 this.data = data;
		 this.link = null;
	}

	public int getData() {
		return this.data;
	}

	public Node getlink() {
		return this.link;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setlink(Node link) {
		this.link = link;
	}
}


class LinkedList {
	private Node start;
	private int size;

	LinkedList() { 
		this.start = null;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public void pushRight(int value) {
		if (start == null) {
			Node newnode = new Node(value);
			start = newnode;
		} else {
			Node newNode = new Node(value);
			Node a = start;
			Node temp = start;
			while (temp.getlink() != null) {
				temp = temp.getlink();
			}
			temp.setlink(newNode);
		}
		size++;
	}

	public void pushLeft(int value) {
		if (start == null) {
			Node newnode = new Node(value);
			start = newnode;
		} else {
			Node newnode = new Node(value);
			newnode.setlink(start);
			start = newnode;
			size++;
		}

	}

	public void popLeft() {
		

		if (start != null) {
			start = start.getlink();
		}
		size--;
	}

	public void popRight() {
		if (start == null) {
			System.out.println("Node is Empty");
		}

		else if(size < 2) {
           start = null;
        }

		if (size == 1) {
			start = null;
		}
		else {
			Node temp = start;
			size = size - 1;
			while (temp.getlink().getlink() != null) {
				temp = temp.getlink();
			}
			temp.setlink(null);

		}
		size--;
	}

	// public void remove(int item) {
 //        Node temp1 = start;
 //        while (temp1 != null) {
 //            if (temp1.getData() == item) {
 //                temp1.setlink(null);
 //            }
 //        }
 //        // if (temp1  == null) {
 //        //     System.out.println("Empty LinkedList");
 //        // }
 //    }

    public String toString() {

        String str = "";
        Node temp = start;
        if (temp == null) {
            return "Empty linked list";
        }
        while (temp != null) {
            str = str  + temp.getData() + ", "   ;
            //start.setLink(null);
            temp = temp.getlink();
            //System.out.println("hi..." + str);
        }
        //str = str + temp.getData();
        return str;
    }

}
