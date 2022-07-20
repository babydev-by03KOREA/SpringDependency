package Animal2;

import java.util.ArrayList;

public class MyDogs {

    private String name;
    private int age;
    private ArrayList<String> hobbys;

//  생성자를 통해 name, age, hobbys를 받아와서 각각의 필드의 값들을 초기화 시켜줌
    public MyDogs(String name, int age, ArrayList<String> hobbys) {
        super();
        this.name = name;
        this.age = age;
        this.hobbys = hobbys;
    }

//  정보 출력을 위한 getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<String> getHobbys() {
        return hobbys;
    }
}
