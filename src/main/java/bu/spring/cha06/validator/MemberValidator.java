package bu.spring.cha06.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
 
import bu.spring.cha06.controller.Member;

public class MemberValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Member.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Member member = (Member) target;
		
		if(member.getUserid() == null || member.getUserid().trim().isEmpty())
			errors.rejectValue("userid", "userid.required");
		
		if(member.getPassword() == null || member.getPassword().trim().isEmpty())
			errors.rejectValue("password", "password.required");
		

	}

}
