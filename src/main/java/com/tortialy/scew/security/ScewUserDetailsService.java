package com.tortialy.scew.security;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tortialy.scew.dao.UsuarioDao;
import com.tortialy.scew.data.model.Rol;
import com.tortialy.scew.data.model.Usuario;

@Service("userDetailsService")
public class ScewUserDetailsService implements UserDetailsService {

	@Autowired
	private UsuarioDao usuarioDao;
	
	@Override
	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioDao.findByUsername(username);
		List<GrantedAuthority> authorities = buildUserAuthority(usuario.getRoles());
		return buildUserForAuthentication(usuario, authorities);
	}
	

	private User buildUserForAuthentication(Usuario usuario, List<GrantedAuthority> authorities) {
		return new User(usuario.getUsername(), usuario.getPassword(), usuario.isEnabled(), true, true, true, authorities); 		
	}
	
	private List<GrantedAuthority> buildUserAuthority(Set<Rol> roles) {
		Set<GrantedAuthority> authorities =  new HashSet<GrantedAuthority>();
		for (Rol rol : roles) {
			authorities.add(new SimpleGrantedAuthority(rol.getRol()));
		}
		List<GrantedAuthority> result = new ArrayList<GrantedAuthority>(authorities);
		return result;
	}

}