# Função para capturar os dados do usuário
def capturar_dados():
    nome_completo = input("Digite seu nome completo: ")
    email = input("Digite seu email: ")
    return nome_completo, email

# Função para exibir os dados cadastrados
def exibir_dados(cadastros):
    for cadastro in cadastros:
        print(f"Nome Completo: {cadastro['nome_completo']}, Email: {cadastro['email']}")

# Função para dados de sensores marinhos
def dados_sensores_marinhos():
    print("Temperatura da água: 20°C\nNível de salinidade: 35 partes por mil\npH da água: 7.8\nPressão atmosférica: 1013 hPa")

# Função para padrões de poluição marinha
def padroes_poluicao_marinha():
    print("Esgotos e Águas Residuais\nMetais Industriais\nResíduos Plásticos\nÓleo e Derivados")

# Função para alertas
def alertas():
    print("Os oceanos enfrentam graves problemas devido às atividades humanas, incluindo poluição marinha por plásticos e químicos tóxicos, aquecimento global e acidificação das águas, pesca excessiva, destruição de habitats marinhos como manguezais e recifes de coral, mudanças climáticas que elevam o nível do mar e alteram correntes oceânicas, aumento do ruído submarino que afeta a vida marinha, e introdução de espécies invasoras que desestabilizam ecossistemas. Esses alertas ressaltam a necessidade urgente de medidas de conservação e políticas de gestão sustentável para proteger os oceanos e assegurar a saúde dos ecossistemas marinhos para as futuras gerações e até mesmm as geraçã atua.")

# Função para formas de ajudar
def formas_ajudar():
    print("Para ajudar a proteger os oceanos, adote práticas simples como reduzir o uso de plásticos descartáveis, reciclar corretamente, optar por produtos sustentáveis, economizar energia para combater o aquecimento global, apoiar políticas de pesca sustentável, participar de limpezas de praias, usar menos produtos químicos nocivos, conscientizar-se e educar outros sobre a importância da preservação marinha, escolher frutos do mar de fontes responsáveis, e apoiar organizações e iniciativas que trabalham na conservação dos oceanos. Pequenas ações individuais podem ter um impacto significativo na saúde dos oceanos.")

# Função para finalizar o programa
def finalizar():
    print("Finalizando o programa...")
    exit()

# Função para exibir o menu
def menu():
    while True:
        print("\nBlue")
        print("1 - Dados de sensores marinhos")
        print("2 - Padrões de poluição marinha")
        print("3 - Alertas")
        print("4 - Formas de ajudar")
        print("5 - Finalizar")
        escolha = input("Escolha uma opção: ")

        if escolha == '1':
            dados_sensores_marinhos()
        elif escolha == '2':
            padroes_poluicao_marinha()
        elif escolha == '3':
            alertas()
        elif escolha == '4':
            formas_ajudar()
        elif escolha == '5':
            finalizar()
        else:
            print("Opção inválida. Por favor, escolha uma opção válida.")

# Lista para os cadastros
cadastros = []

# Loop para capturar múltiplos cadastros
while True:
    nome_completo, email = capturar_dados()
    cadastros.append({'nome_completo': nome_completo, 'email': email})

    continuar = input("Deseja cadastrar outra pessoa? (s/n): ")
    if continuar.lower() != 's':
        break

# Exibir os cadastros
exibir_dados(cadastros)

# Exibir o menu após os cadastros
menu()
