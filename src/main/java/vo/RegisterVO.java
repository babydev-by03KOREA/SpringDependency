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

    RegisterVO(Builder builder) {
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
            // Class와 같은 메소드명
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
//          RegisterVO 객체를 리턴해주는 메소드
            return new RegisterVO(this);
        }
    }
}
