package com.springDingDong.Jay.assign2;

import jakarta.persistence.EntityManager;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PlayerRepository {
    private final EntityManager em;
    public PlayerRepository(EntityManager em) {
        this.em = em;
    }

    public void save(Player player) {
        em.persist(player);

    }
    public Player findById(Long id) {
        return em.find(Player.class, id);

    }
    public Player findByName(String name) {
        Player players = em.createQuery("SELECT p FROM Player p WHERE p.name = :name",Player.class)
                .setParameter("name", name)
                .getSingleResult();
        return players;

    }

    public List<Player> findAll() {
        return em.createQuery("from Player", Player.class).getResultList();
    }

    public void deleteByName(String name) {

        Player player = findByName(name);
        em.remove(player);

    }

    public void changeTeamByName(String name, String newTeam) {

        Player player = findByName(name);
        player.setTeam(newTeam);
        em.merge(player);

    }
}
