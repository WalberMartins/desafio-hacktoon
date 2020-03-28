#language: pt
#encoding: UTF-8
Funcionalidade: Create An Account

Contexto: 
			Dado que eu acesse o menu Sign in
			
@FazerLogin
Cenario: Fazer login
Quando eu preencher o campo de login Email address com "lucas.batista@gmail.com"
E preencher o campo de login Password com "123456"
E clicar no botao Sign in
Entao o sistema apresenta o usuario "Lucas Batista" logado 