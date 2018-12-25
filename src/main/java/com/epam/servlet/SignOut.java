package com.epam.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/signout")
public class SignOut extends HttpServlet {
    private static final Logger logger = LoggerFactory.getLogger(SignOut.class);
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        logger.debug("Started doGet");
        request.getSession().invalidate();
        response.sendRedirect("signin");
    }
}
