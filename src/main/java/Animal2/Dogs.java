package Animal2;

public class Dogs {
    private MyDogs myDogs;

//  생성자를 통해 myDogs를 인수로 받아와서 myDogs를 초기화시켜줌
//  myDogs의 내용을 쭉 받아온다고 생각하자!
    public Dogs(MyDogs myDogs){
        this.myDogs = myDogs;
    }

    public void getMyDogsInfo() {
        System.out.println("====================");
        System.out.println("멍뭉이 이름 : " + myDogs.getName());
        System.out.println("멍뭉이 나이 : " + myDogs.getAge());
        System.out.println("멍뭉이 취미 : " + myDogs.getHobbys());
        System.out.println("====================");
    }

//  setMyDogsInfo() 메서드에서 인자값으로 myDogs를 받아와서
//  필드의 myDogs에 값을 넣어줍니다. 어디서? 메인 클래스에서!
    public void setMyDogsInfo(MyDogs myDogs) {
        this.myDogs = myDogs;
    }
}
