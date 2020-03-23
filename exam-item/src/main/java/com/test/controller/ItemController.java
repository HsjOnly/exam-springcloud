package com.test.controller;

import com.test.entity.Result;
import com.test.pojo.Item;
import com.test.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    // 查全部
    @GetMapping
    public Result<List<Item>> listItem(){
        // 调用service查询
        List<Item> itemList = itemService.listItem();
        // 封装并返回结果
        return new Result<>(true, "查询全部item成功", itemList);
    }
    // 按指定条件查询
    // 增
    // 删
    // 改
}
