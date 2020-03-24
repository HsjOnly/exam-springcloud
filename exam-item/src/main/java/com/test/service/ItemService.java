package com.test.service;

import com.test.pojo.Item;

import java.util.List;

public interface ItemService {
    List<Item> listItem();

    List<Item> listItemByCondition(Item item);

    void insertItem(Item item);
}
