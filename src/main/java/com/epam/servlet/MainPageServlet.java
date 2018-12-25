package com.epam.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/index")
public class MainPageServlet extends HttpServlet {
    private static final Logger logger = LoggerFactory.getLogger(MainPageServlet.class);

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.debug("Started doGet");
        if (request.getSession().getAttribute("firstName") == null) {
            response.sendRedirect("signin");
            logger.debug("doget sendRedirect to /signin");
        } else {
            logger.debug("doget forward to index.jsp");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}
