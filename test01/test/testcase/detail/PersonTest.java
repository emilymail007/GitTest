package testcase.detail;

import com.test.srcDemo.Person;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by user on 2017/6/20.
 */
public class PersonTest {
    @Test(testName = "返回0")
    public void EyeIsZero(){
        Assert.assertEquals(0,new Person().hasEyes(0));
        System.out.println("eyes is 0");
    }
    @Test(testName = "返回1")
    public void EyeIsOne(){
        Assert.assertEquals(1,new Person().hasEyes(1));
        System.out.println("eyes is 1");
    }
    @Test(testName = "返回2")
    public void EyesIsTwo(){
        Assert.assertEquals(2,new Person().hasEyes(2));
        System.out.println("eyes is 2");
    }
    @Test(testName = "返回3")
    public void EyesIsMore(){
        Assert.assertEquals(3,new Person().hasEyes(9));
        System.out.println("没有2只以上的眼睛");
    }
}
