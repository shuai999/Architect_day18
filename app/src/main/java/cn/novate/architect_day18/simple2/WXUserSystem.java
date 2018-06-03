package cn.novate.architect_day18.simple2;

import cn.novate.architect_day18.simple2.iterator.Iterator;
import cn.novate.architect_day18.simple2.iterator.WXIterator;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/3 11:10
 * Version 1.0
 * Params:
 * Description:    微信的用户系统 - 数组存储 - 不需要暴露数组，直接暴露一个迭代器iterator()方法给外部即可
*/

public class WXUserSystem implements Aggregate<UserInfo>{
    UserInfo[] userInfos ;

    public WXUserSystem(){
        userInfos = new UserInfo[3] ;
        userInfos[0] = new UserInfo("Novate","123456","001","男") ;
        userInfos[1] = new UserInfo("景甜","234567","002","女") ;
        userInfos[2] = new UserInfo("江疏影","345678","003","男") ;
    }

    /*public UserInfo[] getUserInfos() {
        return userInfos;
    }*/


    /**
     * 这里只需要暴露一个迭代器给外部就ok
     */
    @Override
    public Iterator<UserInfo> iterator() {
        return new WXIterator(userInfos);
    }
}
