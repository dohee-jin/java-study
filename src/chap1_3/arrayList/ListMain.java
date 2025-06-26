package chap1_3.arrayList;

public class ListMain {
    public static void main(String[] args) {

        StringList foods = new StringList("김밥", "제육볶음", "돈까스");
        StringList userNames = new StringList();

        foods.push("짜장면", "짬뽕", "닭곰탕");
        String deleted = foods.pop();

        userNames.push("김철수", "하츄핑");
        System.out.println(userNames);

        System.out.println(foods);
        System.out.println("deleted: " + deleted);
    }
}
