//package ru.kata.spring.boot_security.demo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import ru.kata.spring.boot_security.demo.model.User;
//import ru.kata.spring.boot_security.demo.service.UserServiceImpl;
//
//import javax.validation.Valid;
//
//public class RegistrationController {
//    @Autowired
//    private UserServiceImpl userService;
//
//    @GetMapping("/registration")
//    public String registration(Model model) {
//        model.addAttribute("userForm", new User());
//
//        return "registration";
//    }
//
//    @PostMapping("/registration")
//    public String addUser(@ModelAttribute("userForm") @Valid User userForm, BindingResult bindingResult, Model model) {
//
//        if (bindingResult.hasErrors()) {
//            return "registration";
//        }
////        if (!userForm.getPassword().equals(userForm.getPasswordConfirm())){
////            model.addAttribute("passwordError", "Пароли не совпадают");
////            return "registration";
////        }
//        if (!userService.saveUser(userForm)){
//            model.addAttribute("usernameError", "Пользователь с таким именем уже существует");
//            return "registration";
//        }
//
//        return "redirect:/";
//    }
//}