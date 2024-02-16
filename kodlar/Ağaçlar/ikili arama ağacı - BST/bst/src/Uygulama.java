public class Uygulama {
    public static void main(String[] args) {
        BTree bt = new BTree();//ikili ağaçtan enesne oluşturdun
        bt.root = bt.insert(bt.root, 10);
        bt.root = bt.insert(bt.root, 15);
        bt.root = bt.insert(bt.root, 8);
        bt.root = bt.insert(bt.root, 20);
        bt.root = bt.insert(bt.root, 4);
        bt.root = bt.insert(bt.root, 12);
        System.out.println("kökün datası " + bt.root.data);
        System.out.println("kökün sağındaki datası: " + bt.root.right.data);
        System.out.println("kökün solundaki datası: " + bt.root.left.data);
        System.out.println("kökün solunun solunun datası: " + bt.root.left.left.data);
        System.out.println("kökün sağının sağının datası: " + bt.root.right.right.data);
        System.out.println("kökün sağının solunun datası: " + bt.root.right.left.data);
        /////////////////////////////////////////////////
        BTree bst;
        bst.root = bst.insert(bst.root, bst.insert(bst.root, bst.insert(bst.root, 10)), 8);
        bst.root = bst.insert(bst.root, bst.insert(bst.root, 15), 5);
        bst.root = bst.insert(bst.root, 20);
        bst.root = bst.insert(bst.root, 9);
        System.out.print("preOrder : ");bst.preOrder(bst.root);
        System.out.println();
        System.out.print("inOrder : ");
        bst.inOrder(bst.root);
        System.out.println();
        System.out.print("postOrder : ");
        bst.postOrder(bst.root);
        ///////////////////////////////////////////
        System.out.println("ağacın yükseklşiği :"+bst.height(bst.root));
        System.out.println("ağacın eleman sayısı  :"+bst.size(bst.root));
        ///////////meselaaa
        bst.inOrder(bst.root);
        System.out.println("kök düğümdeki değer :"+bst.root.data);
        bst.root=bst.delete(bst.root,10);
        System.out.println("silme işleminden sonra");
        bst.inOrder(bst.root);
        System.out.println("kök düğümdeki değer :"+bst.root.data);
    }
}