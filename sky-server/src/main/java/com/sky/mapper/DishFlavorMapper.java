package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DishFlavorMapper {


    /**
     *
     * 批量插入口味数据
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);



    @Delete("delete from dish_flavor where dish_id =#{dishId}")
    void deleteByDishId(Long id);


    /**
     * 根据菜品id集合批量删除对应的口味信息
     * @param dishIds
     */
    void deleteByDishIds(List<Long> dishIds);


    /**
     * 根据菜品id来查询对应的口味数据
     * @param dishId
     * @return
     */
    @Select("select * from dish_flavor where dish_id =#{dishId}")
    List<DishFlavor> getByDishId(Long dishId);
}
