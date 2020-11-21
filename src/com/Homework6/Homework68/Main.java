package com.Homework6.Homework68;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        Movie[] movies = new Movie[10];
//create objects and give them rating/title
        for (int i = 0; i < movies.length; i++) {
            Movie movie = new Movie();

            System.out.print("Please enter the title of the movie: ");
            movie.setTitle(sc.nextLine());
            movie.setRating(random.nextInt(10));

            movies[i] = movie;
        }
        //print movies
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i].getTitle() + " " + movies[i].getRating() + "    ");
        }
        System.out.println();
//find best rated movie

        for (int i = 0; i < movies.length; i++) {
            for (int i1 = i; i1 < movies.length; i1++) {
                Movie temp;
                if(movies[i].getRating() > movies[i1].getRating()) {
                    temp = movies[i1];
                    movies[i1] = movies[i];
                    movies[i] = temp;
                }
            }
        }
        //print movies
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i].getTitle() + " " + movies[i].getRating() + "    ");
        }

        //print best rated movie
        System.out.println("The best rated movie/movies is/are the following");
        int bestRated = movies[9].getRating();
        for (int i = 0; i < movies.length; i++) {
            if(movies[i].getRating() == bestRated) {
                System.out.println(movies[i].getTitle() + " " + movies[i].getRating());
            }
        }
    }
}
