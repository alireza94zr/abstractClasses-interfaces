package org.example;

import java.util.*;
public class Tamrin {


    public static void main(String[] args) {
        ArrayList <Playble> P = new ArrayList();
        videoplayer vp = new videoplayer();
        musicplayer mp = new musicplayer();
        P.add(vp);
        P.add(mp);

        for(Playble p : P )
        {
            p.play();
        }
        System.out.println();

        for(Playble p : P )
        {
            p.stop();
        }
    }

}
