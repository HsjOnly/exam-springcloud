package com.test.dao;

import com.test.pojo.Item;

import java.util.List;

public interface ItemDao {
    List<Item> listItem();

    List<Item> listItemByCondition(Item item);
}
