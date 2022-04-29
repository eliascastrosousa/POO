package module;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;

import com.mysql.cj.protocol.Resultset;

import database.DBQuery;

public class Usuario {
	
	private int    idUsuario;
	private String email;
	private String senha;
	private int    idNivelUsuario;
	private String nome;
	private String cpf;
	private String endereco;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	private String telefone;
	private String foto;
	private String ativo;
	
	private String tableName 	= "usuarios";
	private String fieldsName 	= "idUsuario, email, senha, idNivelUsuario, nome, cpf, endereco, bairro, cidade, uf, cep, telefone, foto, ativo";
	private String fieldKey  	= "idUsuario";
	private DBQuery dbQuery     = new DBQuery(tableName, fieldsName, fieldKey);
	
	public Usuario( ) {
	
	}

	public Usuario( int idUsuario, String email, String senha, int idNivelUsuario, String nome, String cpf, String endereco, String bairro, String cidade, String uf, String cep, String telefone, String foto, String ativo ) {
		this.setIdUsuario(idUsuario);
		this.setEmail(email);
		this.setSenha(senha);
		this.setIdNivelUsuario(idNivelUsuario);
		this.setNome(nome);
		this.setCpf(cpf);
		this.setEndereco(endereco);
		this.setBairro(bairro);
		this.setCidade(cidade);
		this.setUf(uf);
		this.setCep(cep);
		this.setTelefone(telefone);
		this.setFoto(foto);
		this.setAtivo(ativo);
	}
	
	public String[] toArray() {
		// deve ser na mesma ordem que informado no fieldsName
		String[] values = new String[] {
				this.getIdUsuario() + "",
				this.getEmail(),
				this.getSenha(),
				this.getIdNivelUsuario()+"",
				this.getNome(),
				this.getCpf(),
				this.getEndereco(),
				this.getBairro(),
				this.getCidade(),
				this.getUf(),
				this.getCep(),
				this.getTelefone(),
				this.getFoto(),
				this.getAtivo()
		};
		return (values);
	}
	
	
	public void listAll() {
		ResultSet rs = this.dbQuery.select("");
		try {
			while (rs.next()) {
				String out = "";
				out += rs.getString("idUsuario") + "|";
				out += rs.getString("email") + "|";
				out += rs.getString("senha") + "|";
				out += rs.getString("idNivelUsuario") + "|";
				out += rs.getString("nome") + "|";
				out += rs.getString("cpf") + "|";
				out += rs.getString("cidade") + "|";
				out += rs.getString("uf") + "|";
				out += rs.getString("cep") + "|";
				out += rs.getString("telefone") + "|";
				out += rs.getString("foto") + "|";
				out += rs.getString("ativo");
				System.out.println(  out );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void save () {
		if ( this.getIdUsuario() == 0) {
			this.dbQuery.insert(this.toArray());
		} else {
			this.dbQuery.update(this.toArray());
		}
	}
	
	public void delete() {
		if ( this.getIdUsuario() != 0) {
			this.dbQuery.delete(this.toArray());
		}
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getIdNivelUsuario() {
		return idNivelUsuario;
	}

	public void setIdNivelUsuario(int idNivelUsuario) {
		this.idNivelUsuario = idNivelUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	
	
}