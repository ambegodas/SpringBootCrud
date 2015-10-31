package crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import crud.domain.PostRepository;

@Controller
@RequestMapping("/posts")
public class PostController {
	
	@Autowired
	private PostRepository repository;
	
	@RequestMapping(value="",method=RequestMethod.GET)
	public String listPosts(Model model){
		model.addAttribute("posts",repository.findAll());
		return "posts/list";
	}
}
