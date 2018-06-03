package cn.novate.architect_day18.simple1;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/3 11:10
 * Version 1.0
 * Params:
 * Description:    微信的用户系统 - 数组存储
*/

public class WXUserSystem {
    UserInfo[] userInfos ;

    public WXUserSystem(){
        userInfos = new UserInfo[3] ;
        userInfos[0] = new UserInfo("Novate","123456","001","男") ;
        userInfos[1] = new UserInfo("景甜","234567","002","女") ;
        userInfos[2] = new UserInfo("江疏影","345678","003","男") ;
    }

    public UserInfo[] getUserInfos() {
        return userInfos;
    }
}
