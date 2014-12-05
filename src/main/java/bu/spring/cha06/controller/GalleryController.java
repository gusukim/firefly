package bu.spring.cha06.controller;

import java.io.File; 

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class GalleryController {
	
	@ModelAttribute("imageList")
	public String[] getImageList() {
		File file = new File("c:\\upload\\thumb");
		return file.list();	
	}
	
	@RequestMapping("/gallery.do")
	public String gallery() { 
		return "gallery";
	}
	
}
