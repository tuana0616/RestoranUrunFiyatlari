public abstract class Urun {
    private String ad;
    protected double fiyat;

    public Urun(String ad, double fiyat) {
        this.ad = ad;
        this.fiyat = fiyat;
    }

    public String getAd() {
        return ad;
    }

    public abstract double fiyatHesapla();
}

class Yemek extends Urun {
    public Yemek(String ad, double fiyat) {
        super(ad, fiyat);
    }

    @Override
    public double fiyatHesapla() {
        return fiyat + 50;
    }
}

class Icecek extends Urun {
    public Icecek(String ad, double fiyat) {
        super(ad, fiyat);
    }

    @Override
    public double fiyatHesapla() {
        return fiyat + 10;
    }
}

class Tatli extends Urun {
    public Tatli(String ad, double fiyat) {
        super(ad, fiyat);
    }

    @Override
    public double fiyatHesapla() {
        return fiyat * 0.90;
    }
}
