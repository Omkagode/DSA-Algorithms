public class CircularQueue {

    static class  Queue {
        static int []arr;
        static int size;
        static int front;
        static int rear;

        // Create the constructer 

        public Queue(int n){
            arr= new int[n];
            size=n;
            front=-1;
            rear=-1;

        }
    

        // isFull function creation 
        public boolean isFull(){
            return (rear+1)%size==front;
        }


        //is Queue is empty
        public boolean isEmpty(){
            return rear==-1&& front==-1;
        }
        
        //add 
        public void add(int data){
            //base condition : is full or not 
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }

            //add 1st element 
            if(front==-1){
                front=0;
            }

            rear=(rear+1)%size;
            arr[rear]=data;

        }

        // remove
        public int remove(){
            //base condition : Queue is empty
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;

            }

            int RemovedElement =arr[front];

            //condition for last element delete 

            if(rear==front){
                rear=front= -1;
            }else{
                front=(front+1)%size;
            }

            return RemovedElement;
        }


        public int peek(){
             //base condition : Queue is empty
             if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;

            }

            return arr[front];

        }
    }

    public static void main(String[] args) {
        Queue q= new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
            
        }
    }
    
}
