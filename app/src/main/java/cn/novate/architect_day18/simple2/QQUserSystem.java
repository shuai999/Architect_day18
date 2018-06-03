package cn.novate.architect_day18.simple2;

import java.util.ArrayList;
import java.util.List;

import cn.novate.architect_day18.simple2.iterator.Iterator;
import cn.novate.architect_day18.simple2.iterator.QQIterator;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/3 11:09
 * Version 1.0
 * Params:
 * Description:    QQ用户系统 - list集合存储 - 不需要暴露list集合，直接暴露一个迭代器iterator()方法给外部即可
*/

public class QQUserSystem implements Aggregate<UserInfo>{
    private List<UserInfo> userInfos ;

    public QQUserSystem(){
        userInfos = new ArrayList<>() ;
        userInfos.add(new UserInfo("Novate","123456","001","男")) ;
        userInfos.add(new UserInfo("王子文","234567","002","女")) ;
        userInfos.add(new UserInfo("世道无情","345678","003","男")) ;
    }


    /**
     * 这里就不需要把list集合 暴露出去，只需要暴露一个迭代器就ok
     */
    /*public List<UserInfo> getUserInfos(){
        return userInfos ;
    }*/


    /**
     * 这里只需要暴露一个迭代器给外部就ok
     */
    @Override
    public Iterator<UserInfo> iterator() {
        return new QQIterator(userInfos);
    }
}
