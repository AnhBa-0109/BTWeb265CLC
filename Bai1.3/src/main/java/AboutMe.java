

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/AboutMe")
public class AboutMe extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        
        PrintWriter out = response.getWriter();
        
        //css
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Thông tin cá nhân</title>");
        out.println("<style>");
        out.println("body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background-color: #e0f7fa; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }");
        out.println(".card { background: white; width: 350px; padding: 40px; border-radius: 20px; box-shadow: 0 10px 25px rgba(0,0,0,0.1); text-align: center; }");
        out.println(".avatar { width: 120px; height: 120px; margin-bottom: 20px; border-radius: 50%; object-fit: cover; border: 4px solid #00acc1; }");
        out.println("h2 { color: #333; margin: 0; font-size: 24px; }");
        out.println(".sub-title { color: #00acc1; font-weight: bold; margin-top: 5px; text-transform: uppercase; font-size: 14px; letter-spacing: 1px; }");
        out.println(".info-list { text-align: left; margin-top: 30px; list-style: none; padding: 0; color: #555; }");
        out.println(".info-list li { margin-bottom: 12px; border-bottom: 1px solid #eee; padding-bottom: 8px; }");
        out.println(".info-list b { color: #333; display: inline-block; width: 80px; }");
        out.println("</style>");
        out.println("</head>");
        
        out.println("<body>");
        
        out.println("<div class='card'>");     
        out.println("<img src='avt.jpg' class='avatar' alt='Avatar'>");        
        out.println("<h2>Nguyễn Quốc Khánh</h2>");
        out.println("<div class='sub-title'>Sinh viên Trường Đại học Nha Trang</div>");        
        out.println("<ul class='info-list'>");
        out.println("<li><b>Lớp:</b> 65.CNTT-CLC</li>");
        out.println("<li><b>MSSV:</b> 65131467</li>");
        out.println("<li><b>Email:</b> khanh.nquo.65cntt@ntu.edu.vn</li>");
        out.println("<li><b>Sở thích:</b> Nghe nhạc, Ăn uống, Xem phim, Chơi mô hình</li>");
        out.println("</ul>");       
        out.println("</div>");  
        
        out.println("</body>");
        out.println("</html>");
    }
}
