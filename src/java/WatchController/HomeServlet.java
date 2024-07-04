package WatchController;

import Watch.WatchDAO;
import Watch.WatchDTO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HomeServlet", urlPatterns = {"/HomeServlet"})
public class HomeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        WatchDAO watchDAO = new WatchDAO();
        List<WatchDTO> watches = watchDAO.getAllWatches();
        
        request.setAttribute("watches", watches);
        request.getRequestDispatcher("homepage.jsp").forward(request, response);
    }
}
