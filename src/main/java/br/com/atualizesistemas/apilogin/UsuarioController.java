package br.com.atualizesistemas.apilogin;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {

    @GetMapping
    public ResponseEntity usuarios() {
        return ResponseEntity.ok("GET Usuários");
    }
}
