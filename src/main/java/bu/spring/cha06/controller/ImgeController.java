package bu.spring.cha06.controller;

import java.io.File;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ImgeController {
	@RequestMapping("/image.do")
	public ModelAndView viewImage(
		@RequestParam("fname") String fname){
		File file = new File("c:\\upload\\"+fname);
		Logger logger = Logger.getLogger(ImgeController.class);
		
		logger.debug("파일 : " + file);
		return new ModelAndView("imageview", "imageFile", file);
	}
}
