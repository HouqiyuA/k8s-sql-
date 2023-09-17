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
public class FindServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {;
        String id=req.getParameter("id");
        out.println(id);
        UserDao userDao =new UserDao();
        User user = userDao.find(id);
        out.println("user"+user);
        if (user.getId() == 0){
            resp.getWriter().write("no User");
        }else{
            resp.getWriter().write(user.getUsername());
        }

    }
}