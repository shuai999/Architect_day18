package cn.novate.architect_day18.simple2;

import cn.novate.architect_day18.simple2.iterator.Iterator;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/3 15:45
 * Version 1.0
 * Params:
 * Description:    容器的接口
*/

public interface Aggregate<T> {
    Iterator<T> iterator() ;
}
