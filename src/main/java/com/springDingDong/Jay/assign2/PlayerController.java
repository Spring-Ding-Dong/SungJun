package com.springDingDong.Jay.assign2;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequiredArgsConstructor
@Slf4j
public class    PlayerController {

    private final PlayerService playerService;


//    private EntityManager em;
//    public PlayerController(EntityManager em) {
//        this.em = em;
//    }
    //RESTFUL하게 주소값 수정.
    @PostMapping("/Player")
    public void createPlayer(@RequestBody Player player) { //반환타입 수정 Player-->void
//        em.persist(player);
//        return player;
        playerService.save(player);
        log.info("Create player : {}", player);//로그 추가


    }

    @GetMapping("/Players")
    public List<Player> getAllPlayer() {
//        return em.createQuery("select p from Player p", Player.class).getResultList();
        return playerService.findAll();

    }
    @GetMapping("/Player/{id}")
    public Player getPlayerById(@PathVariable Long id) {
        return playerService.findById(id);
    }
    @GetMapping("/Player/Name/{name}")
    public Player getPlayerByName(@PathVariable String name) {
        return playerService.findByName(name);
    }

    @DeleteMapping("/Player/{name}")
    public String deletePlayer(@PathVariable String name) {
        // Repo로 로직 분리하는게 나을듯..

       playerService.deleteByName(name);
       return "Delete Player Successfully";


    }

    @PutMapping("/Player/{name}/{newTeam}")
    public String changeTeamByName(@PathVariable String name,@PathVariable String newTeam) {
        playerService.changeTeamByName(name,newTeam);
        return "Change Team Successfully";
    }






}
