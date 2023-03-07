//João Pedro Lima de Albuquerque R.A.: 11.119.412-2//

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

//Cógido cuja função é ensinar aritimética ao usuário//

//Função para descobrir o nível desejado//
int inicio(int nivel){

  //Inserção de estrutura while para evitar respostas indesejadas//
  do{
    //Pergunta para saber nível//
    printf("Boa tarde! Vamos estudar aritimética hoje? Primeiramente, selecione a dificuldade desejada (de 1 a 7): ");
    scanf("%d", &nivel);
    //Notificação caso a resposta não esteja dentro do esperado//
    if ((nivel > 7) || (nivel < 1)){
      printf("A resposta inserida não é válida, a pergunta será feita novamente.\n");
    }
  }while((nivel > 7) || (nivel < 1));

  return nivel;
}

//Função para perguntar o tipo de conta desejada//
int mod(int tipo){

  //Inserção de estrutura while para evitar respostas indesejadas//
  do{
    //Pergunta para saber a função matematica//
    printf("Beleza! E hoje você quer estudar adição [1], subtração [2], multiplicação [3], divisão [4] ou todos juntos [5]? ");
    scanf("%d", &tipo);
    //Notificação caso a resposta não esteja dentro do esperado//
    if ((tipo > 5)||(tipo < 1)){
      printf("A resposta inserida não é válida, a pergunta será feita novamente.\n");
    }
  }while((tipo > 5)||(tipo < 1));
  printf("Ok, vamos começar:\n");

  return tipo;
}

//Função que imprime uma mensagem quando está correto//
void correto(){
  int i = rand() % 9;
  //Criado um número aleatório de 0 a 9 para escolher uma mensagem//
  if (i==1){
    printf("Parabéns, a resposta está correta!\n");
  }
  else if (i ==2){
    printf("Correto! Perfeito\n");
  }
  else if (i == 3){
    printf("Boa! Corretíssimo\n");
  }
  else if (i == 4){
    printf("Uhul! Acertou!\n");
  }
  else if (i == 5){
    printf("Acertou!\n");
  }
  else if (i == 6){
    printf("Está certo!\n");
  }
  else if (i == 7){
    printf("É isso mesmo!\n");
  }
  else if (i == 8){
    printf("Parabéns!\n");
  }
  else if (i == 9){
    printf("Em cheio! Está correto!\n");
  }
  else if (i == 0){
    printf("É assim que se faz! A resposta está certa!\n");
  }
}

//Função para criar uma mensagem aleatória quando a resposta for incorreta//
void incorreto(){
  int i = rand() % 9;
  //Criado um número aleatório de 0 a 9 para escolher uma mensagem//
  if (i==1){
    printf( "Putz, está incorreto\n");
  }
  else if (i ==2){
    printf( "A resposta está incorreta\n");
  }
  else if (i == 3){
    printf( "Mais sorte na próxima\n");
  }
  else if (i == 4){
    printf( "A resposta obtida não está certa!\n");
  }
  else if (i == 5){
    printf( "Errou!\n");
  }
  else if (i == 6){
    printf( "Quase!\n");
  }
  else if (i == 7){
    printf( "Por pouco!\n");
  }
  else if (i == 8){
    printf( "Não está correta a resposta!\n");
  }
  else if (i == 9){
    printf( "Não foi dessa vez!\n");
  }
  else if (i == 0){
    printf( "Na próxima você acerta!\n");
  }
}

//Função para soma//
int soma(int nivel, int acertos){
  //Levando em consideração o nivel//
  int tamanho = pow(10,nivel); 

  //Criando variáveis para a soma e a obtenção de respostas//

  int a = rand () % tamanho, b = rand() % tamanho, c;

  //Obtenção da resposta//
  printf("A soma de %d com %d é: ", a, b);
  scanf("%d", &c);
  
  //Verificação da resposta//
  if (c == a + b){
    //Dizendo que a conta está correta//
    correto();
    //Aumentando o número de acertos//
    acertos++;
    }
  else{
    //Dizendo que a conta está incorreta//
    incorreto();
    printf("A resposta certa é: %d\n", a+b);
  }
  return acertos;
}

