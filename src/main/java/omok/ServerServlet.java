package omok;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

@WebServlet("/TestServerServlet")
public class ServerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	//private List<Session> ss = Websocket.sessionUsers;  ////////////////////
	
	Websocket wsocket = null;
    public ServerServlet() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
		Thread t = new Thread();
		// Thread 생성 후 소켓 연결 시작
		t.run();
		//System.out.println(ss);             ////////////////////////////
	}

	public void destroy() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
