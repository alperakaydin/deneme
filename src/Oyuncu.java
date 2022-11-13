import java.util.ArrayList;

public abstract class Oyuncu {
    public int OyuncuID;
    public int OyuncuAdi;
    public int skor;
    public ArrayList<IBaseObject> list;

    public Oyuncu(int oyuncuID, int oyuncuAdi, int skor, ArrayList<IBaseObject> list) {
        OyuncuID = oyuncuID;
        OyuncuAdi = oyuncuAdi;
        this.skor = skor;
        this.list = list;
    }


    public Oyuncu() {

    }

    // TODO nesneListesi  ̈ozelli ̆gi ile oyuncuların elinde bulunan nesneler listede tutulacaktır.
    // TODO SkorGoster fonksiyonu ile oyuncuların skorları g ̈osterilecektir.
    // TODO nesneSec fonksiyonu yazılmalı fakat bu sınıf bilgisayar ve kullanıcı i ̧cin farklı durum- larda  ̧calı ̧saca ̆gı unutulmamalıdır.

    public void eliGoster() {
        String tumEl = "";
        for (IBaseObject item :
                this.list) {
            tumEl += "  " + item.getClass().getName() + " Dayanıklılık : "+ item.nesnePuaniGoster()[0];
        }
        System.out.println(this.getClass().getName() + " : "+ this.skorGoster() + "  " + tumEl);
    }

    public abstract int skorGoster();

    public abstract void nesneSec();

    // 0 = Tas , 1 = Makas , 2 = Kagıt
    public abstract void nesneSec(int[] secimList);

    public int getOyuncuID() {
        return OyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        OyuncuID = oyuncuID;
    }

    public int getOyuncuAdi() {
        return OyuncuAdi;
    }

    public void setOyuncuAdi(int oyuncuAdi) {
        OyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }


}
