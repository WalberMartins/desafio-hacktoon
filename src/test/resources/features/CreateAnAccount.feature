#language: pt
#encoding: UTF-8
Funcionalidade: Create An Account

@Cadastrar
Cenario: Cadastrar usuario
Dado que eu acesse o menu Sign in
Quando eu preencher o campo Email address com "lucas.batista@gmail.com"
E clicar no botao Create an account
E preencher o campo First name com "Lucas"
E preencher o campo Last name com "Batista"
E preencher o campo Password com "123456"
E selecionar no campo Date of Birth com "14/07/1993"
E preencher o campo Address com "SCN Q 1 - Asa Norte"
E preencher o campo City com "Brasília"
E selecionar no campo State "Alabama"
E preencher o campo Zip/Postal Code "70711"
E selecionar no campo Country "United States"
E preencher no campo Mobile phone "995570693"
E clicar no botao Register
Entao o sistema apresenta o usuario "Lucas Batista" logado





