package org.hyman.BCMS.service;

import lombok.RequiredArgsConstructor;
import org.hyman.BCMS.entity.User;
import org.hyman.BCMS.repository.UserRepository;
import org.hyman.BCMS.util.exception.ObjectNotFoundException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public User getByName(String name){
        return repository.findByName(name).orElseThrow(() ->
                new UsernameNotFoundException(String.format("Пользователь %s не найден", name)));
    }

    public User getById(int id){
        return repository.findById(id).orElseThrow(() ->
                new ObjectNotFoundException(String.format("Пользователь с id %d не найден", id)));
    }
}
