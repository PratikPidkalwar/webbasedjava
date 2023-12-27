package day_10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import day_10.model.StudentProgress;
import day_10.model.TotalMarksCalculator;
import day_10.model.User;
import day_10.model.UserValidator;

@Controller
@SessionAttributes("progressReport")
public class SpringMvcController {

	@RequestMapping("/showLogin")
	public String getLoginPage()
	{
		return "login";
	}
	
	@RequestMapping(value="/doValidate",method = RequestMethod.POST)
	public String getResultPage(String uid,String pwd)
	{
		String resultPage="failure";
		User userModel=new User(uid, pwd);
		boolean success=UserValidator.isValid(userModel);
		if(success)
			resultPage="success";
		return resultPage;
	}
	
	@RequestMapping("/studentEntry")
	public String getStudentEntryPage()
	{
		return "studentEntry";
	}
	
	
	@RequestMapping(value = "/acceptStudent",method = RequestMethod.POST)
	public String processStudentInfo(String studentName,int phy,int chem,int maths,Model dataModel)
	{
		int totalMarks=TotalMarksCalculator.getTotalMArks(phy, chem, maths);
		StudentProgress studentProgress=new StudentProgress(studentName, totalMarks);
		
		dataModel.addAttribute("progressReport",studentProgress);
		dataModel.addAttribute("message","Thank You!!");
		
		
		return "studentProgress";
		
	}
}
