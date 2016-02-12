package helloWorld;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class ServletHello extends HttpServlet
{
	@Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		try {
			response.sendError(589, "Hello World!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
