package Service;

// 실제로 값이 들어갈 수 있는지 체크하고 -> DAO를 호출하는 역할을 함.

import DAO.RegisterDao;
import org.springframework.beans.factory.annotation.Autowired;
import vo.RegisterVO;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class RegisterService {
//  선언 후 주입!
    RegisterDao registerDAO;
//  RegisterDao registerDAO = new RegisterDao();

//  메소드명이 클래스명과 동일하고 리턴 자료형을 정의하지 않는 메소드를 '생성자'라고 한다.
//  생성자의 규칙 1. 클래스명.equals(메소드명); 2. 리턴타입을 정의하지 않는다. void도 안됨.

//  생성자는 객체가 생성될때 호출된다. 즉. new 크워드가 사용될 때 호출된다.
//  그러나! 우리는 SpringF/W를 사용하니까! Bean을 정의해주는 XML에 작성만 하면된다!
    RegisterService(RegisterDao registerDAO) {
        this.registerDAO = registerDAO;
    }

//  메소드의 오버로딩 (기능의 *추가*)
//  여기서는 int형의 자료를 받아 1씩 후증감하는 코드에 기능을 추가하는것이다!
    public Integer join(RegisterVO input) {
        /* regList에 값이 있는 지 확인 */
        Set<Entry<Integer, RegisterVO>> regEntry =  registerDAO.regList.entrySet();
        Iterator<Entry<Integer, RegisterVO>> regIterator =  regEntry.iterator();
        while(regIterator.hasNext()) {
            Entry<Integer, RegisterVO> next = regIterator.next();
            Integer key = next.getKey();
            RegisterVO value = next.getValue();

            /* regList에 값이 있으면 return -1 */
            if(input.getUserId() == value.getUserId()) {
                System.out.println("이미 존재하는 아이디 입니다.");
                return -1;
            }
        }
        /* 값이 없으면 값이 넣어주고 return 1 */
        registerDAO.join(input);
        return 1;
    }

    public void print() {
        Set<Entry<Integer, RegisterVO>> regEntry =  registerDAO.regList.entrySet();
        Iterator<Entry<Integer, RegisterVO>> regIterator =  regEntry.iterator();
        while(regIterator.hasNext()) {
            Entry<Integer, RegisterVO> next = regIterator.next();
            Integer key = next.getKey();
            RegisterVO value = next.getValue();
            System.out.println(String.format("Key : %s, Value : %s %s %s", String.valueOf(key), value.getUserId(), value.getUserPw(), value.getUserEmail()));
        }
    }
}
