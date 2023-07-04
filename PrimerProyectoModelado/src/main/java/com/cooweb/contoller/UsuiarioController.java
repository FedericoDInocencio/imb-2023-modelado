package com.cooweb.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

import com.cooweb.dao.UsuarioDao;
import com.cooweb.entity.Usuario;

@RestController
public class UsuiarioController {
	
	@Autowired
	private UsuarioDao usuarioDao;
/*	
   @RequestMapping(value="mensaje")
	public String mensaje() {
		
		return "hola";
	}
   
   @RequestMapping(value="persona")
   public List<String> listarPersonas(){
	   
	   return List.of("Diego","Juan","Jose");
   }
   @RequestMapping(value="usuario/{id}")
   public Usuario getUsuarios(@PathVariable Long id) {
	   
	   Usuario usuario= new Usuario();
	   usuario.setId(id);
	   usuario.setNombre("Federico");
	   usuario.setApellido("DInocencio");
	   usuario.setEmail("federicodinocencio@gmail.com");
	   usuario.setTelefono("46161616");
	   
	   return usuario;
	   
   }
   */
   
   @RequestMapping(value="listar/usuario")
   public List<Usuario> listar_varisoUsuarios() {
	   
	List<Usuario> usuarios= new ArrayList<>() ;
	   Usuario usuario1 =new Usuario();
	   usuario1.setId(3L);
	   usuario1.setNombre("Federico");
	   usuario1.setApellido("DInocencio");
	   usuario1.setEmail("federicodinocencio@gmail.com");
	   usuario1.setTelefono("46161616");
	   
  Usuario usuario2 =new Usuario();
	   usuario2.setId(4L);
	   usuario2.setNombre("jose");
	   usuario2.setApellido("puentes");
	   usuario2.setEmail("fffffffffff@gmail.com");
	   usuario2.setTelefono("61616");
	   
	   Usuario usuario3 =new Usuario();
	   usuario2.setId(4L);
	   usuario2.setNombre("carlos");
	   usuario2.setApellido("peralta");
	   usuario2.setEmail("aaaaaaaaa@gmail.com");
	   usuario2.setTelefono("51515");
	   
	   usuarios.add(usuario1);
	   usuarios.add(usuario2);
	   usuarios.add(usuario3);
	   
	   return usuarios;
	   
   }
   
   @RequestMapping(value="api/ususiarios")
   public List<Usuario> getUsuario(){
	   
	   List<Usuario> user= usuarioDao.obtenerUsuarios();
	   return user;
   }
}
			