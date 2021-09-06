package com.tky.chapter15.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/6 20:52
 */
public class Homework01 {
    public static void main(String[] args) {

    }

    @Test
    public void test() {
        DAO<User> dao = new DAO<>();
        dao.save("001", new User(1,10,"jack"));
        dao.save("002", new User(2,18,"kate"));
        dao.save("003", new User(3,38,"smith"));

        List<User> userList = dao.list();
        System.out.println("userList = " + userList);
    }
}

class DAO<T> {

    private Map<String, T> map = new HashMap<>();


    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.replace(id, entity);
    }

    public List<T> list() {
        return new ArrayList<T>(map.values());
    }

    public void delete(String id) {
        map.remove(id);
    }
}