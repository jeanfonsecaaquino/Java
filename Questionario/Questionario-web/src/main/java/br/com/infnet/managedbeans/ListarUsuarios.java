package br.com.infnet.managedbeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.DualListModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.infnet.questionario.dao.UsuarioDAO;
import br.com.infnet.questionario.dto.Usuario;

@ManagedBean(name="MBListarUsuarios")
@ViewScoped
public class ListarUsuarios implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private DualListModel<Usuario> usuariosModel;
	private List<Usuario> usuariosTodos;
	private List<Usuario> usuariosNaTurma;
	private static Logger log = LoggerFactory.getLogger(ListarUsuarios.class);
	
	@EJB
	private UsuarioDAO usuarioDAO;
	
	
	@PostConstruct
	public void init(){
		try {
			
			
		} catch (Exception e) {
			log.error(e.getMessage(),e);
		}
	}

}

