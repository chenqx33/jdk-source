package online.limingming.jdk.jdk1;

import org.junit.Test;

/**
 * Created by luxin on 2018/7/19.
 */
public class ObjectTest {

    @Test

    /**
     * https://www.cnblogs.com/wsw-bk/p/8026266.html
     * https://blog.csdn.net/xiaokang123456kao/article/details/72859765
     */
    public void getClassTest() {

        ObjectTest object1 = new ObjectTest();
        Class<? extends ObjectTest> aClass = object1.getClass();

        System.out.println(aClass.getName());

    }


}
