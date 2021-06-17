package com.knoldus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    private List<Topic> topics=new ArrayList<>(Arrays.asList(
            new Topic("first","Vaibhav","CS"),
            new Topic("second","Gaurav","IT"),
            new Topic("third","Shashank","Civil")
    ));
    public List<Topic> getAllTopics(){
        List<Topic> topics=new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String name){
        return topics.stream().filter(t->t.getName().equals(name)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, String name) {
        for(int i=0;i<topics.size();i++){
            Topic t=topics.get(i);
            if(t.getName().equals(name)){
                topics.set(i,topic);
                return;
            }
        }
    }

    public void deleteTopic(String name) {
        topics.removeIf(t->t.getName().equals(name));
    }
}
