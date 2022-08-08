# Projeto hotel senior
    Projeto desenvolvido para processo seletivo para vaga de desenvolvedor.
    
# Descrição
    API para realização de CRUDL de hospedes e controle de CheckIns, cálculo sobre o valor a ser pago seguindo como padrão a regra de negócio.
    
# Regra de Negócio
    ● Uma diária no hotel de segunda à sexta custa R$120,00;
    ● Uma diária no hotel em finais de semana custa R$150,00;
    ● Caso a pessoa precise de uma vaga na garagem do hotel há um acréscimo diário, sendo R$15,00 de segunda à sexta e R$20,00 nos finais de semana;
    ● Caso o horário da saída seja após às 16:30h deve ser cobrada uma diária extra;
    
# Teste unitário
    Para este projeto foi criado alguns testes que cobrem 14% das linhas de todo o projeto, na classe ChechInFuncoes a cobertura chegou a 32%, mas especificamente nas funções que não possuiem conexão com o banco de dados.

# Requisições postman
    O projeto possui também dois arquivos JSON para a realização das requisições do postman, podendo ser encontradas na pasta "JSON Projeto".

    → CheckIn.postman_collection.json
    → Hospedes.postman_collection.json
 
# Ajustes para conexão do Banco de dados
    O projeto necessita o banco de dados PostgreSQL conforme configuração a baixo:

    DataBase POSTEGRESQL
    Plataform postegres  
    porta 5432  
    username postgres  
    senha 123456

# Técnologias Usadas
    ● IntelliJ
    ● Postman
    ● Spring boot
    ● Java
    ● PostgreSQL
    ● Hibernate
    ● JPA
    
