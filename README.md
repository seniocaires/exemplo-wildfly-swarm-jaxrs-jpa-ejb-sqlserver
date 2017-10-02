# Exemplo usando Wildfly Swarm, jaxrs, jpa, ejb, sqlserver.

Não encontrei exemplos funcionais para o sqlserver e crei este.

### Adicione o plugin para Eclipse

Wildfly-Hive : https://github.com/fbricon/wildfly-hive

Help > Install New Software... > Add > Name : Wildfly-Hive; Location: https://dl.bintray.com/fbricon/poc/wildfly-hive/latest/

### Configurações do datasource
+ Duplo clique no servidor "Wildfly Swarm - exemplo-wildfly-swarm-jaxrs-jpa-ejb-sqlserver"
+ Clique em "Open launch configuration"
+ Na aba "Environment" adicione as variáveis de ambiente abaixo:

swarm.ds.name = ProjetoDS

swarm.jdbc.driver = sqlserver

swarm.ds.connection.url = Preencha com a URL de conexão com o banco de dados

swarm.ds.username = Preencha com usuário do banco de dados

swarm.ds.password = Preencha com a senha do banco de dados

# URL para teste

http://localhost:8080/veiculo/amostra

