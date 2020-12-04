
package uts.if1.pkg10119032.ginanjartubagusgumilar.no3;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi class country
 */
public class Country implements Rockabilly, Folk {

    @Override
    public void genreRockabilly(String artistName) {
        String genre1 = "Rockabilly";
        System.out.println(artistName +  " adalah musisi " + genre1);
    }

    @Override
    public void genreFolk(String artistName) {
        String genre2 = "Folk";
        System.out.println(artistName +  " adalah musisi " + genre2);
    }
    
}