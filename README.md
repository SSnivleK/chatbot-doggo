##Chatbot Doggo

Esse é um projeto simples de um chatbot chamado Doggo, criado em Java para avaliação na matéria de Progamação Orientada a Objetos

O objetivo desse projeto era criar classes que seriam chamadas de acordo com o que fosse digitado pelo usuário exibindo as respostas devidas.

Nesse projeto temos as seguintes classes:

Classes de reposta de hora e outra de data, que consegue retornar respectivamente os dados de hora e data atual por meio da lib time.LocalTime e time.LocalDate formata-lá por meio da lib time.format.DateTimeFormatter

Classe de resposta simples que recebe a palavra chave e a resposta que deve ser retornada ao digitarmos a palavra chave

Classe contador que retorna um contador sempre que sua palavra chave é digitada

Classe de resposta aleatória que guarda respostas possíveis de retorno para sua palavra chave por meio de um array list na lib util.ArrayList e as retorna aleatoriamente com um laço por meio da lib util.Random.

Classe Chatbot que adiciona os tipos de respostas as suas devidas categorias e as processa de maneira correta, retornando a frase  "Não entendi, pode repetir?", sempre que é digitado palavras chaves que o programa não reconhece

Por fim temos as classes resposta e main, sendo a classe resposta uma classe abstrata que engloba os métodos de verificação e retorno das classes extends dela que vimos acima, e o método main utilizado para executar os códigos.

Sinta-se livre para tirar quaisquer tipos de dúvidas comigo sobre o código ou dar dicas de como poderiamos ter o melhorado.

##Os nomes dos membros do grupo se encontram nos arquivo de texto Integrantes