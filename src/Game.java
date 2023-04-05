
 class Game extends Software {
    private String Jenis="Unknown";
    private String Tipe="Unknown";

 //constructor
    Game(String kode, String nama, String lisensi) {
        super(kode, nama, lisensi);
    }
    public Game(String kode, String nama, String lisensi, String jenis, String tipe) {
        super.setKode(kode);
        super.setNama(nama);
        super.setLisensi(lisensi);
        this.Jenis = jenis;
        this.Tipe = tipe;
    }
    //geter
    public String getJenis() {
        return super.getKode();
    }
    public String getTipe() {
        return super.getNama();
    }
    public String getLisensi() {
        return super.getLisensi();
    }
    public String getjenis() {
        return Jenis;
    }
    public String gettipe() {
        return Tipe;
    }
    //seter
    public void setJenis(String jenis) {
        this.Jenis = jenis;
    }
    public void setTipe(String tipe) {
        this.Tipe = tipe;
    }
    public void setLisensi(String lisensi) {
        super.setLisensi(lisensi);
    }
    public void setkode(String kode) {
        super.setKode(kode);
    }
    public void setnama(String nama) {
        super.setNama(nama);
    }
}
