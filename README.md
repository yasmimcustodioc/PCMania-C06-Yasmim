# PCMania-C06-Yasmim Carvalho, Engenharia de Produção, Matrícula: 149

## Uso de Inteligência Artificial:
## Modelo: ChatGPT - 5.6 Sol

### Prompt 1

> Estou desenvolvendo um projeto em Java de Programação Orientada a Objetos com base no enunciado anexado. Já organizei o projeto em dois pacotes: br.inatel.sistema, para as classes Computador, HardwareBasico, SistemaOperacional, MemoriaUSB e ProcessarPedido, e br.inatel.cliente, para a classe Cliente. A classe Main deixei separada.
>
> Já criei as classes, seus atributos privados, construtores e os métodos indicados no UML. Preciso de orientação para continuar a implementação, principalmente para estruturar a Main de acordo com o enunciado.
>
> Quero utilizar minha matrícula 149 para definir os preços das três promoções, cadastrar as configurações dos computadores de forma estática e utilizar Scanner somente para a escolha das promoções pelo cliente, encerrando quando ele digitar 0.
>
> Gostaria que você analisasse a estrutura que fiz e me orientasse sobre como continuar, respeitando as restrições do exercício, principalmente não utilizar ArrayList, manter os atributos privados e evitar getters e setters desnecessários.

### Prompt 2

> Continuei o desenvolvimento do projeto e finalizei a estrutura das classes. Na classe Computador, criei o método getPreco() porque preciso acessar o preço dentro do método calculaTotalCompra() da classe Cliente.
>
> Também criei em Cliente o método getComputadores(), que retorna o array de computadores, porque preciso passar esse array para o método estático enviarPedido(Computador[] computadores) da classe ProcessarPedido.
>
> Como o enunciado diz que getters e setters desnecessários serão penalizados, gostaria que você verificasse se esses dois getters que criei são realmente necessários e se estou utilizando corretamente o encapsulamento.
>
> Na Main, já importei as classes e o Scanner e defini float minhaMatricula = 149. Agora preciso revisar a montagem das três promoções de acordo com a tabela do enunciado, o loop de compras que estou fazendo com do-while e switch, a exibição das informações finais do cliente e a chamada de ProcessarPedido.enviarPedido().
>
> Analise o que desenvolvi e indique possíveis erros ou pequenos ajustes, procurando manter a estrutura e a lógica que já criei em vez de substituir o projeto por outra implementação.
>
## Descrição do Projeto

O PCMania é um sistema de compras desenvolvido em Java utilizando conceitos de Programação Orientada a Objetos.
O sistema possui três promoções de computadores com configurações e preços definidos a partir da matrícula do aluno. O cliente pode escolher uma ou mais promoções e continuar realizando compras até selecionar a opção 0.
Ao finalizar, o sistema apresenta os dados do cliente, as configurações dos computadores adquiridos e o valor total da compra. O projeto utiliza classes, objetos, encapsulamento, arrays, composição, pacotes e método utilitário, seguindo as especificações propostas no exercício.
