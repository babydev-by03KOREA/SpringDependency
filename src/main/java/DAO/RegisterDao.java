package DAO;

import java.util.HashMap;
import vo.RegisterVO;

public class RegisterDao {
    public HashMap<Integer, RegisterVO> regList = new HashMap<Integer, RegisterVO>();
    private static int SEQUENCE = 1;

    RegisterDao() {
        System.out.println("Register DAO를 생성하는데 성공했습니다.");
    }

    public Integer join (RegisterVO input){
        regList.put(SEQUENCE++, input);
        return 1;
    }
}
