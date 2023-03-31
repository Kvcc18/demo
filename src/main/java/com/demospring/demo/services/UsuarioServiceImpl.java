package com.demospring.demo.services;
import java.util.List;
import com.demospring.demo.entities.Usuario;
import com.demospring.demo.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public boolean login(String user, String pass) {
        boolean result = false;
        List<Usuario> listUsuario = usuarioRepository.findByNombre(user);
        Usuario usuario = listUsuario.get(0);
        if (usuario != null) {
            if (usuario.getPassword().equals(pass)) {
                result = true;
            }
        }
        return result;
    }
}




