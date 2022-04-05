package Kuis;

public class PesertaLomba implements  LombaAnimasi, LombaSurat{
    double NAlur;
    double NKonten;
    double NKreativitas;
    double NSinematografi;

    public PesertaLomba(double NAlur, double NKonten, double NKreativitas, double NSinematografi) {
        this.NAlur = NAlur;
        this.NKonten = NKonten;
        this.NKreativitas = NKreativitas;
        this.NSinematografi = NSinematografi;
    }

    double NilaiAlur,NilaiKonten, NilaiKreativitas, NIlaiSinematografi, HAnimasi, hasil;

    @Override
    public double alur() {
        NAlur = (NAlur*15)/100;
        return NilaiAlur;
    }

    @Override
    public double konten() {
        NKonten = (NKonten*15)/100;
        return NKonten;
    }

    @Override
    public double struktur() {
        return 0;
    }

    @Override
    public double isi() {
        return 0;
    }

    @Override
    public double kreativitas() {
        NKreativitas = (NKreativitas*15)/100;
        return NKreativitas;
    }

    @Override
    public double KaidahBahasa() {
        return 0;
    }

    @Override
    public double HasilSurat() {
        return 0;
    }

    @Override
    public double sinematografi() {
        NSinematografi = (NSinematografi*15)/100;
        return NSinematografi;
    }

    public double hasilAnimasi(){
        return (hasil = NilaiAlur + NKonten + NKreativitas + NSinematografi);
    }

}
