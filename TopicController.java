package com.db.springbootcouchbase.controller;

import com.db.springbootcouchbase.domain.Topic;
import com.db.springbootcouchbase.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by RV00451128 on 7/19/2017.
 */
@RestController
public class TopicController {

    @Autowired
    private TopicService topicservice;
    @RequestMapping("/topics")
    public List<Topic> getAllTopic(){
        return topicservice.getAllTopic();
    }
    @RequestMapping(method = RequestMethod.POST,value="/topics")
    public void addTopic(@RequestBody Topic topic){
        topicservice.addTopic(topic);
    }
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicservice.getTopic(id);
    }
    @RequestMapping(method = RequestMethod.PUT,value="/topics/{id}")
    public void updateTopic(@RequestBody Topic topic,@PathVariable String id){
        topicservice.updateTopic(id,topic);
    }

    @RequestMapping(method = RequestMethod.DELETE,value="/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicservice.deleteTopic(id);
    }

}
