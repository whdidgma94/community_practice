package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Member.MemberDAO;
import Member.MemberVO;


@WebServlet("/memberJoin.do")
public class MemberJoinController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberVO m = new MemberVO();
		m.setId((String)request.getAttribute("id"));
		m.setPw((String)request.getAttribute("pw"));
		m.setName((String)request.getAttribute("name"));
		m.setAge((int)request.getAttribute("age"));
		m.setEmail((String)request.getAttribute("email"));
		m.setPhone((String)request.getAttribute("phone"));
		m.setGender((String)request.getAttribute("gender"));
		MemberDAO.getInstance().addMemberVO(m);
	}

}
