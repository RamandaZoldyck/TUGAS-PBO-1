
class klinik {
    List<ruangan> daftarRuangan;

    klinik(){
        daftarRuangan = new ArrayList<>();
        ruangan r1 = new ruangan(101);
        ruangan r2 = new ruangan(102);
        ruangan r3 = new ruangan(103);

        daftarRuangan.add(r1);
        daftarRuangan.add(r2);
        daftarRuangan.add(r3);
    }
}