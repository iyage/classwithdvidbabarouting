package com.example.class2;

import java.util.List;

public interface Service {
   public List<User> findAllUser();
   public void deleteUser(int id);
   public User viewUser(int id);
}
