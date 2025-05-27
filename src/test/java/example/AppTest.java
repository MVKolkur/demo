package example;
import org.example.App;
import org.junit.Test;
import org.junit.Assert;
public class AppTest {
    public void testApp(){
        App a=new App();
        int res=a.add(2,3);
        System.out.println("running test"+res);
        Assert.assertEquals(5,res);
    }

}
