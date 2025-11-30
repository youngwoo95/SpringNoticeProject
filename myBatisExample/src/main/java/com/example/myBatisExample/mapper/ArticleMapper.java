package com.example.myBatisExample.mapper;

import com.example.myBatisExample.model.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ArticleMapper {

    @Select("SELECT * FROM article")
    List<Article> selectAll();

    @Select("SELECT * FROM article WHERE id = #{id}")
    Article selectById(@Param("id") Long id);
}
