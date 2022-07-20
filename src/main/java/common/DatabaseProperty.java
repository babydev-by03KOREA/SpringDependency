package common;

/* DatabaseProperty를 생성할 때 Setter 메소드를 이용할 때는 property 속성을 이용합니다.*/

public class DatabaseProperty {
    private String JdbcUrl;
    private String UserId;
    private String UserPw;

    public String getJdbcUrl() {
        return JdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        JdbcUrl = jdbcUrl;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getUserPw() {
        return UserPw;
    }

    public void setUserPw(String userPw) {
        UserPw = userPw;
    }
}
