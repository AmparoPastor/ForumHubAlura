package com.alura.forumhub.ForumHub.controller;

import com.alura.forumhub.ForumHub.topicos.DadosTopico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("topicos")
public class TopicosController {

    @PostMapping
    public void cadastrarTopico(@RequestBody DadosTopico dados){
        System.out.println(dados);

    }
}
