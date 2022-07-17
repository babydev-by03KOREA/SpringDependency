package DAO;

import java.util.HashMap;
import vo.RegisterVO;

public class RegisterDao {
    public HashMap<Integer, RegisterVO> regList = new HashMap<Integer, RegisterVO>();
//  Wrapper Class형이 와야함! (Integer O int X)
    private static int SEQUENCE = 1;

    RegisterDao() {
        System.out.println("Register DAO를 생성하는데 성공했습니다.");
    }

    public Integer join (RegisterVO input){
        regList.put(SEQUENCE++, input);
//      오른쪽에는 정수형, 왼쪽에는 RegisterVO Object [1=id pw mail]
        return 1;
    }
}
