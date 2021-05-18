package Composicoes2;

import Composicoes2.entities.Comment;
import Composicoes2.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Aplicattion {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Thats Awesome !!");
        Post p1= new Post(sdf.parse("21/06/2018 13:05:44"),"Traveling to New Zeland","Im going to visit wonderful country ",12);
        p1.addComments(c1);
        p1.addComments(c2);
        System.out.println(p1);
    }
}
