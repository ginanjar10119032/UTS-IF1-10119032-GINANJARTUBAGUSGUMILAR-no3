
package uts.if1.pkg10119032.ginanjartubagusgumilar.no3;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi class hard rock
 */
public class HardRock extends RnB implements PopRock, ProgressiveRock, PsychedelicRock {
    public void genreHardRock(String artistName) {
        String hardRock = "Hard Rock";
        System.out.println(artistName +  " adalah musisi " + hardRock);
    }

    @Override
    public void genrePopRock(String artistName) {
        String popRock = "Pop Rock";
        System.out.println(artistName +  " adalah musisi " + popRock);        
    }

    @Override
    public void genreProgressiveRock() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void genrePsychedelic(String artistName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
