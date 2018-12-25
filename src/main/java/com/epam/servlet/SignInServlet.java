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

@WebServlet("/signin")
public class SignInServlet extends HttpServlet {
    private static final Logger logger = LoggerFactory.getLogger(SignInServlet.class);
    private static final String LOGIN = "leonid";
    private static final String PASS = "leonid";

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        logger.debug("Started doGet");
        request.getRequestDispatcher("signin.jsp").forward(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        logger.debug("Started doPOST");
        request.setCharacterEncoding("UTF-8");
        String login = request.getParameter("login");
        String pass = request.getParameter("password");

        if (login.equals(LOGIN) && pass.equals(PASS)) {
//            setAttributes(request);
            HttpSession session = request.getSession(true);
            session.setAttribute("login", LOGIN);
            session.setAttribute("password", PASS);
            session.setAttribute("firstName", "Leonid");
            session.setAttribute("lastName", "Moskovets");
            response.sendRedirect ("index");
        }
    }

    private void setAttributes(HttpServletRequest request) {
        HttpSession session = request.getSession(true);
        session.setAttribute("login", LOGIN);
        session.setAttribute("password", PASS);
        session.setAttribute("firstName", "Leonid");
        session.setAttribute("lastName", "Moskovets");
    }
}
