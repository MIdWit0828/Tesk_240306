package com.ohgiraffers.tesk_240306.mvc.controller;

import com.ohgiraffers.tesk_240306.mvc.model.dto.MenuDTO;
import com.ohgiraffers.tesk_240306.mvc.model.service.MenuService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/menudb/delete")
public class DeleteMenuServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int menuCode = Integer.parseInt(req.getParameter("menuCode"));
        MenuService menuService = new MenuService();
        int result = menuService.deleteByCode(menuCode);

        if (result > 0) {
            resp.sendRedirect(req.getContextPath()+"/menudb/selectAll");
        } else {
            req.setAttribute("message","메뉴를 삭제 할 수 없습니다.");
            req.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(req,resp);
        }
    }
}
