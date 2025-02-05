package com.springDingDong.Jay.assign2;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerService {

    private final PlayerRepository playerRepository;

    public void save(Player player) {
       playerRepository.save(player);
    }

    public List<Player> findAll() {
        return playerRepository.findAll();
    }


    public Player findById(Long id) {
        return playerRepository.findById(id);
    }

    public Player findByName(String name) {
        return playerRepository.findByName(name);
    }

    public void deleteByName(String name) {
        playerRepository.deleteByName(name);
    }

    public void changeTeamByName(String name, String newTeam) {
        playerRepository.changeTeamByName(name, newTeam);
    }
}
