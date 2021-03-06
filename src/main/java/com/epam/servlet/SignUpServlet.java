package com.epam.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {
    private static final Logger logger = LoggerFactory.getLogger(SignUpServlet.class);
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        logger.debug("Started doGet");
        request.getRequestDispatcher("signup.jsp").forward(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
        String login = request.getParameter("login");
        String pass = request.getParameter("password");
        setAttributes(request, response, firstName, lastName, login, pass);
    }

    private void setAttributes(HttpServletRequest request, HttpServletResponse response,
                               String firstName, String lastName, String login,
                               String pass) throws IOException {
        HttpSession session = request.getSession(true);
        session.setAttribute("login", login);
        session.setAttribute("password", pass);
        session.setAttribute("firstName", firstName);
        session.setAttribute("lastName", lastName);
        response.sendRedirect("index");
    }
}
