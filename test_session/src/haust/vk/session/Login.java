package haust.vk.session;

import java.io.IOException;

import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html;utf-8");
		String name=req.getParameter("user");
		String pass=req.getParameter("password");
		//System.out.println(name+pass);//����
		
		/*��������������м��������ʹ��
		 * context���ص㣬���õ��и��ǵķ��գ����ڷ������ˡ�
		 * request����������ת�����������ݵ�½��Ϣ�����ԣ�
		 * session��
		 */
		if("eric".equals(name)&&"123456".equals(pass)){
			/*req.setAttribute("Loginname", name);
			
			req.getRequestDispatcher("/Index").forward(req, resp);//ת������
*/			
			//resp.sendRedirect(req.getContextPath()+"/Index");  �ض��򴫲���ȥ
			
			HttpSession session=req.getSession();
			session.setAttribute("name", name);
			resp.sendRedirect(req.getContextPath()+"/Index");
			
			System.out.println(req.getContextPath());
		}else{
			resp.sendRedirect(req.getContextPath()+"/Fail.html");
		}
		
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}
