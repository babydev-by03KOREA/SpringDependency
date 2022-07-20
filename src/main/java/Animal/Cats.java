package Animal;

public class Cats {

    public void Cats() {
        System.out.println("Cats()의 생성자입니다!");
    }

    public void catsName(String firstCatName, String secondCatName){
        System.out.println("catsName() 메소드 실행");
        System.out.println("첫번째 고양이 이름은 " + firstCatName + "입니다.");
        System.out.println("두번째 고양이 이름은 " + secondCatName + "입니다.");
    }

    public void catsAge(int firstCatAge, int secondCatAge){
        System.out.println("catsAge() 메소드 실행");
        System.out.println("첫번째 고양이 나이는 " + firstCatAge + "입니다.");
        System.out.println("두번째 고양이 나이는 " + secondCatAge + "입니다.");
    }
}
