package junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import junit.trade.UserValidator;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/*
 * JUnit - Parameter test sample
 */
@SuppressWarnings("rawtypes")
@RunWith(Parameterized.class)
public class JunitParameter {

    private String  user;
    private String  pw;
    private boolean expected;

    @Parameters
    public static Collection parameter() {
        return Arrays.asList(new Object[][] { { "user01", "123456", true },//<br>
                { "helloworld", "123456", false },//<br>
                { "david", "re*ads", false },//<br> 
                { "goodone", "onegood", true } });
    }

    public JunitParameter(String user, String pw, boolean expected) {
        this.user = user;
        this.pw = pw;
        this.expected = expected;
    }

    @Test
    public void testUserValidate() {
        assertEquals(expected, UserValidator.validate(user, pw));
    }
}
