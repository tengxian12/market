package servlet.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojo.User;
import util.Constants;
import service.user.UserService;
import service.user.UserServiceImpl;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet{
	//�����û�����������ҵ��㡢ת����ͼ
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO �Զ����ɵķ������
		
		System.out.println("���ڵ�½ ============ " );
		System.out.println("������" );
		System.out.println("����" );

		String userCode = req.getParameter("userCode");
		String userPassword = req.getParameter("userPassword");

		UserService userService = new UserServiceImpl();
		User user = userService.login(userCode,userPassword);
		if(null != user){
			System.out.println("��¼�ɹ� ============ " );

			req.getSession().setAttribute(Constants.USER_SESSION,user);
			//ҳ����ת��frame.jsp��
			resp.sendRedirect("jsp/frame.jsp");
		}else{
			System.out.println("��¼ʧ�� ============ " );

			req.setAttribute("error", "�û��������벻��ȷ");
			req.getRequestDispatcher("login.jsp").forward(req,resp);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO �Զ����ɵķ������
		doGet(req, resp);
	}
}
