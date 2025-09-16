package com.coffee.controller;

import com.coffee.entity.Element;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ElementController {
    @GetMapping("/element")
    public Element test(){
        Element bean = new Element();
        bean.setId(1);
        bean.setName("프렌치 바게트");
        bean.setPrice(1000);
        bean.setCategory("bread");
        bean.setStock(111);
        bean.setImage("french_baguette_01.png");
        bean.setDescription("프랑스의 대표적인 빵 중 하나로, 길쭉하고 얇은 형태의 식빵입니다. 바삭하면서도 촉촉한 식감과 진한 맛이 특징입니다.");
        return bean;
    }
    @GetMapping("/element/list")
    public List<Element> test02(){
        List<Element> elementList = new ArrayList<>();
        elementList.add(new Element(2,"크로와상",2000,"bread",222,"croissant_02.png","프랑스의 대표적인 베이커리 중 하나로, 층층이 쌓인 반죽에 버터를 추가하여 구워낸 과자입니다."));
        elementList.add(new Element(3,"아메리카노",3000,"beverage",12345,"americano01.png","에스프레소의 쓴 맛과 향을 좋아하는 사람들이 물을 추가해서 즐기는 음료로, 물과 에스프레소의 비율에 따라서 쓴 맛과 진하게 즐길 수 있습니다."));
        elementList.add(new Element(4,"카푸치노",4000,"beverage",444,"cappuccino01.png","스팀밀크와 거품을 올린 것을 섞어 만든 이탈리아의 전통적인 커피 음료입니다."));
        return elementList;
    }
}
