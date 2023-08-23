package kr.ac.kopo.form;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {

	@GetMapping("/member/joinForm")
	public String joinForm() {
		return "/member/joinForm";
		// WEB-INF/jsp/member/joinForm .jsp
	}

	@PostMapping("member/join")
	public ModelAndView join6(@ModelAttribute("memberVO") MemberVO member) {
		ModelAndView mav = new ModelAndView("member/join");
		mav.addObject("member", member);
		// mav.setViewName("member/join");

		return mav;
	}

	// @PostMapping("member/join")
	public String join5(@ModelAttribute("member") MemberVO memberVO) {
		System.out.println(memberVO.getId() + ":" + memberVO.getPassword());
		return "/member/join";
	}

	// @PostMapping("member/join")
	public String join4(MemberVO memberVO) {
		System.out.println(memberVO.getId() + ":" + memberVO.getPassword());
		return "/member/join";
	}

	// @PostMapping("member/join")
	public String join3(HttpServletRequest request, String id, String password
	// @RequestParam 생략가능
	) {
//			String id = request.getParameter("id");
//			String password = request.getParameter("password");
		request.setAttribute(id, password);

		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPassword(password);
		request.setAttribute("member", member);
		return "/member/join";
	}

	// @PostMapping("member/join")
	public String join(HttpServletRequest request) {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		request.setAttribute(id, password);

		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPassword(password);
		request.setAttribute("member", member);
		return "/member/join";
	}

	// @PostMapping("member/join")
	public String join2(HttpServletRequest request, @RequestParam("id") String id2,
			@RequestParam("password") String password2
//			String id2 = request.getParameter("id");
//			String password2 = request.getParameter("password"); 이거와 같다

	) {
		MemberVO member = new MemberVO();
		member.setId(id2);
		member.setPassword(password2);
		request.setAttribute("member", member);
		return "/member/join";
	}

}
