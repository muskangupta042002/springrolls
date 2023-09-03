package click.akshaygupta.springrolls;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;


@SpringBootTest
public class GreetingControllerTests {

    @Test
    public void testGreeting() {
        GreetingController controller = new GreetingController();
        Model model = new BindingAwareModelMap();
        String viewName = controller.greeting("Spring", model);
        Assertions.assertEquals("greeting", viewName);
        Assertions.assertEquals("Spring", model.asMap().get("name"));
    }
}

