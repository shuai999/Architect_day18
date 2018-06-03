package cn.novate.architect_day18.simple1;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/3 11:04
 * Version 1.0
 * Params:
 * Description:    用户信息实体
*/

public class UserInfo {
    public String userName ;
    public String userPwd ;
    public String userId ;
    public String userSex ;

    public UserInfo(String userName, String userPwd, String userId, String userSex) {
        this.userName = userName;
        this.userPwd = userPwd;
        this.userId = userId;
        this.userSex = userSex;
    }



    @Override
    public String toString() {
        return "UserInfo{" +
                "userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userId='" + userId + '\'' +
                ", userSex='" + userSex + '\'' +
                '}';
    }
}
