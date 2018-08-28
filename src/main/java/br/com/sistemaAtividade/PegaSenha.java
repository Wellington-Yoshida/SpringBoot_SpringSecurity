package br.com.sistemaAtividade;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PegaSenha {

    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("123"));
    }
}

