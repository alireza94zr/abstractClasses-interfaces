package org.example;

public class musicplayer implements Playble{


    @Override
    public void play()
    {
        System.out.println("playing audio file");
    }


    @Override
    public void stop()
    {
        System.out.println("stoping audio file");
    }


}