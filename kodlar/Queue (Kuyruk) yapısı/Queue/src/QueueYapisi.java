public class QueueYapisi {
    Node front; // head
    Node rear; // tail
    int cnt; // counter (sayıcı)
    int size;

    public QueueYapisi(int size) {
        this.size = size;
        cnt = 0;
        front = null;
        rear = null;
    }

    void enQueue(int data) {
        if (isFull()) {
            System.out.println("kuyruk dolu, ekleme yapılamadı ");
        } else {
            Node eleman = new Node(data);
            if (isEmpty()) {
                front = eleman;
                rear = eleman;
                System.out.println(data + " kuyruğa ilk eleman olarak eklendi");
            } else {
                rear.next = eleman;
                rear = rear.next;
                System.out.println(data + " kuyruğa eklendi");
            }
            cnt++;
        }
    }

    boolean isFull() {
        return cnt == size;}

    boolean isEmpty() {
        return cnt == 0;}
    void print() {
        if (isEmpty()) {
            System.out.println("kuyruk boş, yazdırılacak eleman yok ");
        } else {
            Node temp = front;
            System.out.print("baş <- ");
            while (temp != null) {
                System.out.print(temp.data + " <- ");
                temp = temp.next;}
            System.out.println(" son");}
    }
}