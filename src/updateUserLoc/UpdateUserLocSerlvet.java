package updateUserLoc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user/page_user/updateUserLoc.do")
public class UpdateUserLocSerlvet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String loc_id = request.getParameter("loc_id");
		String user_id = request.getParameter("user_id");
		String user_realname = request.getParameter("user_realname");
		String user_phonenum = request.getParameter("user_phonenum");
		String loc_province = request.getParameter("loc_province");
		String loc_city = request.getParameter("loc_city");
		String loc_area = request.getParameter("loc_area");
		String loc_detail = request.getParameter("loc_detail");
		String loc_default = request.getParameter("loc_default");
		
		

	}

}
