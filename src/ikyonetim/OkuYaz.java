
package ikyonetim;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public  class OkuYaz {
    public static void bilgileriKaydet(BinaryTree t1) {
        try (ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("agac.bin"))){
             out.writeObject(t1);            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı hatası");
        } catch (IOException ex) {
            System.out.println("IO hatası");
        } 
    }
    public static BinaryTree bilgileriOku(){
        try (ObjectInputStream stream=new ObjectInputStream(new FileInputStream("agac.bin"))){          
            BinaryTree t1=(BinaryTree)stream.readObject();
            return t1;
        } catch (Exception e)
        {
            System.out.println("Bilgileri okurken hata");
        }
        return null;
    } 
    
}
