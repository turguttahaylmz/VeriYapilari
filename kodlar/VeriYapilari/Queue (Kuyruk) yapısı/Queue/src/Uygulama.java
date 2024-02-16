public class Uygulama {
    public static void main(String[] args) {
        QueueYapisi kuyruk = new QueueYapisi(5);
        kuyruk.enQueue(100);
        kuyruk.enQueue(20);
        kuyruk.enQueue(30);
        kuyruk.enQueue(400);
        System.out.println("kuyruktaki eleman sayısı " + kuyruk.cnt);
        System.out.println("kuyruğun en başındaki eleman: " + kuyruk.front.data);
        System.out.println("kuyruğun en sonundaki eleman: " + kuyruk.rear.data);
        kuyruk.print();
    }
}