package com.example.class2;

import java.util.ArrayList;
import java.util.List;
@org.springframework.stereotype.Service
public class Serviceimpl implements  Service{
    private List<User> users = new ArrayList<>(){{
        add(new User(1,"Ade","Lekan",30));
        add(new User(2,"Daro","gadibia",27));
        add(new User(3,"Samson","Delila",1000));
    }};

    @Override
    public List<User> findAllUser() {
        return users;
    }

    @Override
    public void deleteUser(int id) {
        users.removeIf(x->x.getId()==id);
    }

    @Override
    public User viewUser(int id) {
        for (User user: users) {
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }
}
