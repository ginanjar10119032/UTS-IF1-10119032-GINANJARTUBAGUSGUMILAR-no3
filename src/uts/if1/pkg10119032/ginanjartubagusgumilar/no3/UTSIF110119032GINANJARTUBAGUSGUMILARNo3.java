
package uts.if1.pkg10119032.ginanjartubagusgumilar.no3;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program profil anggota band
 * menggunakan konsep objek dan inheritance
 */
public class UTSIF110119032GINANJARTUBAGUSGUMILARNo3 {

    public static void main(String[] args) {
        MusicGenre.genre1 rnb = new MusicGenre.genre1();
        MusicGenre.genre2 country = new MusicGenre.genre2();
        
        rnb.genreBlues("Jimmy Hendrik");
        rnb.genreJazz("Chad Baker");
        
        country.genreFolk("Bob Dylan");
        country.genreRockabilly("Elvis Presley");
        
        HardRock hardrock = new HardRock();
        hardrock.genrePopRock("Kiss");
        
    }

}
