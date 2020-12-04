
package uts.if1.pkg10119032.ginanjartubagusgumilar.no3;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi class music genre
 */
public class MusicGenre{
    static class genre1 extends RnB {
    private String artistName;
    
    public String getArtistName(){
        return artistName;
    }
    public void setArtistName(String artistName){
        this.artistName = artistName;
    }
    }
    
    static class genre2 extends Country {
    private String artistName;
    
    public String getArtistName(){
        return artistName;
    }
    public void setArtistName(String artistName){
        this.artistName = artistName;        
    }
}    
}