package chap2_4.collection.song;

import chap1_9.static_.util.InputUtils;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static chap1_9.static_.util.InputUtils.prompt;

// 프로그램의 입출력 처리
public class ArtistController {

    private ArtistRepository repository;

    public ArtistController() {
        this.repository = new ArtistRepository();
    }

    public void start() {


        while (true) {
            System.out.println("\n\n****** 음악 관리 프로그램 ******");
            System.out.printf("# 현재 등록된 가수: %d명\n", repository.count());
            System.out.println("# 1. 노래 등록하기");
            System.out.println("# 2. 노래 정보 검색");
            System.out.println("# 3. 등록된 가수 전체조회");
            System.out.println("# 4. 프로그램 종료");
            System.out.println("==================================");

            String menuNum = prompt(">> ");

            switch (menuNum) {
                case "1":
                    addArtistProcess();
                    break;
                case "2":
                    searchProcess();
                    break;
                case "3":
                    // 전체 등록되어있는 가수들의 이름과 노래의 개수를 출력
                    // ex) 동방신기 - 총 4곡
                    //     르세라핌 - 총 2곡
                    showAllArtist();
                    break;
                case "4":
                    System.out.println("# 프로그램을 종료합니까? [y/n]");
                    String exit = prompt(">> ");
                    if (exit.equalsIgnoreCase("y")
                        || exit.equals("ㅛ"))
                    {
                        System.exit(0);
                    } else {
                        System.out.println("# 종료를 취소합니다.");
                    }
                    break;
                default:
                    System.out.println("# 메뉴를 잘못 입력했습니다.");
            }// end switch

            System.out.println("==== 계속하시려면 Enter... ====");
            prompt("");
        }


    } // end start()

    // 1번 메뉴 선택
    public void addArtistProcess() {
        System.out.println("\n# 노래등록을 시작합니다.");
        String name = prompt("- 가수명: ");
        String song = prompt("- 노래명: ");

        // 1. 지금 등록하는 가수가 신규등록인지 기존 가수인지 확인
        // 2. repository 한테 메시징을 보내서 확인해봐야 함
        boolean registered = repository.isRegistered(name);
        if(!registered){
            // 신규 등록
            // Artist 객체를 생성해서 Map 저장
            repository.addNewArtist(name, song);
            System.out.printf("\n# %s 님이 신규등록되었습니다.\n",name);
        } else {
            // 기존에 등록된 가수에 대한 처리
            // Map 에서 가수 정보를 가져 와서 해당 가수의 노래목록에 추가
            boolean flag = repository.addNewSong(name, song);
            // 출력메세지:
            // 1. 기존 가수에 새 노래를 추가했다는 메세지
            // 2. 중복된 노래명이라는 메세지
            if(flag) {
                System.out.printf("\n# %s 님의 노래목록에 %s 곡이 추가되었습니다.\n", name, song);
            } else {
                System.out.printf("\n# [%s] 곡은 이미 추가된 곡입니다.\n", song);
            }
        }
    }

    // 2번 메뉴 선택
    private void searchProcess() {
        String name = prompt("\n# 검색할 가수명을 입력하세요! - ");
        if(repository.isRegistered(name)){
            // 노래목록 가져오기
            Set<String> trackList = repository.getTrackList(name);
            System.out.printf("\n# %s님의 노래목록\n", name);
            System.out.println("========================");
            for(String songName : trackList) {
                System.out.printf("# %s\n", songName);
            }
        } else {
            System.out.printf("\n# %s 가수는 등록된 가수가 아닙니다. \n", name);
        }
    }

    // 3번 메뉴 선택
    private void showAllArtist() {
        // 가수명이랑 노래개수 내놔
        Map<String, Integer> artistData = repository.getArtistNameAndSongCount();

        System.out.println("===== 전체 가수 정보 =====");
        for (String name : artistData.keySet()) {
            System.out.printf("# %s - 총 %d곡\n", name, artistData.get(name));
        }

       /*
        내 코드
        System.out.println("\n===== 전체 가수 정보 =====");
        // 저장된 전체 가수 수
        Set<String> artistName = repository.getAllArtist();
        // 가수명으로 노래 개수 가져오기
        for(String artist : artistName){
            System.out.printf("# %s - 총 %d 곡\n", artist, repository.numberOfSongs(artist));
        }*/
    }

} // end class
