package com.test.controller;

import com.test.entity.Result;
import com.test.pojo.Item;
import com.test.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    // 查全部
    @GetMapping
    public Result<List<Item>> listItem() {
        // 调用service查询
        List<Item> itemList = itemService.listItem();
        // 封装并返回结果
        return new Result<>(true, "查询全部item成功", itemList);
    }

    // 按指定条件查询
    @PostMapping("/listItemByCondition")
    public Result<List<Item>> listItemByCondition(@RequestBody Item item) {
        List<Item> itemList = itemService.listItemByCondition(item);
        return new Result<>(true, "根据条件查询item成功", itemList);
    }

    // 增
    @PostMapping
    public Result insertItem(@RequestBody Item item) {
        itemService.insertItem(item);
        return new Result(true, "新增item成功");
    }

    // 删
    @DeleteMapping
    public Result deleteItem(@RequestBody Item item) {
        int count = itemService.deleteItemByCondition(item);
        return new Result(true, "删除item成功，共删除" + count +"条记录");
    }
    // 改
}
