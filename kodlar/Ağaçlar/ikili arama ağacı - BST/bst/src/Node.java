public class Node {
    int data;
    Node left; ///gösterici
    Node right;///gösterici
    public Node(int data){//parametre olarak kullanıcıdan aldığımız
        this.data=data;//datayı ekleyecez
        left=null; //sol düğüm ve sağ düğüm booş olrak alsın
        right=null;}
}
