package com.cory.starter.service;

import com.cory.starter.integration.mysql.entity.Content;
import com.cory.starter.integration.mysql.repository.ContentRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class DayTwoService {

    @Autowired
    private ContentRepository contentRepository;

    public String getContent() {

        Content content = new Content("cory will get a girlfriend soon");

        contentRepository.save(content);

        return "sedsd sdrdsdsdssdfsd dsrtssd";
    }
}
