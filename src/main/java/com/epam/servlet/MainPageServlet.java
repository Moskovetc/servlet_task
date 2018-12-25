package com.epam.servlet;

import com.epam.entity.Category;
import com.epam.entity.Shop;
import com.epam.utils.Generator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/index")
public class MainPageServlet extends HttpServlet {
    private static final Logger logger = LoggerFactory.getLogger(MainPageServlet.class);
    private static final String SHOP_NAME = "Shop";
    private static final String FIRST_CATEGORY_NAME = "SmartPhones";
    private static final int FIRST_CATEGORY_QUANTITY = 20;
    private static final String SECOND_CATEGORY_NAME = "HeadPhones";
    private static final int SECOND_CATEGORY_QUANTITY = 35;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.debug("Started doGet");
        if (request.getSession().getAttribute("firstName") == null) {
            response.sendRedirect("signin");
            logger.debug("doget sendRedirect to /signin");
        } else {
            logger.debug("doget forward to index.jsp");
            Shop shop = getShop(SHOP_NAME);
            request.setAttribute("categories", shop.getCategories());
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }

    private Shop getShop(String name){
        Shop shop = new Shop();
        shop.setName(name);
        shop.setCategories(getCategories(FIRST_CATEGORY_NAME, SECOND_CATEGORY_NAME));
        return shop;
    }

    private List<Category> getCategories(String firstName, String secondName) {
        List<Category> categories = new ArrayList<>();

        categories.add(getCategory(firstName, FIRST_CATEGORY_QUANTITY));
        categories.add(getCategory(secondName, SECOND_CATEGORY_QUANTITY));
        return categories;
    }

    private Category getCategory(String name, int quantity) {
        Category category = new Category();
        Generator generator = new Generator();
        category.setName(name);
        category.setProducts(generator.getProducts(quantity));
        return category;
    }

}
