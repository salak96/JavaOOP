import java.io.*;
import java.sql.SQLOutput;

class Utama {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //instance of class
        Game gameA = new Game("", "", "");
        Game gameB = new Game("", "", "");
        //Menu
        while (true) {
            //menu
            System.out.println("==================================");
            System.out.println("MENU GAME");
            System.out.println("==================================");
            System.out.println("1. Input Data Game A");
            System.out.println("2. Input Data Game B");
            System.out.println("3. Lihat Data Game");
            System.out.println("4. Keluar");
            System.out.println("==================================");

            //input menu
            System.out.print("Pilih Menu : ");
            int menu = Integer.parseInt(br.readLine());
            System.out.println("==================================");

        //proses input + output
        System.out.println("Masukkan Pilihan Anda : ");
        int pilih = Integer.parseInt(br.readLine());
        switch (pilih) {
            case 1 -> {
                System.out.println("Input Data Game A");
                System.out.println("==================================");
                System.out.print("Kode Game : ");
                gameA.setkode(br.readLine());
                System.out.print("Nama Game : ");
                gameA.setnama(br.readLine());
                System.out.print("Lisensi Game : ");
                gameA.setLisensi(br.readLine());
                System.out.print("Jenis Game : ");
                gameA.setJenis(br.readLine());
                System.out.print("Tipe Game : ");
                gameA.setTipe(br.readLine());
                System.out.println("==================================");
            }
            case 2 -> {
                System.out.println("Input Data Game B");
                System.out.println("==================================");
                System.out.print("Kode Game : ");
                gameB.setkode(br.readLine());
                System.out.print("Nama Game : ");
                gameB.setnama(br.readLine());
                System.out.print("Lisensi Game : ");
                gameB.setLisensi(br.readLine());
                System.out.print("Jenis Game : ");
                gameB.setJenis(br.readLine());
                System.out.print("Tipe Game : ");
                gameB.setTipe(br.readLine());
                System.out.println("==================================");
            }
            case 3 -> {
                System.out.println("Lihat Data Game");
                System.out.println("==================================");
                System.out.println("Data Game A");
                System.out.println("Kode Game : " + gameA.getKode());
                System.out.println("Nama Game : " + gameA.getNama());
                System.out.println("Lisensi Game : " + gameA.getLisensi());
                System.out.println("Jenis Game : " + gameA.getjenis());
                System.out.println("Tipe Game : " + gameA.gettipe());
                System.out.println("==================================");
                System.out.println("Data Game B");
                System.out.println("Kode Game : " + gameB.getKode());
                System.out.println("Nama Game : " + gameB.getNama());
                System.out.println("Lisensi Game : " + gameB.getLisensi());
                System.out.println("Jenis Game : " + gameB.getjenis());
                System.out.println("Tipe Game : " + gameB.gettipe());
                System.out.println("==================================");
            }
            default -> System.exit(0);
        }
        }
    }
}
