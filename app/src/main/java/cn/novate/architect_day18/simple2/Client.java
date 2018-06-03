package cn.novate.architect_day18.simple2;

import java.util.List;

import cn.novate.architect_day18.simple2.iterator.Iterator;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/3 11:23
 * Version 1.0
 * Params:
 * Description:    迭代器设计模式写法
*/

public class Client {
    public static void main(String[] args){
        // 根据用户名和密码查询用户信息 ，
        // 如果没有查询到，那么代表登录失败；如果查询到了，代表登录成功

        QQUserSystem qqUserSystem = new QQUserSystem() ;
        WXUserSystem wxUserSystem = new WXUserSystem() ;

        // 两个系统统一放到一个地方
        UserInfo loginUserInfo = queryUserInfo("Novate" , "123" , qqUserSystem.iterator()) ;

        if (loginUserInfo == null){
            // 如果qq系统中的用户信息为null，就从微信系统中查询用户信息
            loginUserInfo = queryUserInfo("Novate" , "123" , wxUserSystem.iterator()) ;
        }

        if (loginUserInfo == null){
            // 用户名或者密码错误
        }
    }


    /**
     * 查询用户信息
     */
    private static UserInfo queryUserInfo(String userName, String userPwd, Iterator<UserInfo> iterator) {
        while (iterator.hasNext()){
            UserInfo userInfo = iterator.next();
            if (userInfo.userName.equals(userName) && userInfo.userPwd.equals(userPwd)){
                return userInfo ;
            }
        }
        return null;
    }


}
