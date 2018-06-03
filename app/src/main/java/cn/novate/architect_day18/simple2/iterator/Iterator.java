package cn.novate.architect_day18.simple2.iterator;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/3 15:39
 * Version 1.0
 * Params:
 * Description:    迭代器的接口
*/

public interface Iterator<T> {

    /**
     * 判断是否有下一个元素
     */
    boolean hasNext() ;

    /**
     * 取出下一个元素
     */
    T next() ;
}
