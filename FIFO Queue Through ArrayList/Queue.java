public class Queue{
	int[] array;
	int front;
	int rear;
	int size;

	public Queue(int Alength){
		array=new int[Alength];
		this.rear=-1;
		this.front=0;
		this.size=0;
	}

	public void Enqueue(int data){
		if(isFull()){
			System.out.println("\nQueue is Full!! We Cannot Enqueue Element ");
			return;
		}else{

		rear=(rear+1)%array.length;
		System.out.println("\nEnqueue Element is : "+data);
		array[rear]=data;
		size++;
		
		}

	}

	public int Dequeue(){
		 if (isEmpty()) {
        System.out.println("Queue is Empty !! Cannot Dequeue Element");
        return -1;
    } else {
        int store = array[front];
        front = (front + 1) % array.length;

        size--;

        return store;
    }
	
	}
	public int peek(){
		return array[front];
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return size==0;
	}
	public boolean isFull(){
		return size==array.length;
	}
	public void display(){
		if (isEmpty()) {
        System.out.println("Queue is Empty.");
    } else {
        int current = front;
        for (int i = 0; i < size; i++) {
            System.out.print(array[current] + " ");
            current = (current + 1) % array.length;
        }
        System.out.println();
    }
    	
	}
	

	
}//class 