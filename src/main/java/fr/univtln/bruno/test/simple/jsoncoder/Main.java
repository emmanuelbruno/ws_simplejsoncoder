package fr.univtln.bruno.test.simple.jsoncoder;

import fr.univtln.bruno.test.simple.personne.Chien;
import fr.univtln.bruno.test.simple.personne.Personne;

import javax.websocket.EncodeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bruno on 23/03/14.
 */
public class Main {

    public static void main(String[] args) throws IOException, EncodeException {
        JSONCoder<List<Personne>> jsonCoder = new JSONCoder<>();
        List<Personne> list = new ArrayList<Personne>();
        Chien c1 = new Chien(1, "Rex");
        Chien c2 = new Chien(1, "Médor");
        Personne p1 = new Personne(1, "Durand", "Marie");
        Personne p2 = new Personne(2, "Dupond", "Marc");
        p1.addChien(c1);
        p2.addChien(c2);
        list.add(p1);
        list.add(p2);
        jsonCoder.encode(list, new java.io.PrintWriter(System.out));

    }
}
