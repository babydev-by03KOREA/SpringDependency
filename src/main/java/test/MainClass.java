package test;

import Service.RegisterService;
import org.springframework.context.support.GenericXmlApplicationContext;
import vo.RegisterVO;

public class MainClass {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:ApplicationContext.xml");

        RegisterService register = ctx.getBean("RegisterService", RegisterService.class);
        /* 회원가입 및 출력 */
        register.join(new RegisterVO.Builder().setUserId("test").setUserPw("test").setUserEmail("test@gmail.com").build());
        register.join(new RegisterVO.Builder().setUserId("test1").setUserPw("test1").setUserEmail("test1@gmail.com").build());
        register.join(new RegisterVO.Builder().setUserId("test2").setUserPw("test2").setUserEmail("test2@gmail.com").build());

        /* 1.가입조건확인해 -> RegisterVo의 Builder메소드 ->  */

        register.print();

        ctx.close();
    }
}
