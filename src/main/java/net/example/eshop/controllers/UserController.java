package net.example.eshop.controllers;


import net.example.eshop.dto.UserDTO;
import net.example.eshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/new")
    public String newUser(Model model){
        model.addAttribute("user", new UserDTO());
        return "user";
    }

    @PostMapping("/new")
    public String saveUser(Model model, UserDTO userDTO){
        if(userService.save(userDTO)){
            return "redirect:/";
        }else {
            model.addAttribute("user", userDTO);
            return "user";
        }

    }
}
