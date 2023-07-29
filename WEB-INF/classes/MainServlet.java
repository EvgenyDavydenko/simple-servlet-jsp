import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/hello")
public class MainServlet extends HttpServlet {

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       HttpSession session = req.getSession();
       Integer visitCounter = (Integer) session.getAttribute("visitCounter");
       if (visitCounter == null) {
           visitCounter = 1;
       } else {
           visitCounter++;
       }
       session.setAttribute("visitCounter", visitCounter);
       String username = req.getParameter("username");
       resp.setContentType("text/html;charset=UTF-8");
       PrintWriter printWriter = resp.getWriter();
       if (username == "") {
           printWriter.write("Hello, Гость" + "<br>");
       } else {
           printWriter.write("Hello, " + username + "<br>");
       }
       printWriter.write("Page was visited " + visitCounter + " times.");
       printWriter.close();
   }
}