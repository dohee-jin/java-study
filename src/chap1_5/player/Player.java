package chap1_5.player;

public class Player {

    String nickName;
    int level;
    int hp;

    // 생성자: 객체가 태어날 때 가져야 할 값들을 세팅
    // 객체: ~응애
    // 사용자가 생성자를 정의했으면 기본 생성자 생성 X
    // 아래 생성자의 파라미터는 지역 변수
    // 저장 위치가 달라서 필드의 동일한 이름의 변수 사용 가능.
    // 생성자 파라미터를 필드 이름과 동일하게 받을 경우
    // 구분을 위해 this 작성
    Player(String nickName) {
        //this.~ : 필드
        this.nickName  = nickName;
        this.level = 1;
        this.hp = 100;
    }

    // 자바의 모든 메서드는 첫번째 파라미터가 생략되어 있음
    // this <- 생략가능
    //  void attack(Player this, Player targetPlayer)
    // 다른 플레이어를 때릴 수 있는 기능
    void attack(Player targetPlayer) {

        if(targetPlayer == this) {
            System.out.println("스스로를 공격할 수 없습니다.");
            return;
        }

        System.out.println("targetPlayer" + targetPlayer);
        System.out.println("this" + this);
        // 상대방의 체력이 10 감소
        targetPlayer.hp -= 10;
        // 백데미지로 내 체력도 -5 감소
        // 내 hp를 의미
        this.hp -= 5;

        System.out.printf("%s 님이 %s 님을 때렸습니다.\n", this.nickName, targetPlayer.nickName);
        System.out.printf("공격자 남은 체력: %d, 타겟 남은 체력: %d\n", this.hp, targetPlayer.hp);
    }
}
