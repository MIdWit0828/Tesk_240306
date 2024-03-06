package com.ohgiraffers.tesk_240306.mvc.controller;

import com.ohgiraffers.tesk_240306.mvc.model.dto.MenuDTO;
import com.ohgiraffers.tesk_240306.mvc.model.service.MenuService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/menudb/selectPrice")
public class SelectByPriceServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int targetPrice = Integer.parseInt(req.getParameter("price"));
        MenuService menuService = new MenuService();
        List<MenuDTO> menuDTOList = menuService.selectByPrice(targetPrice);

        String path = "";
        if (menuDTOList != null && !menuDTOList.isEmpty()) {
            path = "/WEB-INF/views/menudb/showMenuInfo.jsp";
            req.setAttribute("menuList", menuDTOList);
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            req.setAttribute("message","메뉴 정보를 조회할 수 없습니다.");
        }

        req.getRequestDispatcher(path).forward(req,resp);
    }
}
