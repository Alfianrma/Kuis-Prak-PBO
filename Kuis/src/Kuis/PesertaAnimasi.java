package Kuis;

public class PesertaAnimasi implements  LombaAnimasi{
    double alur, konten, kreativitasAnimasi, sinematografi, hasil;

    public PesertaAnimasi(double alur, double konten, double kreativitasAnimasi, double sinematografi) {
        this.alur = alur;
        this.konten = konten;
        this.kreativitasAnimasi = kreativitasAnimasi;
        this.sinematografi = sinematografi;
    }

    @Override
    public double alur() {
        return (0.15 * alur);
    }

    @Override
    public double konten() {
        return (0.35 * konten);
    }

    @Override
    public double kreativitas() {
        return (0.35 * kreativitasAnimasi);
    }

    @Override
    public double sinematografi() {
        return (0.15 * sinematografi);
    }

    public void setAlur(double alur) {
        this.alur = alur;
    }

    public void setKonten(double konten) {
        this.konten = konten;
    }

    public void setKreativitasAnimasi(double kreativitasAnimasi) {
        this.kreativitasAnimasi = kreativitasAnimasi;
    }

    public void setSinematografi(double sinematografi) {
        this.sinematografi = sinematografi;
    }

    public double hasil(){
        return (alur() + konten() + kreativitas() + sinematografi());
    }
}
