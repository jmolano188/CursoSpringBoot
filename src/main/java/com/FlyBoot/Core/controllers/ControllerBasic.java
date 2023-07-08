package com.FlyBoot.Core.controllers;

import com.FlyBoot.Core.models.Post;
import com.FlyBoot.Core.utilities.Pages;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/home")
public class ControllerBasic {
   public List<Post> getPost(){
        List<Post> post=new ArrayList<>();
        post.add(new Post(1,"titulo 1","imagen 1","http://localhost/imagen1",new Date()));
        post.add(new Post(2,"titulo 2","imagen 2","http://localhost/imagen2",new Date()));
        post.add(new Post(3,"titulo 3","imagen 3","http://localhost/imagen3",new Date()));
        post.add(new Post(4,"titulo 4","imagen 4","http://localhost/imagen4",new Date()));
        return post;
    }
    @GetMapping(path={"/post"})
    public String saludar(Model model){
       model.addAttribute("posts", this.getPost());
       return "index";

    }
    @GetMapping(path = "/public")
    public ModelAndView post(){
       ModelAndView modelAndView=new ModelAndView(Pages.Home);
       modelAndView.addObject("posts",this.getPost());
       return modelAndView;
    }
}
