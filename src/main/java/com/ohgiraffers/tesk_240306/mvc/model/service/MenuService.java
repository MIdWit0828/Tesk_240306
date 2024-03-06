package com.ohgiraffers.tesk_240306.mvc.model.service;

import com.ohgiraffers.tesk_240306.mvc.model.dao.MenuDAO;
import com.ohgiraffers.tesk_240306.mvc.model.dto.MenuDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.tesk_240306.mvc.common.Template.getSqlSession;

public class MenuService {
    MenuDAO mapper;

    public MenuDTO selectOneMenuById(int menuCode) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MenuDAO.class);

        MenuDTO menuDTO = mapper.selectOneMenuById(menuCode);
        System.out.println(menuDTO);

        if (menuDTO != null) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return menuDTO;
    }

    public List<MenuDTO> selectByPrice(int targetPrice) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MenuDAO.class);

        List<MenuDTO> menuDTOList = mapper.selectByPrice(targetPrice);

        if (menuDTOList != null && !menuDTOList.isEmpty()) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return menuDTOList;
    }

    public int insertMenu(MenuDTO newMenu) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MenuDAO.class);

        int result = mapper.insertMenu(newMenu);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result;
    }

    public List<MenuDTO> selectAll() {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MenuDAO.class);

        List<MenuDTO> menuDTOList = mapper.selectAll();

        if (menuDTOList != null && !menuDTOList.isEmpty()) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return menuDTOList;
    }

    public int updateByCode(MenuDTO menuDTO) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MenuDAO.class);

        int result = mapper.updateByCode(menuDTO);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result;
    }

    public int deleteByCode(int menuCode) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MenuDAO.class);

        int result = mapper.deleteByCode(menuCode);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result;

    }
}
