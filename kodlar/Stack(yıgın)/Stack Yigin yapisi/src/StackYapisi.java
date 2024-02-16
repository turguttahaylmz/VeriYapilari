import static sun.jvm.hotspot.oops.CellTypeState.top;

public class StackYapisi {
    int size;
    int cnt;
    Node top ;

    public StackYapisi(int size) {
        this.size = size;
        cnt=0;
        top= null;
    }

    void push(int data )
    {
        Node eleman = new Node( data);
        if(isFull())
        {
            System.out.println("stack dolu, ekleme yapıladı !");
        }

        if (isEmpty()){
            top = eleman;
            System.out.println(top.data + " stacke ilk eleman olarak eklendi ");}
        else
            {
            eleman.next = top;
            top= eleman;
            System.out.println(top.data+ " stacke eklendi ");}
        }
    cnt++;
    }
    void pop()
    {
        if(isEmpty())
        {
            System.out.println("stack boş ,çıkarılacak bişey yok ");
        }
        else
        {
            System.out.println(top.data+"çıkartıldı ");
            top=top.next;
            cnt--;
        }
    }
    void print() {
        if (isEmpty()) {
            System.out.println("stack boş, yazdırılacak birşey yok");
        } else {
            Node temp = top;
            System.out.println("stack deki veriler \n");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println("\n");
        }
    }

    void topGoster() {
        if (isEmpty()) {
            System.out.println("stack boş");
        } else {
            System.out.println("en üstteki düğümün datası : " + top.data);
        }
    }

    boolean isFull() {
        return cnt == size;
    }

    boolean isEmpty() {
        return cnt == 0;
    }
}
