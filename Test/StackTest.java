import MyStack.MyStack;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class StackTest{
    @Test
    public  void Testing_Empty_Value() throws Exception {
    MyStack stack = new MyStack();
      Assert.assertTrue(Stack.isEmpty());

    }
    @Test
    public void Pushing_Values() throws Exception {
        MyStack stack = new MyStack();
        Assert.assertTrue(Stack.push());
    }





}