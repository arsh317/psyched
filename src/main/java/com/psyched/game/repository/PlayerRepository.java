package com.psyched.game.repository;

import com.psyched.game.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlayerRepository extends JpaRepository<Player,Long> {

    Optional<Player> findByUserName(String userName);
}