//Função para subtração//
int sub(int nivel, int acertos){
  //Levando em consideração o nivel//
  int tamanho = pow(10,nivel); 
  //Criando variáveis para a subtração e a obtenção de respostas//
  int a = rand () % tamanho, b = rand() % tamanho, c;
  //Obtenção da resposta
  printf("A subtração de %d com %d é: ", a, b);
  scanf("%d", &c);
  //Verificação da resposta//
  if (c == a - b){
    //Dizendo que a conta está correta//
    correto();
     //Aumentando o número de acertos//
    acertos++;
  }
  else{
    //Dizendo que a conta está incorreta//
    incorreto();
    printf("A resposta certa é: %d\n", a-b);
  }
  return acertos;
}

//Função para multiplicação//
int mult(int nivel, int acertos){
  //Levando em consideração o nivel//
  int tamanho = pow(10,nivel); 
  //Criando variáveis para a multiplicação e a obtenção de respostas//
  int a = rand () % tamanho, b = rand() % tamanho, c;
  //Obtenção da resposta
  printf("A multiplicação de %d com %d é: ", a, b);
  scanf("%d", &c);
  //Verificação da resposta//
  if (c == a * b){
    //Dizendo que a conta está correta//
    correto();
    //Aumentando o número de acertos//
    acertos++;
  }
  else{
    //Dizendo que a conta está incorreta//
    incorreto();
    printf("A resposta certa é: %d\n", a * b);
  }
  return acertos;
}

//Função para divisão//
int divi(int nivel, int acertos){
  //Levando em consideração o nivel//
  int tamanho = pow(10,nivel); 
  //Criando variáveis para a divisão e a obtenção de respostas//
  int a = rand () % tamanho, b = rand() % tamanho, c;
  //Obtenção da resposta
  printf("Em números inteiros, a divisão de %d por %d é: ", a, b);
  scanf("%d", &c);
  //Verificação da resposta//
  if (c == a / b){
    //Dizendo que a conta está correta//
    correto();
    //Aumentando o número de acertos//
    acertos++;
  }
  else{
    //Dizendo que a conta está incorreta//
    incorreto();
    printf("A resposta certa é: %d\n", a/b);
  }
  return acertos;
}
//Função que retorna a porcentagem de respostas corretas e analisa o desempenho//
void porcentagem(int acertos){
  //Calculo da porcentagem//
  int porcentagem = acertos * 10;

  if (porcentagem < 80){
    printf("Porcentagem de %d porcento. \nPeça ajuda ao seu professor.\n", porcentagem);
  }
  else{
    printf("Porcentagem de acerto de %d porcento.\nParabéns, você está pronto para ir para o próximo nível!\n", porcentagem);
  }
}

//Função Main//
int main(){
  do{
    //Declaração de variáveis utilizadas na função//
    int nivel, tipo, acertos = 0, func;
    //Chamando função menu//
    nivel = inicio(nivel);
    //Chamando função para considerar o tipo de conta feita//
    tipo = mod(tipo);
    //Caso tenha optado pela adição//
    if (tipo == 1){
      for (int i = 0; i < 10; i++){
          acertos = soma(nivel, acertos);
      }
    }
    //Caso tenha optado pela subtração//
    else if(tipo == 2){
      for (int i = 0; i < 10; i++){
         acertos = sub(nivel, acertos);
      }
    }
    //Caso tenha optado pela multiplicação//
    else if(tipo == 3){
      for (int i = 0; i < 10; i++){
       acertos = mult(nivel, acertos);
      }
    }
    //Caso tenha optado pela divisão//
    else if(tipo == 4){
      for (int i = 0; i < 10; i++){
          acertos = divi(nivel, acertos);
      }
    }
    //Caso tenha optado de fazer todos os tipos de conta//
    else if(tipo == 5){
      for (int i = 0; i < 10; i++){
        func = rand() % 3;
        if (func == 1){
          acertos = soma(nivel, acertos);
        }
        else if (func == 2){
          acertos = sub(nivel, acertos);
        }
        else if (func == 3){
          acertos = mult(nivel, acertos);
        }
        else if (func == 0){
          acertos = divi(nivel, acertos);
        }
      }
    }
        porcentagem(acertos);
  }while(1); 
}