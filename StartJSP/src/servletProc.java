

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servletProc")
public class servletProc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet은 tomcat에서 한번만 인코딩 문장 써주면 된다.
		//이클립스에서 server.xml 수정하거나, tomcat 폴더의 server.xml 을 수정하면 더 이상 수정할 필요 없다.
		
		//		System.out.println("doGet");
		doPost(request, response); //doPost를 부르면 중복되는 코드를 쓰지 않아도 된다.
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doPost는 항상 맨 위에 인코딩 문장을 써줘야 한다.
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8"); //request와 response 둘다 인코딩 설정 해줘야함
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String hobby[] = request.getParameterValues("hobby");
		String major[] = request.getParameterValues("major");
		String protocol = request.getParameter("protocol");
		
		PrintWriter out = response.getWriter(); //사용자의 웹브라우저에 출력
		out.println("<html><head><title>서블릿 연습</title></head>");
		out.println("<body>");
		out.println("이름 : " + name + "<br>");
		out.println("아이디 : " + id + "<br>");
		out.println("비밀번호 : " + pw + "<br>");
		out.println("취미 : " + Arrays.toString(hobby) + "<br>");
		out.println("과목 : " + major + "<br>");
		out.println("프로토콜 : " + protocol + "<br>");
		out.println("</body>");
		out.println("</html>");
	}

}
