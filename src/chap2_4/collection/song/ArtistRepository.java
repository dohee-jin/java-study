package chap2_4.collection.song;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// 가수 객체를 자료구조로 관리하는 클래스
public class ArtistRepository {

    // 가수들을 담을 자료구조
    // Key: 가수명, value: 가수 객체
    // 현재는 껍데기만 있음 자바에서는 new 로 실체를 만들어주는 것이 중요
    private Map<String, Artist> artistMap;

    public ArtistRepository() {
        artistMap = new HashMap<>();
    }

    // 등록된 가수가 몇 팀인지 반환
    public int count() {
        return artistMap.size();
    }

    // 해당 가수 이름 등록 여부 확인
    public boolean isRegistered(String name) {
        return artistMap.containsKey(name);
    }


    public void addNewArtist(String artistName, String newSongName) {
        // 새 가수 객체 생성
        Artist newArtist = new Artist(artistName);

        // 노래를 새 가수의
        newArtist.addSong(newSongName);

        // 신규 가수를 맵에 저장
        artistMap.put(artistName, newArtist);
    }

    // 기존 가수의 노래목록에만 접근해서 새 노래를 추가
    public boolean addNewSong(String name, String song) {
        // 1. Map 에서 해당 가수를 꺼내오기
        Artist artist = artistMap.get(name);
        // 2. 이 가수의 노래목록에 노래를 추가
        return artist.addSong(song);
    }

    public Set<String> getTrackList(String name) {
        Artist artist = artistMap.get(name);
        return artist.getSongList();
    }

    // 강사님 코드
    /**
     * 모든 가수명과 그 가수의 노래개수를 리턴해야함.
     */
    public Map<String, Integer> getArtistNameAndSongCount() {
        // 목표: 1. 맵에 있는 가수명을 모두 추출
        //       2. 그 가수의 노래목록을 모두 추출 -> 개수를 셈

        /*
            {
                '동방신기': 4,
                '티아라': 6,
                '아이유': 2,
            }
         */
        Map<String, Integer> artistData = new HashMap<>();

        for (String artistName : artistMap.keySet()) {
            // 가수명 추출
            // 노래목록 추출
            Artist artist = artistMap.get(artistName);
            Set<String> songList = artist.getSongList();
            int size = songList.size();

            artistData.put(artistName, size);
        }

        return artistData;
    }
    /*
    내 코드
    // 전체 가수 이름 가져오기
    public Set<String> getAllArtist() {
        Set<String> allArtist = artistMap.keySet();
        return allArtist;
    }

    // 가수 별 총 곡의 개수 가져오기
    public int numberOfSongs(String name){
        Set<String> songList = getTrackList(name);
        return songList.size();
    }
    */

}
