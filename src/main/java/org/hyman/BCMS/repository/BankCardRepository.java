package org.hyman.BCMS.repository;

import org.hyman.BCMS.entity.BankCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankCardRepository extends JpaRepository<BankCard, Integer> {
}
