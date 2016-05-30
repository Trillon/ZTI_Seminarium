package proj2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class Controller {

    @RequestMapping("/user")
    public String getUser(Principal principal) {
        return principal.getName();
    }

    @RequestMapping("/admin")
    public String getAdmin(Principal principal) {
        return principal.getName();
    }
}
