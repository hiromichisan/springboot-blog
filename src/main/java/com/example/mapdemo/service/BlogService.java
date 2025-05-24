package com.example.mapdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.mapdemo.entity.BlogPost;
import com.example.mapdemo.mapper.BlogMapper;

@Service
public class BlogService {
    @Autowired
    private BlogMapper blogMapper;

    public List<BlogPost> findAll() {
        return blogMapper.findAll();
    }

    public void save(BlogPost post) {
        blogMapper.insert(post);
    }

    public void delete(int id) {
        blogMapper.deleteById(id);
    }
}

