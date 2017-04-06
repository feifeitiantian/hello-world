/**
 * Created by chenbing1 on 2017/4/6.
 */

import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorldTest{

    @Test
    public void testSayHello(){

        HelloWorld helloworld=new HelloWorld();

        String result=helloworld.sayHello();

        Assert.assertEquals("Hello Maven",result);

    }

}