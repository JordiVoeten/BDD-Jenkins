import org.example.User;
import org.example.UserService;
import org.junit.Assert;
import org.junit.Test;

public class userTest {

    private UserService userService;

    public userTest() {
        userService = new UserService();
    }

    @Test
    public void createSimpleUser() {
        User user = new User("TestUser", 20);
        userService.create(user);
        Assert.assertEquals(userService.getUsers().size(), 1);
    }
}
