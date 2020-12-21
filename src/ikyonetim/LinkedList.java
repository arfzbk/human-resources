
package ikyonetim;

import java.io.Serializable;
import sun.font.TrueTypeFont;



public class LinkedList implements Serializable{
    NodeLink head;
    public LinkedList() {
        this.head = null;
    } 

   public void addFirst(Object Data){
       NodeLink temp=new NodeLink(Data);
       temp.next=head;
       head=temp;
   }
   public void addLast(Object Data){
       if (head==null) {
           head=new NodeLink(Data);
           head.next=null;
       }
       else{
           NodeLink temp=new NodeLink(Data);
           NodeLink active=head;
           while (active.next!=null) {               
               active=active.next;
           }
           active.next=temp;
       }
   }
   public void delete(Object Data){
       NodeLink temp=new NodeLink(Data);
       if (temp.next==null) {
           temp=null;
      }
       temp.Data=temp.next.Data;
       temp.next=temp.next.next;
   }
   public Boolean contains(Object Data){
       NodeLink active=head;
       while (active.next!=null) {           
           if (active.Data==Data) {
               return true;
           }
           active=active.next;
       }
       return false;
   }
   public String bilgiWriteString(){
       NodeLink temp=head;
       String yazi="";
       while (temp!=null) { 
           if (temp.Data instanceof Double) {
               temp.Data=String.valueOf(temp.Data);
           }
           yazi=yazi+(String)temp.Data+",";
           
           temp=temp.next;
       }
       return yazi.toLowerCase();
   }
   
   public void write(){
       NodeLink temp=head;
       while (temp!=null) {           
           System.out.println(temp.Data);
           temp=temp.next;
       }
       
   }
   public String bilgiEmailReturn(){
       NodeLink temp=head;
       for (int i = 0; i < 4; i++) {
           temp=temp.next;
       }
       return (String)temp.Data;
   }
   public String egitimLisansReturn(){
       NodeLink temp=head;
       String lisanslar="";
       while (temp!=null) {
           LinkedList liste=(LinkedList)temp.Data;
          NodeLink temp2=liste.head;
           for (int i = 0; i < 2; i++) {
               temp2=temp2.next;
           }
           lisanslar+=","+(String)temp2.Data;
           temp=temp.next;
       }
     return  lisanslar;
   }
   public double isDeneyimReturn(){
      NodeLink temp=head;
      double deneyim=0;
       while (temp!=null) {   
           LinkedList liste=(LinkedList)temp.Data;
          NodeLink temp2=liste.head;
           for (int i = 0; i <3; i++) {
               
               temp2=temp2.next;
           }
           deneyim+=Double.parseDouble(String.valueOf(temp2.Data));
           temp=temp.next;
       }
       System.out.println(deneyim);
       return deneyim;
   }
   public void bilgiEmailChange(String email){
       NodeLink temp=head;
       for (int i = 0; i < 4; i++) {
           temp=temp.next;
       }
       temp.Data=email;
   }
   public String bilgiSoyadReturn(){
       NodeLink temp=head;
       temp=temp.next;
       return (String)temp.Data;
   }
   public int bilgiYasReturn(){
       NodeLink temp=head;
       int yas=2020;
       for (int i = 0; i<5; i++) {
           temp=temp.next;
       }
       yas=yas-Integer.parseInt((String)temp.Data);
       return yas;
   }
   public void clear(){
       this.head=null;
   }
   public void writeNode(){
      NodeLink temp=head;
       while (temp!=null) {  
           LinkedList l1=(LinkedList)temp.Data;
           l1.write();
           temp=temp.next;
       }
       
   }
  
   public LinkedList copy(){
       NodeLink temp=head;
       LinkedList l1=new LinkedList();
       while (temp!=null) {           
           l1.addLast(temp.Data);
           temp=temp.next;
       }
       return l1;
   }
   public boolean isNull(){
       if (head==null) {
           return true;
       }
       return false;
   }
}
