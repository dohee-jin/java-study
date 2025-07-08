package chap2_4.collection.song;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Artist implements Serializable {
    private final String artistName; // 가수명
    private final Set<String> songList; // 노래목록

    public Artist(String artistName) {
        this.artistName = artistName;
        this.songList = new HashSet<>();
    }

    // 노래를 가져다주면 노래목록에 저장하는 메소드
    public boolean addSong(String songName) {
        return this.songList.add(songName);
    }

    public Set<String> getSongList(){
        return songList;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistName='" + artistName + '\'' +
                ", songList=" + songList +
                '}';
    }
}
