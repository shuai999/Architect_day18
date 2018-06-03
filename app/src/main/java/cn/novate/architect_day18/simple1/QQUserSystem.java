package cn.novate.architect_day18.simple1;

import java.util.ArrayList;
import java.util.List;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/3 11:09
 * Version 1.0
 * Params:
 * Description:    QQ用户系统 - list集合存储
*/

public class QQUserSystem {
    private List<UserInfo> userInfos ;

    public QQUserSystem(){
        userInfos = new ArrayList<>() ;
        userInfos.add(new UserInfo("Novate","123456","001","男")) ;
        userInfos.add(new UserInfo("王子文","234567","002","女")) ;
        userInfos.add(new UserInfo("世道无情","345678","003","男")) ;
    }

    public List<UserInfo> getUserInfos(){
        return userInfos ;
    }
}
