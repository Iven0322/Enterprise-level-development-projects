package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DishFlavorMapper {
    void insertBatch(List<DishFlavor> dishFlavors);

    @Delete("delete from dish_flavor where dis_id = #{dishId}")
    void deleteDishId(Long dishId);
}
