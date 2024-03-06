package com.ohgiraffers.tesk_240306.mvc.controller;

import com.ohgiraffers.tesk_240306.mvc.model.dto.MenuDTO;
import com.ohgiraffers.tesk_240306.mvc.model.service.MenuService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/menudb/insert")
public class InsertMenuServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        MenuDTO newMenu = new MenuDTO();
        newMenu.setMenuName(req.getParameter("menuName"));
        newMenu.setMenuPrice(Integer.parseInt(req.getParameter("menuPrice")));
        newMenu.setCategoryCode(Integer.parseInt(req.getParameter("categoryCode")));
        newMenu.setOrderableStatus(req.getParameter("orderableStatus"));

        MenuService menuService = new MenuService();
        int result =  menuService.insertMenu(newMenu);

        if (result > 0) {
            resp.sendRedirect(req.getContextPath()+"/menudb/selectAll");
        } else {
            req.setAttribute("message","메뉴를 추가할 수 없습니다.");
            req.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(req,resp);
        }
    }
}
