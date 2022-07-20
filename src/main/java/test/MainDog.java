package test;

import Animal2.Dogs;
import Animal2.MyDogs;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainDog {
    public static void main(String[] args) {
//      bean을 설정한 xml파일이 있는 위치 지정
        String configLocation = "classpath:Dogs.xml";

//      지정한 위치를 참고하여 설정파일을 얻어옴
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);

//      설정파일에서 bean을 가져옴
//      getBean()를 이용하여 Dogs타입에서 dogsInfo를 얻어와서 객체를 생성
//      = 방법 1 예제처럼 직접 생성이 아닌 외부에서 얻어옴(주입을 시켜줌)
        Dogs dogsInfo = ctx.getBean("dogsInfo",Dogs.class);
//      첫번째 강아지의 정보를 호출
        dogsInfo.getMyDogsInfo();
//      두번째 고양이의 정보를 호출
        MyDogs dog2 = ctx.getBean("dog2",MyDogs.class);
        dogsInfo.setMyDogsInfo(dog2);
        dogsInfo.getMyDogsInfo();

//      다 사용한 객체를 close()를 이용해서 닫아주어야 무리가 안감!
        ctx.close();
    }
}
