
package ikyonetim;
import java.io.Serializable;
public class BinaryTree implements Serializable{
    Node root;
    BinaryTree(){
        root=null;
        String="";
    }
    public Node returnRoot(){
        return root;
    }
    public void add(String isim_ekle,LinkedList bilgi,LinkedList is_durumu,LinkedList egitim,LinkedList yabanci_dil,LinkedList ehliyetList)
    {
        Node newNode=new Node(isim_ekle,bilgi,is_durumu,egitim,yabanci_dil,ehliyetList);
        if (root==null) {
            root=newNode;
            return;
        }
        else{
            Node temp=root;
            Node parent;
            while (true) {                
                parent=temp;
                if (isim_ekle.compareTo(temp.getIsim())<0) {
                    temp=temp.sol;
                    if (temp==null) {
                        parent.sol=newNode;
                        return;
                    }
                }
                else{
                    temp=temp.sag;
                    if (temp==null) {
                        parent.sag=newNode;
                        return;
                    }
                }
            }
        }
    }
    //Sonra silmek için doldurulacak public void delete(){}
    public int maxDepth(Node root){
        if (root==null) {
            return 0;
        }
        int leftDepth=maxDepth(root.sol);
        int rightDepth=maxDepth(root.sag);
        if (leftDepth>rightDepth) {
            return leftDepth+1;
        }
        else
        {
            return rightDepth+1;
        }
    }
    public int nodeDepth(Node node, String email, int level)  
    { 
        if (node == null) 
            return 0; 
   
        if (node.getBilgi().bilgiEmailReturn().equals(email)) 
            return level; 
   
        int downlevel = nodeDepth(node.sol, email, level + 1); 
        if (downlevel != 0) 
            return downlevel; 
   
        downlevel = nodeDepth(node.sag, email, level + 1); 
        return downlevel; 
    } 
    public void preOrder(Node root){
        
        if (root!=null) {            
            System.out.println(root.getIsim());
            root.getBilgi().write();
            root.getIs_deneyim().writeNode();
            root.getEgitim_durum().writeNode();
            root.getYabanci_dil().write();
            root.getEhliyet_bilgisi().write();
            System.out.println(nodeDepth(this.returnRoot(),root.getBilgi().bilgiEmailReturn(), 0));
            System.out.println(root.getBilgi().bilgiWriteString());
            System.out.println("*****************");
            preOrder(root.sol);
            preOrder(root.sag);
        }
    }
    public boolean ifNodeExists( Node node, String email) {
    if (node == null) 
        return false; 
 
    if (node.emailValidate(email)) 
        return true; 
 
    boolean res1 = ifNodeExists(node.sol, email); 
   
    if(res1) return true; 

    boolean res2 = ifNodeExists(node.sag, email); 
 
    return res2; 
}
    public boolean girisDogrula(Node node,String email,String isim){
        if (node == null) 
        return false; 
    if (node.emailValidate(email)&&node.getIsim().compareTo(isim)==0) {
        return true; 
    }
 
    boolean res1 = girisDogrula(node.sol, email,isim); 
   
    if(res1) return true; 

    boolean res2 = girisDogrula(node.sag, email,isim); 
 
    return res2;
    }
    public Node returnNode(Node root,String isim,String email){
            if (root==null) {
            return null;
            }           
            if (root.getIsim().compareTo(isim)==0 && root.emailValidate(email)) {
                return root;
            }
            Node result=null;
            if(root.sol!=null) {
            result=returnNode(root.sol, isim, email);
            }
            if (result==null && root.sag!=null) {
            result=returnNode(root.sag, isim, email);
        }
        return result;
    }
    
    public Node deleteNode(Node root,Node delete){
        if (root==null) {
            return root;
        }
        if (delete.getIsim().compareTo(root.getIsim())<0) {
            root.sol=deleteNode(root.sol,delete);
        }
        if (delete.getIsim().compareTo(root.getIsim())>0) {
            root.sag=deleteNode(root.sag, delete);
        }
        if ((delete.getIsim().compareTo(root.getIsim())==0) && (delete.getNodeValidate(root))) {
            if (root.sol==null && root.sag==null) {
                root=null;
                return root;
            }
            else if(root.sol==null){
                Node temp=root;
                root=root.sag;
                temp=null;
            }
            else if (root.sag==null) {
                Node temp=root;
                root=root.sol;
                temp=null;
            }       
            
        }
        return root;
    }
  
}
