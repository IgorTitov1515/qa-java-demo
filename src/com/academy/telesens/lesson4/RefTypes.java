package com.academy.telesens.lesson4;

public class RefTypes {
    public static void main(String[] args) {

        String[] tracks={"track_01", "track_03", "track_21", "track_15",
                "track_12","track_99", "track_11", "track_10"};


// переберем все треки
        int i = 0;
        for (i =0; i <tracks.length; i++){
            System.out.println(tracks[i].substring(6));

        }
        //извлекаем для каждого номер и выводим номер на консоль







    }
}
