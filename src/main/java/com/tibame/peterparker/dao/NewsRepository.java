package com.tibame.peterparker.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tibame.peterparker.entity.News;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
    // 可以添加自定義查詢方法，例如按標題查詢等
}
