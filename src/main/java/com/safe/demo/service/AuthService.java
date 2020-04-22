package com.safe.demo.service;


import com.safe.demo.model.entity.User;

/**
 * @www.codesheep.cn
 * 20190312
 */
public interface AuthService {

    User register(User userToAdd );
    String login( String username, String password );
}
