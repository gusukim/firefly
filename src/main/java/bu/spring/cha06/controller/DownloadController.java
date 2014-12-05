package bu.spring.cha06.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DownloadController {
	@RequestMapping("/file.do")
	public ModelAndView download(
		@RequestParam("fname") String fname){
		File file = new File("c:\\upload\\"+fname );
		
		return new ModelAndView("download", "downloadFile", file);
	}
}
