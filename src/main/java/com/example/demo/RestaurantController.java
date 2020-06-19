package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.tw.RestaurantBean;

@RestController
@RequestMapping("log")
public class RestaurantController {

	
	final List<RestaurantBean> restaurantList = new ArrayList<RestaurantBean>();
    
    @RequestMapping(method = RequestMethod.GET)
    public List<RestaurantBean> getRestaurants() {
        RestaurantBean bean = new RestaurantBean();
        bean.setTagName("sampleTag");
        bean.setTabelogUrl("https://www.google.com");
        bean.setUserName("takashi");
        bean.setTweet("this is nice restaurant!");
        restaurantList.add(bean);
        return restaurantList;
    }
}
