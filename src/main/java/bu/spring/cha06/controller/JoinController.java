package bu.spring.cha06.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bu.spring.cha06.validator.MemberValidator;

@Controller
@RequestMapping("/member/join.do")
public class JoinController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String form() {
		System.out.println("controller");
		return "member/joinform";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String join( Member member, 
						BindingResult errors) {
		
		new MemberValidator().validate(member, errors);
		if(errors.hasErrors()) {
			return "member/joinform";
		}
		
		return "member/joinresult";
	}
	 

}
