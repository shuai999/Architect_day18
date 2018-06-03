package cn.novate.architect_day18.simple1;

import java.util.List;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/3 11:23
 * Version 1.0
 * Params:
 * Description:    一般写法 - 没有采用设计模式之前
*/

public class Client {
    public static void main(String[] args){
        // 根据用户名和密码查询用户信息 ，
        // 如果没有查询到，那么代表登录失败；如果查询到了，代表登录成功
        UserInfo loginUserInfo = queryWXUserInfo("王子文" , "234") ;


        // 如果 loginUserInfo为null，就从QQ系统中查询用户信息
        if (loginUserInfo == null){
            loginUserInfo = queryQQUserInfo("王子文" , "234") ;
        }


        // 现在我只是接入了2个系统，以后我可能需要接入更多的系统，那么如果还是这样写的话，就会产生代码冗余，产生很多重复的代码，
        // 所以这种写法肯定是不可取的，那么接下来我们就来看下采用设计模式是如何写的？


        // 继续判断，如果这个时候 loginUserInfo还是null，表示登录失败，用户名和密码错误
        if (loginUserInfo == null){

        }
    }


    /**
     * 从QQ中查询用户信息
     */
    private static UserInfo queryQQUserInfo(String userName, String userPwd) {
        QQUserSystem qqUserSystem = new QQUserSystem() ;
        List<UserInfo> userInfos = qqUserSystem.getUserInfos();
        for (UserInfo userInfo : userInfos) {
            if (userInfo.userName.equals(userName) && userInfo.userPwd.equals(userPwd)){
                return userInfo ;
            }
        }
        return null;
    }


    /**
     * 从微信中查询用户信息
     */
    private static UserInfo queryWXUserInfo(String userName, String userPwd) {
        WXUserSystem wxUserSystem = new WXUserSystem() ;
        UserInfo[] userInfos = wxUserSystem.getUserInfos();
        for (UserInfo userInfo : userInfos) {
            if (userInfo.userName.equals(userName) && userInfo.userPwd.equals(userPwd)){
                return userInfo ;
            }
        }
        return null;
    }

}
