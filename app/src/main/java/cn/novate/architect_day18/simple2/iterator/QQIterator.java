package cn.novate.architect_day18.simple2.iterator;

import java.util.List;

import cn.novate.architect_day18.simple2.UserInfo;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/3 15:40
 * Version 1.0
 * Params:
 * Description:    QQ具体的迭代器
*/

public class QQIterator implements Iterator {

    List<UserInfo> userInfos ;
    int index = 0;


    public QQIterator(List<UserInfo> userInfos){
        this.userInfos = userInfos ;
    }
    @Override
    public boolean hasNext() {
        return index < userInfos.size() ;
    }

    @Override
    public Object next() {
        return userInfos.get(index++);
    }
}
