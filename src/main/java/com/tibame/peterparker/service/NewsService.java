package com.tibame.peterparker.service;

import com.tibame.peterparker.dao.NewsRepository;
import com.tibame.peterparker.entity.News;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsService {

    @Autowired
    private NewsRepository newsRepository;

    public List<News> getAllNews() {
        return newsRepository.findAll();
    }

    public Optional<News> getNewsById(Long id) {
        return newsRepository.findById(id);
    }

    public News createNews(News news) {
        return newsRepository.save(news);
    }

    public void deleteNews(Long id) {
        newsRepository.deleteById(id);
    }

    public News updateNews(Long id, News updatedNews) {
        Optional<News> optionalNews = newsRepository.findById(id);
        if (optionalNews.isPresent()) {
            News existingNews = optionalNews.get();
            existingNews.setTitle(updatedNews.getTitle());
            existingNews.setContent(updatedNews.getContent());
            existingNews.setPublishDate(updatedNews.getPublishDate());
            existingNews.setAuthor(updatedNews.getAuthor());
            existingNews.setStatus(updatedNews.isStatus());
            return newsRepository.save(existingNews);
        } else {
            return null;
        }
    }
}
