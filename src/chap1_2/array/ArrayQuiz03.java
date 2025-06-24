package chap1_2.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz03 {
    public static void main(String[] args) {

        String [] riize = {"쇼타로", "송은석", "정성찬", "박원빈", "이소희", "이찬영"};
        Scanner sc = new Scanner(System.in);
        int index = -1;

        while(true){
            System.out.println("삭제할 이름을 입력하세요");
            String delName = sc.nextLine();

            for(int i = 0; i < riize.length; i++){
                if(riize[i].equals(delName)){
                    index = i;
                    break;
                }
            }
            if(index != -1){
                for(int j = index; j < riize.length - 1; j++){
                    riize[j] = riize[j+1];
                }
                String [] temp = new String[riize.length - 1];

                //Index 5 out of bounds for length 5
                // temp.length로 돌리면 됨
                for(int i = 0; i < riize.length - 1; i++){
                    temp[i] = riize[i];
                }

                riize = temp;
                System.out.println("- 삭제 후 배열: " + Arrays.toString(riize));
                break;
            }
            else{
                System.out.println(delName + "는(은) 없는 이름입니다.");
            }

        }
    }
}
