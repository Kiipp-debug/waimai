package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;

public interface DishService {



    /**
     *
     *
     * 新增菜品和对应的口味
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);

    /**
     *
     * 批量删除菜品功能
     * @param ids
     */
    void deleteBatch(List<Long> ids);


    /**
     *
     * 菜品分页查询
     * @param dishPageQueryDTO
     * @return
     */
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);


    /**
     * 根据id来查询菜品
     * @param id
     * @return
     */
    DishVO getByIdWithFlavor(Long id);


    /**
     * 修改菜品
     * @param dishDTO
     */
    void updateWithFlavor(DishDTO dishDTO);
}

