package com.dsq.blog.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleVo {
    private Long id;
    /**
     * 标题
     */
    private String title;
    /**
     * 简介
     */
    private String summary;
    /**
     * 评论数量
     */
    private int commentCounts;
    /**
     * 浏览数量
     */
    private int viewCounts;
    /**
     * 置顶
     */
    private int weight;
    /**
     * 创建时间
     */
    private String createDate;
    /**
     * 头像
     */
    private String author;

    private ArticleBodyVo body;

    private List<TagVo> tags;

    private CategoryVo categorys;

}
