package org.example;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.http.*;


public class HelloAppEngineServlet extends HttpServlet {

	private static final long serialVersionUID = 9003286677606959556L;
	
	private static final Logger logger = Logger.getLogger(HelloAppEngineServlet.class.getName());

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		
		logger.info("An informational message.");

		logger.warning("A warning message.");

		logger.severe("An error message.");
		
		resp.getWriter().println("Hello, world");
	}
}