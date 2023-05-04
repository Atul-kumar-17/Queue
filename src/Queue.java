public class Queue {
    int[] arr;
    int front, rear;
    int capacity;

    Queue(int size) {
        arr = new int[size];
        front = -1;
        rear = -1;
        capacity = size;
    }

    public void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue overflow");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            arr[rear] = element;
            System.out.println("Insert " + element);
        }

    }

    int deQueue(int element) {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = arr[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("deleted " + element);
            return (element);
        }
    }


    private boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    private boolean isFull() {
        if (front == 0 && rear == capacity - 1) {
            return true;
        }
        return false;
    }

    public void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("front " + front);
            System.out.println("display element");
            for (i = front; i <= rear; i++) {
                System.out.println(arr[i] + " ; ");
                System.out.println("rear "+rear);
            }
        }
    }
}


