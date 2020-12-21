
package ikyonetim;

import java.io.Serializable;

public class Node implements Serializable{
        private  String isim;
        private  LinkedList bilgi;
        private  LinkedList is_deneyim;
        private  LinkedList egitim_durum;
        private  LinkedList yabanci_dil;
        private  LinkedList ehliyet_bilgisi;
    public String getIsim() {
        return isim;
    }

    public void setBilgi(LinkedList bilgi) {
        this.bilgi = bilgi;
    }

    public void setIs_deneyim(LinkedList is_deneyim) {
        this.is_deneyim = is_deneyim;
    }

    public void setEgitim_durum(LinkedList egitim_durum) {
        this.egitim_durum = egitim_durum;
    }

    public void setYabanci_dil(LinkedList yabanci_dil) {
        this.yabanci_dil = yabanci_dil;
    }

    public void setEhliyet_bilgisi(LinkedList ehliyet_bilgisi) {
        this.ehliyet_bilgisi = ehliyet_bilgisi;
    }

    public LinkedList getYabanci_dil() {
        return yabanci_dil;
    }

    public  LinkedList getEhliyet_bilgisi() {
        return ehliyet_bilgisi;
    }

    public  LinkedList getBilgi() {
        return bilgi;
    }

    public  LinkedList getIs_deneyim() {
        return is_deneyim;
    }

    public  LinkedList getEgitim_durum() {
        return egitim_durum;
    }

    public Node getSag() {
        return sag;
    }

    public Node getSol() {
        return sol;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

        public Node sag;
        public Node sol;

        public Node(String isim,LinkedList bilgiler,LinkedList is_deneyimi,LinkedList egitim,LinkedList yabanciDilList,LinkedList ehliyetList) {
            this.isim = isim;
            bilgi=bilgiler;
            is_deneyim=is_deneyimi;
            egitim_durum=egitim;
            yabanci_dil=yabanciDilList;
            ehliyet_bilgisi=ehliyetList;
            sag=sol=null;
        }
    public boolean getNodeValidate(Node anotherNode){
        if (anotherNode.emailValidate(bilgi.bilgiEmailReturn())) {
            return true;
        }
        return false;
}


    public boolean emailValidate(String email){
        if (email.equals(bilgi.bilgiEmailReturn())) {
            return true;
        }
        return false;
    }
}
