import com.example.ebpfweb.Bean.User;
import com.example.ebpfweb.UserDao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static java.lang.System.out;

//@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String projectPath = getServletContext().getRealPath("/");
        out.println(projectPath);
        resp.setCharacterEncoding("UTF-8");
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        UserDao userDao =new UserDao();
        User user = userDao.login(username,password);
        out.println(projectPath);
        out.println("ok");
        out.println(user.getUsername());
        if (user.getUsername() == null){
            resp.getWriter().write("login failed");
        }else {
            resp.getWriter().write("login succeed");
        }
    }
}