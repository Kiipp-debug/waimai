package com.sky.service;

import com.sky.dto.DishDTO;

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
}
