package test;

import Service.RegisterService;
import org.springframework.context.support.GenericXmlApplicationContext;
import vo.RegisterVO;

public class MainClass {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:ApplicationContext.xml");

        RegisterService register = ctx.getBean("RegisterService", RegisterService.class);
        /* 회원가입 및 출력 */
        /* new <- 클래스를 실체화해서 오브젝트를 생성함.*/
        register.join(new RegisterVO.Builder().setUserId("test").setUserPw("test").setUserEmail("test@gmail.com").build());
        register.join(new RegisterVO.Builder().setUserId("test1").setUserPw("test1").setUserEmail("test1@gmail.com").build());
        register.join(new RegisterVO.Builder().setUserId("test2").setUserPw("test2").setUserEmail("test2@gmail.com").build());
//      이미 존재하는 아이디 체크(RegisterService -1 반환)
        register.join(new RegisterVO.Builder().setUserId("test").setUserPw("보안철저").setUserEmail("이메일은 중복상관X").build());

        /* 1.가입조건확인해 -> RegisterVo의 Builder메소드 ->  */

        register.print();

        ctx.close();
    }
}
