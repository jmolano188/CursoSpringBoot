package com.FlyBoot.Core.controllers;

import com.FlyBoot.Core.models.Post;
import com.FlyBoot.Core.utilities.PagesUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/home")
public class BasicController {

    public List<Post> getPost(){
        List<Post> response = new ArrayList<>();
        response.add(new Post(1,"Post 1","descripcion 1"
                ,"https://w7.pngwing.com/pngs/869/719/png-transparent-sticky-note-post-it-note-document-post-it-note-miscellaneous-rectangle-grass-thumbnail.png"));
        response.add(new Post(2,"Post 2","descripcion 2"
                ,"https://w7.pngwing.com/pngs/869/719/png-transparent-sticky-note-post-it-note-document-post-it-note-miscellaneous-rectangle-grass-thumbnail.png"));
        response.add(new Post(3,"Post 3","descripcion 3"
                ,"https://w7.pngwing.com/pngs/869/719/png-transparent-sticky-note-post-it-note-document-post-it-note-miscellaneous-rectangle-grass-thumbnail.png"));
        response.add(new Post(4,"Post 4","descripcion 4"
                ,"https://w7.pngwing.com/pngs/869/719/png-transparent-sticky-note-post-it-note-document-post-it-note-miscellaneous-rectangle-grass-thumbnail.png"));
        return response;
    }
    @GetMapping("/post")
    public String getPost(Model model){
        model.addAttribute("posts", this.getPost());
        return "index";
    }
    @GetMapping("/public")
    public Object listPosts(){
        ModelAndView response = new ModelAndView(PagesUtil.HOME);
        response.addObject("posts", this.getPost());
        return response;
    }
    @GetMapping()
    public Object getPost(@RequestParam(defaultValue = "1", name = "id", required = false) int id){
        ModelAndView response = new ModelAndView(PagesUtil.POST);
        response.addObject("post", this.getPost().get(id));
        return response;
    }

}
