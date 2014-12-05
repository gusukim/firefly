package bu.spring.cha06.controller;

import java.io.File;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
 
import util.image.ThumbImage;

@Controller
@RequestMapping("/report.do")
public class UploadController {

	@RequestMapping(method=RequestMethod.GET)
	public String form() {
		return "report/reportform";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String uplaod( ReportCommand report) {
		
		System.out.println(report);
		
		List<MultipartFile> list = report.getReports();
		for(MultipartFile r : list) {
			if(!r.isEmpty()) {
				File file = new File("c:\\upload\\" + 
									r.getOriginalFilename());
				File thumb = new File("c:\\upload\\thumb\\th_" + 
									r.getOriginalFilename());
				try {
					r.transferTo(file);
					ThumbImage.makeThumb(100,100, file, thumb);
				} catch (Exception e) {	}			
			}
		} 
		return "report/complete";
	}
	

}
