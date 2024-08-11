# demo-security-jwt

## Componentes

### UserDetails

* Interface responsável por armazenar as informações do usuário logado no sistema;
  > (e.g.: **username**, **password**, **authorities**)

### UserDetailsService

* Interface responsável por buscar e retornar o UserDetails por seu username
  > É chamado automaticamente durante a autenticação para retornar o UserDetails

### SecurityConfig

* Configura o filtro de segurança da aplicação, encoder de senha, e encoder e decoder de JWT
  > Rotas autorizadas e protegidas, http basic, oauth resouce server com JWT

## RSA Key Pair

### O que é?

* Um par de chaves RSA consiste em uma chave pública e uma chave privada utilizadas em um algoritmo de criptografia
  assimétrica, em que a chave pública é usada para criptografar, enquanto a chave privada é usada para descriptografar.

### Criando um Key Par

* Você pode gerar um par _**public-private**_ fazendo uso do contexto ```genrsa```.

  ```shell
  # Gera o par de chaves RSA com tamanho de 2048 bits e salva-as em um arquivo chamado `app.key`
  openssl genrsa -out app.key 2048
  ```
  
  ```shell
  # Extrai a chave pública de um par de chaves RSA armazenado em `app.key` e salva-a em um novo arquivo chamado `app.pub`
  openssl rsa -in app.key -pubout -out app.pub
  ```