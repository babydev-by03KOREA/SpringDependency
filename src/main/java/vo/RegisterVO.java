package vo;

public class RegisterVO {
    private String userId;
    private String userPw;
    private String userEmail;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

//  메소드의 오버로딩 (생성자의 선언) / 클래스의 생성자
//  규칙 1. 클래스이름() 2. 클래스이름(인수1, 인수2)
    RegisterVO(Builder builder) {
//      입력값으로 문자열을 필요로 하는 생성자
        userId = builder.userId;
        userPw = builder.userPw;
        userEmail = builder.userEmail;
//      객체를 리턴받아 할당함
    }

    public static class Builder {
        private String userId = "";
        private String userPw = "";
        private String userEmail = "";

        public Builder() {
            // Class와 같은 메소드명, Default 생성자
            // 입력값으로 문자열을 필요로 하는 생성자
            // MainClass.java를 보자. new 클래스명(입력인수)
        }

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder setUserPw(String userPw) {
            this.userPw = userPw;
            return this;
        }

        public Builder setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }

        public RegisterVO build() {
//      자바에서는 new 키워드를 사용하여 객체를 생성할 때 자동으로 생성자가 호출됨.
//      RegisterVO의 새로운 내용을 반환. 새 개체를 생성하는 의미.
            return new RegisterVO(this);
//      전체모아(this) RegisterVO에 새로운 메소드로 반환 MainClass형태
//      새로운 객체()에 다시 참조를 가져오고 return 키워드는 해당 참조를 가져와 현재 메소드에 반환함
        }
    }
}
