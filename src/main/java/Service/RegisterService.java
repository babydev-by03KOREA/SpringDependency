package Service;

// 실제로 값이 들어갈 수 있는지 체크하고 -> DAO를 호출하는 역할을 함.

import DAO.RegisterDao;
import vo.RegisterVO;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class RegisterService {
    RegisterDao registerDAO;
//  RegisterDao registerDAO = new RegisterDao();

    RegisterService(RegisterDao registerDAO) {
        this.registerDAO = registerDAO;
    }

    public int join(RegisterVO input) {
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
