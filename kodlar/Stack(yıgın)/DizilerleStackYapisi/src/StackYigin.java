import java.sql.SQLOutput;

public class StackYigin {
    int dizi[];                                                                                                                       // stack
    int size;
    int indis;
    public StackYigin(int size) {
        this.size = size;
        dizi = new int[size];
        indis= -1;
    }

    void push( int data )                                                                                                                       // ekle
    {
        if( isFull() )
        {
            System.out.println("stack dolu !");
        }
        else
        {
            indis++;
            dizi[indis] = data;
            System.out.println("eklenen (): " + dizi[indis]);
        }
    }
    int pop()
    {
        if(!isEmpty())
        {
            return dizi[indis--];
        }
        else
        {
            System.out.println("dizi boş ! ");
            return -1;
        }
    }

    boolean isFull()
    {
        return (indis == size-1);
    }

    boolean isEmpty()
    {
        return (indis == -1);
    }
}
