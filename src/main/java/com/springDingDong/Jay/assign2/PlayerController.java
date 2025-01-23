package com.springDingDong.Jay.assign2;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("Player")
@Transactional
public class    PlayerController {

    private final PlayerRepository playerRepository;

    public PlayerController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }
//    private EntityManager em;
//    public PlayerController(EntityManager em) {
//        this.em = em;
//    }

    @PostMapping("/AddPlayer")
    public Player createPlayer(@RequestBody Player player) {
//        em.persist(player);
//        return player;
        playerRepository.save(player);
        return player;

    }

    @GetMapping("/GetAllPlayer")
    public List<Player> getAllPlayer() {
//        return em.createQuery("select p from Player p", Player.class).getResultList();
        return playerRepository.findAll();

    }
    @GetMapping("/GetPlayerById/{id}")
    public Player getPlayerById(@PathVariable Long id) {
        return playerRepository.findById(id);
    }
    @GetMapping("/GetPlayerByName/{name}")
    public Player getPlayerByName(@PathVariable String name) {
        return playerRepository.findByName(name);
    }

    @DeleteMapping("/RemovePlayer/{name}")
    public String deletePlayer(@PathVariable String name) {
        // Repo로 로직 분리하는게 나을듯..

       playerRepository.deleteByName(name);
       return "Delete Player Successfully";


    }

    @PutMapping("/ChangeTeamByName")
    public String changeTeamByName(@RequestParam String name,@RequestParam String newTeam) {
        playerRepository.changeTeamByName(name,newTeam);
        return "Change Team Successfully";
    }






}
