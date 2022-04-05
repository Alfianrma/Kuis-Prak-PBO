package Kuis;

public class PesertaSurat implements LombaSurat{

    public PesertaSurat(double struktur, double isi, double kreativitasSurat, double kaidahBahasa) {
        this.struktur = struktur;
        this.isi = isi;
        this.kreativitasSurat = kreativitasSurat;
        this.kaidahBahasa = kaidahBahasa;
    }

    double struktur, isi, kreativitasSurat, kaidahBahasa, hasil;

    @Override
    public double struktur() {
        return (0.1 * struktur);
    }

    @Override
    public double isi() {
        return (0.4 * isi);
    }

    @Override
    public double kreativitas() {
        return (0.3 * kreativitasSurat);
    }

    @Override
    public double KaidahBahasa() {
        return (0.2 * kaidahBahasa);
    }

    public void setStruktur(double struktur) {
        this.struktur = struktur;
    }

    public void setIsi(double isi) {
        this.isi = isi;
    }

    public void setKreativitasSurat(double kreativitasSurat) {
        this.kreativitasSurat = kreativitasSurat;
    }

    public void setKaidahBahasa(double kaidahBahasa) {
        this.kaidahBahasa = kaidahBahasa;
    }

    public double hasil(){
        return (struktur() + isi() + kreativitas() + KaidahBahasa());
    }
}
