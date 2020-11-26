package vn.k3k.pointlesschat.components.users;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/get")
    public ResponseEntity<?> getUserByName(@RequestParam(name="fullName") String fullName){
        Optional<User> result = userService.getUserByName(fullName);
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }

    @GetMapping("/**")
    public String getAllRequest(){
        logger.error("Someone's trying to access undefined endpoint");
        return null;
    }
}
