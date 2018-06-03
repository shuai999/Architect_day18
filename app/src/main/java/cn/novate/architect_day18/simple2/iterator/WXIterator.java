package cn.novate.architect_day18.simple2.iterator;

import cn.novate.architect_day18.simple2.UserInfo;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/3 15:40
 * Version 1.0
 * Params:
 * Description:    微信具体的迭代器
*/

public class WXIterator implements Iterator {

    UserInfo[] userInfos ;
    int index = 0;


    public WXIterator(UserInfo[] userInfos){
        this.userInfos = userInfos ;
    }
    @Override
    public boolean hasNext() {
        return index < userInfos.length ;
    }

    @Override
    public Object next() {
        return userInfos[index++];
    }
}
