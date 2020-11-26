package vn.k3k.pointlesschat.components.users;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public boolean signUpUser(User toSignUp){
        return false;
    }

    public Optional<User> getUserByName(String toSearchFor){
        Optional<User> result = null;
        return result;
    }
}
