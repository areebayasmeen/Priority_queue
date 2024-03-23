//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Queue queue=new Queue();
queue.enqueue(12);
queue.enqueue(17);
queue.enqueue(19);
queue.enqueue(20);
queue.enqueue(21);
queue.enqueue(13);
queue.display();
queue.dequeue();
System.out.println("after dequeue");
queue.display();
    }
}