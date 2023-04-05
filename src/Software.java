class Software {
    private  String kode, nama, lisensi;
    //cosntructor tidak memiliki parameter
    public Software(){
    }
    // constructor
    public Software(String kode, String nama, String lisensi) {
        this.kode = kode;
        this.nama = nama;
        this.lisensi = lisensi;
    }
    //geter dan seter
    public String getKode() {
        return kode;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getLisensi() {
        return lisensi;
    }
    public void setLisensi(String lisensi) {
        this.lisensi = lisensi;
    }
}
