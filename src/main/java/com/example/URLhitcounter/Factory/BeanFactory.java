package com.example.URLhitcounter.Factory;

import com.example.URLhitcounter.Model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanFactory {

    @Bean
    public List<User> getDataSource(){
        return new ArrayList<>();
    }
}
