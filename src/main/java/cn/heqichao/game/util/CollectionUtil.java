package cn.heqichao.game.util;

import java.util.Collection;

/**
 * CollectionUtil
 * @author heqichao
 * @date 2019-3-13
 */
public class CollectionUtil {

    public static boolean isEmpty(Collection collection){
        if(collection == null || collection.isEmpty()){
            return true;
        }
        return false;
    }

}
