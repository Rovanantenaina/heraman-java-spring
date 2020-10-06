package mg.rzf.herman.metier;

import org.junit.Assert;
import org.junit.Test;

public class MyServicesTest {
    private MyServices  myServices = new MyServices();

    @Test
    public void shouldGreetedUser (){
        String texteGreeting = this.myServices.greeting("Herman");
        Assert.assertEquals("Bonjour Herman", texteGreeting);
    }
}
