/**
 * 
 */
package edu.mum.farmer.app.controller;

import java.io.File;
import java.security.Principal;

import javax.servlet.ServletContext;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.mum.farmer.app.domain.Member;
import edu.mum.farmer.app.service.MemberService;


/**
 * @author santosh dahal
 *
 */
@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;
	@Autowired
	ServletContext servletContext;


	@RequestMapping(value = { "/memberform" }, method = RequestMethod.GET)
	public String showForm(@ModelAttribute("member") Member member, Model model, Principal user) {
		model.addAttribute("user",user);
		return "member";
	}

	@RequestMapping(value = { "/memberform" }, method = RequestMethod.POST)
	public String saveUser(@Valid @ModelAttribute("member") Member member, BindingResult result, RedirectAttributes rAttributes) {
		
		
		if (result.hasErrors()) {

			return "member";
		}
		
/*MultipartFile userImage = user.getImage();
 		String rootDirectory = servletContext.getRealPath("/");
 			
		//isEmpty means file exists BUT NO Content
			if (userImage!=null && !userImage.isEmpty()) {
		       try {
		    	   
		      	userImage.transferTo(new File(rootDirectory+"\\resources\\"+user.getFirstName() + ".jpg"));
		       } catch (Exception e) {
		    	   System.out.println(e);
				throw new RuntimeException(" Image saving failed", e);
		   }
		   }*/

	   memberService.save(member);
		
		rAttributes.addFlashAttribute("member", member);
		return "redirect:success";

		
	}

	@RequestMapping(value = { "/success" }, method = RequestMethod.GET)
	public String showSecondForm() {
		return "membersaved";
	}

}
