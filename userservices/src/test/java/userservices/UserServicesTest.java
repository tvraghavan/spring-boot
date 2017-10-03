package userservices;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import userservices.configuration.Application;
import userservices.model.User;
import userservices.services.UserController;
//import static org.assertj.core.api.Assertions.assert;


@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class,webEnvironment = WebEnvironment.RANDOM_PORT)
@Import(Application.class)
public class UserServicesTest {
   
    @Autowired
    UserController controller;
    
    @Test
    public void getUserByIdTet() {
        User matchedUser = controller.getUser("admin");
        Assert.assertEquals("admin",matchedUser.getUserId());
    }
}
