package ADT;

 class queue {

	int arr[];
	int front;
	int rear;

	queue() {
		arr = new int[5];
		rear = -1;
		front = -1;

	}

	boolean isEmpty() {
		if (rear == -1)
			return true;
		else
			return false;
	}

	boolean isFull() {
		if (rear == arr.length - 1 && front == 0 || (rear + 1 == front))
			return true;
		else
			return false;
	}

	int enqueue(int element) {
	    if (isFull() == false) {
	        if (rear == -1) {
	            rear = 0;
	            front = 0;
	        } else if (rear == arr.length - 1) {
	            rear = 0;
	        } else
	            rear++;

	        arr[rear] = element;

	    } else {
	        System.out.println("Queue Overflow");
	    }
	    return element;
	}


	int dequeue() {
	    if (isEmpty() == false) {
	        int element = arr[front];

	        if (rear == front) {
	            rear = -1;
	            front = -1;

	        } else if (front == arr.length - 1) {
	            front = 0;

	        } else {
	            front++;
	        }
	        return element;
	    }

	    System.out.println("Queue Underflow");
	    return -1;
	}


	void display() {
		 if (isEmpty()) {
		        System.out.println("Queue is empty");
		        return;
		    }
		 
		int i = front;

		while (i != rear) {
			System.out.println(arr[i]);
			if (i == arr.length - 1) {
				i = 0;
			} else {
				i++;
			}

		}
		System.out.println(arr[i]);

	}

	
	
	
	public static void main(String[] args) {
		
		queue q=new queue();
		
		q.enqueue(40);
		q.enqueue(25);
		q.enqueue(65);
		q.enqueue(10);
		q.display();

		q.dequeue();
		q.display();

		
		
	}
	
}


