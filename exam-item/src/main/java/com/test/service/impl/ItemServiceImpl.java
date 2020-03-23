package com.test.service.impl;

import com.test.dao.ItemDao;
import com.test.pojo.Item;
import com.test.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;

    @Override
    public List<Item> listItem() {
        return itemDao.listItem();
    }
}
