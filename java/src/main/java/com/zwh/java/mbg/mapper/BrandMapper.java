package com.zwh.java.mbg.mapper;

import com.zwh.java.mbg.model.Brand;

public interface BrandMapper {
    Brand select(Integer id);
    void delete(Integer id);
    void update(Integer id);
}
