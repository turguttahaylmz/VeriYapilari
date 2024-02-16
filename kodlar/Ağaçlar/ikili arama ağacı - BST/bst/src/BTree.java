public class BTree {
    Node root;//head gibi düşün
    public BTree() { //göstericisini null olarak atadım
        root= null;}
    Node newNode(int data) {//Node sınıfından yeni bir düğüm oluşturulur ve data değeri ile başlatılır.
        //Oluşturulan düğüm, root değişkenine atanır, yani ağacın kök düğümü bu yeni düğüm olur.
        root = new Node(data);
        System.out.println(data + " ağaca eklendi ");
        return root;}
    Node insert(Node root, int data) {//root: Bu parametre, ağacın bir alt ağacının kök düğümünü temsil eder.
        // Metodun çağrıldığı her an, bu parametre üzerinden ağacın bir alt dalına inilir ve işlemler gerçekleştirilir.
        // Eğer ağaç yapısı boşsa (yoksa), root parametresi null olabilir.
        //data: Bu parametre, eklemek istenilen veriyi temsil eder.
        // Metodun amacı, bu veriyi içeren yeni bir düğümü ağaca eklemektir.
        if (root != null) {
            if (data < root.data) {
                root.left = insert(root.left, data);}//ilk parametre, mevcut düğümün sol alt ağacının
            // kök düğümünü temsil eder. İkinci parametre ise eklemek istenilen veriyi ifade eder.
            else if (data > root.data) {
                root.right = insert(root.right, data);}
        }
        else {
            root = new Node(data);}
        return root;
    }
    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);}
    }
    void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");}
    }   //////////////////////////////
    int height(Node root) {
        if (root == null) {
            return 0;}
        int sol = height(root.left);
        int sag = height(root.right);
        if (sol > sag) {
            return sol + 1;}
        return sag + 1;}   ////////////////////////////
    public Node delete(Node root, int x) {
        Node t1,t2;
        if (root == null) {
            return null;}
        if (root.data == x) {
            if (root.left == null && root.right == null) //silinecek düğümün altında dal (düğüm) yok.
            {
                root = null;
                return null;}
            else if (root.left == null) {
                t1 = root.right;
                return t1;
            } else if (root.right == null) {
                t1 = root.left;
                return t1;
            } else {
                Node t1 = t2 = root.right;
                while (t1.left != null) {
                    t1 = t1.left;
                }
                t1.left = root.left;
                return t2;
            }
        }
        else
        if (root.data > x) {
            root.left = delete(root.left, x);
        }
        else {
            root.right = delete(root.right, x);
        }
        return root;
    }
}