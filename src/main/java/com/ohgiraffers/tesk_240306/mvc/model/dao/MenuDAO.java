package com.ohgiraffers.tesk_240306.mvc.model.dao;

import com.ohgiraffers.tesk_240306.mvc.model.dto.MenuDTO;

import java.util.List;

public interface MenuDAO {
    MenuDTO selectOneMenuById(int menuCode);

    List<MenuDTO> selectByPrice(int targetPrice);

    int insertMenu(MenuDTO newMenu);

    List<MenuDTO> selectAll();

    int updateByCode(MenuDTO menuDTO);

    int deleteByCode(int menuCode);
}
