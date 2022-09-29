<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Cadastro de Usuário</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
	
	<script type="text/javascript">
		$(document).ready(function() {
			$("#btnCadastrar").click(function() {
				var frmData = $("#frmCadastro").serialize();
				$.ajax({
					url : "cadastroDeUsuarioRespondedor.jsp",
					data : frmData,
					type : "POST",
					success : function(data) {
						$("#msg").html(data);
					}
				});
			});
		});
	</script>
	
</head>
<body style="background-image: url('https://img.freepik.com/free-vector/white-abstract-background-design_23-2148825582.jpg') ;">
	<div class="container">
        <br>
		<h2>Cadastro de Usuário</h2>
		
		<form id="frmCadastro">
            <div class="mb-3">
                <div class="form-group">
                    <label for="email">Email:</label> 
                    <input type="email" maxlength="100" class="form-control" id="email" placeholder="Digite seu  email" name="email" required/>
                    <br>
                </div>

                <div class="form-group">
                    <label for="nome">Nome:</label> 
                    <input type="text" maxlength="50" class="form-control" id="nome" placeholder="Digite seu nome:" name="nome">
                    <br>
                </div>
                <div class="form-group">
                    <label for="cpf">CPF:</label> 
                    <input type="text" maxlength="14" class="form-control" id="cpf" placeholder="Digite seu CPF:" name="cpf">
                    <br>
                </div>
                <div class="form-group">
                    <label for="endereco">Endereço:</label> 
                    <input type="text" maxlength="50" class="form-control" id="endereco" placeholder="Digite seu Endereço:" name="endereco">
                    <br>
                </div>
                <div class="form-group">
                    <label for="bairro">Bairro:</label> 
                    <input type="text" maxlength="30" class="form-control" id="bairro" placeholder="Digite seu Bairro:" name="bairro">
                    <br>
                </div>
                <div class="form-group">
                    <label for="cidade">Cidade:</label> 
                    <input type="text" maxlength="50" class="form-control" id="cidade" placeholder="Digite seu Cidade:" name="cidade">
                    <br>
                </div>
                <div class="form-group">
                    <label for="uf">UF:</label> 
                    <input type="text" maxlength="2" class="form-control" id="uf" placeholder="Digite seu UF:" name="uf">
                    <br>
                </div>
                <div class="form-group">
                    <label for="cep">CEP:</label> 
                    <input type="text" maxlength="9" class="form-control" id="cep" placeholder="Digite seu CEP:" name="cep">
                    <br>
                </div>
                <div class="form-group">
                    <label for="telefone">Telefone:</label> 
                    <input type="text" maxlength="15" class="form-control" id="telefone" placeholder="Digite seu Telefone:" name="telefone">
                    <br>
                </div>
                <br>
                <button type="button" id="btnCadastrar" class="btn btn-primary">Cadastrar</button>
            </div>
		</form>
		<div id="msg"></div>
	
</div>
</body>
</html>
