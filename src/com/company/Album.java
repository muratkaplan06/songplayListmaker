package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<song> songs;

    public Album(String name,String artist) {
        this.name = name;
        this.artist=artist;
        this.songs=new ArrayList<song>();
    }

    public boolean addSong(String title,double duration){
        if(findSong(title)==null)
        {
            this.songs.add(new song(title,duration));
            return true;
        }
        return false;
    }
    private song findSong(String title){
        for(song checkedSong:this.songs){
            if(checkedSong.getTitle().equals(title))
                return checkedSong;
        }
        return null;
    }
    public boolean addToPlayList(int trackNumber, LinkedList<song> playList){
        int index=trackNumber-1;
        System.out.println(this.songs.size());
        if(index>=0&&(index<=this.songs.size())){
            playList.add(this.songs.get(index));
            System.out.println("show="+this.songs.get(index));
            return true;
        }
        System.out.println("this album does not have a track "+trackNumber);
        return false;
    }
    public boolean addToPlayList(String title,LinkedList<song> playList){
        song checkedSong=findSong(title);
        if(checkedSong!=null){
            playList.add(checkedSong);
            return true;

        }
        System.out.println("The song: -"+title+"- is not in this album");
        return false;
    }

}
