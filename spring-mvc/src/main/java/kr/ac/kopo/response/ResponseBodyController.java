package kr.ac.kopo.response;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.ac.kopo.form.MemberVO;

@RestController
@Controller
public class ResponseBodyController {

//	1. url
//	2. bean 생성
//	3. @Responsebody 붙이기

	// member list return 하는 것 작성
	@ResponseBody
	@RequestMapping("/volistresponse")
	public List<MemberVO> response3() {
		MemberVO member = new MemberVO();
		member.setId("hong");
		member.setPassword("1111");

		MemberVO member2 = new MemberVO();
		member2.setId("hong2");
		member2.setPassword("2222");

		List<MemberVO> memberList = new ArrayList<MemberVO>();
		memberList.add(member);
		memberList.add(member2);

		return memberList;
	}

	@ResponseBody
	@RequestMapping("/voresponse")
	public MemberVO voresponse() { // memberVO return

		MemberVO member = new MemberVO();
		member.setId("hong");
		member.setPassword("1111");
		return member;
	}

	@ResponseBody
	@RequestMapping("/stringresponse")
	public String response() {
		return "ok. 성공";
	}
}
