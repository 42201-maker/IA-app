implementação de FurColor.java e Cat.java

1. enum FurColor
Problema: arquivo vazio, sem nenhuma constante ou estrutura
O que fiz: implementei seguindo exatamente o modelo do TrainingLevel — campos code e displayName, 7 constantes, construtor, getters e fromCode()
Por que é melhor: mesma estrutura do resto do projeto, fácil de adicionar novas cores só incluindo uma constante

2. lógica do construtor de Cat
Problema: o habitat e o isWild do gato dependem do isIndoor, mas isso não é óbvio
O que fiz: passei isIndoor ? Habitat.DOMESTIC : Habitat.URBAN e !isIndoor direto no super()
Por que é melhor: o raciocínio fica inline, sem if separado — gato indoor é doméstico e não selvagem, gato outdoor é urbano e selvagem

3. lives fixo em 7
Problema: poderia parecer que lives deveria ser um parâmetro do construtor
O que fiz: inicializei direto no construtor sem receber como argumento
Por que é melhor: todo gato começa com 7 vidas por definição, não faz sentido deixar isso configurável

4. overloads de move()
Problema: o move() herdado de Animal só recebe distance
O que fiz: criei move(int distance, int speed) para salto e move(int distance, String target) para aproximação silenciosa
Por que é melhor: o compilador diferencia pelo tipo do segundo parâmetro, sem precisar de nomes de método diferentes

5. loseLife()
Problema: precisava decrementar vidas sem deixar passar de zero
O que fiz: chequei lives > 0 antes de decrementar, com mensagens diferentes para cada caso
Por que é melhor: evita lives negativo e deixa o comportamento de "sem vidas restantes" explícito

6. como testei
Criei um Main.java temporário com dois gatos: um indoor (Whiskers) e um outdoor (Shadow)
Chamei todos os métodos e verifiquei no console que habitat, isWild, lives e as saídas estavam corretos
