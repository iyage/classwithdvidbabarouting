package com.example.class2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private  Serviceimpl serviceimpl;
  @GetMapping("/")
    public String homePAge(Model model){
      List<User> users = serviceimpl.findAllUser();
      model.addAttribute("users",users);
  return  "page1";
  }
  @GetMapping("/delete/{id}")
    public  String deleteUser(@PathVariable(value = "id")int id){
      serviceimpl.deleteUser(id);

  return "redirect:/";
  }

  @GetMapping("/viewUser/{id}")
  public String viewUser(@PathVariable(value = "id")int id, Model model){
   User user = serviceimpl.viewUser(id);
    model.addAttribute("user", user);
    return "page2";
  }
}
