/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan32.objectorienteddaftarfilm;

import data.Film;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini berisi untuk menampilakan daftar film
 */
public class PBOIF210119064Latihan32ObjectOrientedDaftarFilm {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("===Daftar Film Sedang Tayang===");
        
        Film film1 = new Film();
        film1.filmName = "Venom";
        film1.filmGenre = "Action, Horor, Scifi";
        film1.filmRating = "8.5";
        film1.filmDuration = 120;
        film1.nowPlaying();
        
        Film film2 = new Film();
        film2.filmName = "Small Foot";
        film2.filmGenre = "Animation";
        film2.filmRating = "9.0";
        film2.filmDuration = 96;
        film2.nowPlaying();
    
        Film film3 = new Film();
        film3.filmName = "Crazy Rich Asian";
        film3.filmGenre = "Comedy";
        film3.filmRating = "7.8";
        film3.filmDuration = 119;
        film3.nowPlaying();
        
        Film film4 = new Film();
        film4.filmName = "Asih";
        film4.filmGenre = "Horor";
        film4.filmRating = "6.0";
        film4.filmDuration = 100;
        film4.nowPlaying();
    }
    
}
