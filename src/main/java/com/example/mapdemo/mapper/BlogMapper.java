// BlogMapper.java
package com.example.mapdemo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.mapdemo.entity.BlogPost;

@Mapper 
public interface BlogMapper {
    List<BlogPost> findAll();
    void insert(BlogPost post);
    void deleteById(int id);
}
