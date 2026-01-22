package org.hyman.BCMS.repository;

import org.hyman.BCMS.entity.CardStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CardStatusRepository extends JpaRepository<CardStatus, Integer> {

    Optional<CardStatus> findByName(String name);

}
