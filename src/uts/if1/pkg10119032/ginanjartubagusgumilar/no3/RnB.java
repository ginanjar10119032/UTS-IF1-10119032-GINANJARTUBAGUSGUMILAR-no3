
package uts.if1.pkg10119032.ginanjartubagusgumilar.no3;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi class RnB
 */
public class RnB implements Blues, Jazz {

    @Override
    public void genreBlues(String artistName) {
        String blues = "Blues";
        System.out.println(artistName +  " adalah musisi " + blues);
    }

    @Override
    public void genreJazz(String artistName) {
        String jazz = "Jazz";
        System.out.println(artistName +  " adalah musisi " + jazz);
    }
    
}
