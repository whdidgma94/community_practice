package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Member.MemberDAO;
import Member.MemberVO;



public class MemberJoinController implements Controller{

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		if(request.getParameter("id")==null) {
			return "memberJoin";
		}
		
		request.setCharacterEncoding("utf-8");
		MemberVO m = new MemberVO();
		m.setId(request.getParameter("id"));
		m.setPw(request.getParameter("pw"));
		m.setName(request.getParameter("name"));
		m.setAge(Integer.parseInt(request.getParameter("age")));
		m.setEmail(request.getParameter("email"));
		m.setPhone(request.getParameter("phone"));
		m.setGender(request.getParameter("gender"));
		int check = MemberDAO.getInstance().addMemberVO(m);
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter();
		String ctx = request.getContextPath();		
		if(check>0) {
			writer.println("<script>alert('회원가입 성공');</script>");
			writer.flush();			
			return "redirect:"+ctx+"/memberLogin.do";
		}else {
			writer.println("<script>alert('회원가입 실패');</script>");
			writer.flush();
			return "redirect:"+ctx+"/memberJoin.do";
		}		
	}

}
