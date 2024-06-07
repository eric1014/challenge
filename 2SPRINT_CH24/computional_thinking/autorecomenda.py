import os
import json

def exibir_nome_do_programa():
    # Limpa o terminal
    os.system('cls' if os.name == 'nt' else 'clear')
    
    # Exibe o título com arte ASCII
    print(r"""
               _        _____                                         _       
     /\        | |      |  __ \                                       | |      
    /  \  _   _| |_ ___ | |__) |___  ___ ___  _ __ ___   ___ _ __   __| | __ _ 
   / /\ \| | | | __/ _ \|  _  // _ \/ __/ _ \| '_ ` _ \ / _ \ '_ \ / _` |/ _` |
  / ____ \ |_| | || (_) | | \ \  __/ (_| (_) | | | | | |  __/ | | | (_| | (_| |
 /_/    \_\__,_|\__\___/|_|  \_\___|\___\___/|_| |_| |_|\___|_| |_|\__,_|\__,_|
                                                                                                                        
    """)
    print("\nSistema para manutenções automotivas -- Powered By Porto\n")

def exibir_opcoes():
    print('1. Ativar chatbot\n')
    print('2. Solicitar inspeção\n')
    print('3. Listar postos próximos\n')
    print('4. Sair\n')

def voltar_ao_menu_principal():
    input('\nPressione qualquer tecla para voltar ao menu principal.')
    main()

def exibir_subtitulos(texto):
    os.system('cls' if os.name == 'nt' else 'clear')
    print(f"{texto}\n")

def opcao_invalida():
    print('Opção inválida.\n')
    voltar_ao_menu_principal()

def chatbot():
    exibir_subtitulos('Chatbot Ativado')
    print('Olá, como posso ajudar?')
    voltar_ao_menu_principal()

def inspecao():
    exibir_subtitulos('Solicitação de Inspeção')
    print('Por favor, envie fotos do local do problema.')
    voltar_ao_menu_principal()

def listar_postos(bairro_usuario):
    exibir_subtitulos('Postos Próximos')
    try:
        with open('postos.json', 'r', encoding='utf-8') as file:  # Adicionando explicitamente 'encoding=utf-8'
            dados = json.load(file)
            postos = [posto['endereco'] for posto in dados['postos'] if posto['bairro'].lower() == bairro_usuario.lower()]
            if postos:
                for endereco in postos:
                    print(f"Endereço: {endereco}")
            else:
                print("Nenhum posto encontrado em seu bairro.")
    except FileNotFoundError:
        print("Arquivo de postos não encontrado.")
    except json.JSONDecodeError:
        print("Erro ao decodificar o arquivo JSON. Por favor, verifique o formato do arquivo.")
    except Exception as e:
        print(f"Ocorreu um erro: {e}")
    voltar_ao_menu_principal()


def finalizar_app():
    exibir_subtitulos('Finalizando o Programa')
    print('Obrigado por usar nosso serviço.')
    exit()

def escolher_opcoes():
    opcao_escolhida = input('Escolha uma opção: ')
    if opcao_escolhida.isdigit():
        opcao_escolhida = int(opcao_escolhida)
        if opcao_escolhida == 1:
            chatbot()
        elif opcao_escolhida == 2:
            inspecao()
        elif opcao_escolhida == 3:
            bairro = input('Qual o seu bairro? ')
            listar_postos(bairro)
        elif opcao_escolhida == 4:
            finalizar_app()
        else:
            opcao_invalida()
    else:
        opcao_invalida()

def main():
    exibir_nome_do_programa()
    exibir_opcoes()
    escolher_opcoes()

if __name__ == '__main__':
    main()
