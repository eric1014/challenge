import os

#Exibindo Título 
def exibir_nome_do_programa():
    print('Centro de ajuda\n')

#Exibindo Opções
def exibir_opçoes():  
    print('1. Ativar chatbot\n')
    print('2. Quero uma inpeção\n')
    print('3. Listar postos próximos\n')
    print('4. Sair\n')
    
def voltar_ao_menu_principal():
    input('\nDigite uma tecla pra voltar ao menu principal ')
    main()

def exibir_subtitulos(texto):
     os.system('cls')
     print(texto)
     print()

def opcao_invalida():
    print('Opção invalida.\n')
    voltar_ao_menu_principal()

#criando funções pras possíveis escolhas 
def chatbot(): 
    #Ativar chatbot 
    print('Olá como posso ajudar?')
    print()

def inspecao(): 
    print('Mande fotos sobre onde acredita ser o problema: ')

def proximos(): 
    #Ideal é buscar no banco de dados do segurado quando tiver acesso 
    bairro = input('Qual o seu bairro? ')
    postos = ('rua eu sou lindo 123')
    print(f'O posto mais próximo fica no endereço: {postos}!')

def finalizar_app():
    exibir_subtitulos('Finalizando')

def escolher_opçoes():
    try:
        opcao_escolhida = int(input('Escolha uma opção: '))
        if opcao_escolhida == 1:
            chatbot()
        elif opcao_escolhida == 2:
            inspecao()
        elif opcao_escolhida == 3:
            proximos()
        elif opcao_escolhida == 4:
            finalizar_app()
        else:
            opcao_invalida()
    except: 
         opcao_invalida()    


def main():
        os.system('cls')
        exibir_nome_do_programa()
        exibir_opçoes()
        escolher_opçoes()

if __name__ == '__main__':
        main()