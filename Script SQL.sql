drop database if exists consultorio_db_gabriel_sousa;
create database consultorio_db_gabriel_sousa; 
use consultorio_db_gabriel_sousa;
-- Tabelas
create table dentista (
id_dentista int auto_increment,
nome varchar(45) not null, 
cpf varchar(14) not null,
cro varchar(6) not null, 
especialidade varchar(45) default 'Clínico Geral' not null,
email varchar(90) not null,
telefone varchar(11) not null,
primary key (id_dentista)
);

create table paciente (
id_paciente int auto_increment, 
nome varchar(45) not null, 
cpf varchar(14) not null,
data_nascimento date not null, 
email varchar(90) not null,
telefone varchar(11) not null,
primary key (id_paciente)
);

create table funcionario (
id_funcionario int auto_increment, 
nome varchar(45) not null, 
tipo_consulta varchar(90) not null,
cpf varchar(14) not null, 
email varchar(90) not null,
telefone varchar(11) not null,
primary key (id_funcionario)
);

create table pagamento (
id_pagamento int auto_increment,
valor float not null,
tipo_pagamento varchar(45) not null, 
parcelas int not null,
nota_fiscal int not null, 
primary key (id_pagamento)
);

create table gestor (
id_gestor int auto_increment, 
nome varchar(45) not null, 
cpf varchar(14) not null, 
email varchar(90) not null, 
telefone varchar(11) not null, 
primary key (id_gestor)
);

create table estoque (
id_estoque int auto_increment, 
tipo_produto varchar(45) not null, 
descarte_esteril varchar(8) not null, 
fk_gestor int not null,
primary key (id_estoque),
foreign key (fk_gestor) references gestor (id_gestor)
);

create table produto (
id_produto int auto_increment,
nome varchar(45) not null, 
quantidade int not null, 
fk_estoque int not null,
primary key (id_produto),
foreign key (fk_estoque) references estoque (id_estoque)
); 

create table equipamento (
id_equipamento int auto_increment, 
nome varchar(45) not null, 
quantidade int not null, 
primary key (id_equipamento)
);

create table manutencao (
id_manutencao int auto_increment,
ultima_manutencao date not null, 
periodo_entre_manutencao int not null,
fk_equipamento int not null,
fk_gestor int not null,
primary key (id_manutencao),
foreign key (fk_equipamento) references equipamento (id_equipamento),
foreign key (fk_gestor) references gestor (id_gestor)
);

create table consulta (
id_consulta int auto_increment, 
nome_paciente varchar(45) not null,
nome_dentista varchar(45) not null, 
tipo_tratamento varchar(90) not null,
prontuario varchar(90) not null, 
fk_dentista int not null,  
fk_paciente int not null, 
fk_pagamento int not null, 
primary key (id_consulta),
foreign key (fk_dentista) references dentista (id_dentista),
foreign key (fk_paciente) references paciente (id_paciente) on delete cascade,
foreign key (fk_pagamento) references pagamento (id_pagamento)
);

create table possui (
id_possui int not null auto_increment,
fk_equipamento int not null, 
fk_consulta int not null,
primary key (id_possui),
foreign key (fk_equipamento) references equipamento (id_equipamento),
foreign key (fk_consulta) references consulta (id_consulta) on delete cascade
);

create table contem (
id_contem int not null auto_increment,
fk_funcionario int not null,
fk_consulta int not null, 
primary key (id_contem),
foreign key (fk_funcionario) references funcionario (id_funcionario),
foreign key (fk_consulta) references consulta (id_consulta) on delete cascade
);

create table usuario (
id_users int not null auto_increment,
username varchar(45) not null,
password varchar(45) not null,
role varchar(45) not null,
primary key (id_users)
);

-- Dentistas
INSERT INTO usuario (username, password, role) VALUES ('aline.campos@gmail.com', 'odontopass', 'Dentista');
INSERT INTO usuario (username, password, role) VALUES ('jacira14.pasco@yahoo.com.br', 'odontopass', 'Dentista');
INSERT INTO usuario (username, password, role) VALUES ('lucas.doutor99@outlook.com', 'odontopass', 'Dentista');

-- Gestores
INSERT INTO usuario (username, password, role) VALUES ('niemailmart@hotmail.com', 'gestorpass', 'Gestor');
INSERT INTO usuario (username, password, role) VALUES ('fernansou@gmail.com', 'gestorpass', 'Gestor');
INSERT INTO usuario (username, password, role) VALUES ('guigomes@gmail.com', 'gestorpass', 'Gestor');

-- Funcionários
INSERT INTO usuario (username, password, role) VALUES ('pedro128cardo@gmail.com', 'funciopass', 'Funcionário');
INSERT INTO usuario (username, password, role) VALUES ('lara.dias1453@gmail.com', 'funciopass', 'Funcionário');
INSERT INTO usuario (username, password, role) VALUES ('igordias299@gmail.com', 'funciopass', 'Funcionário');
INSERT INTO usuario (username, password, role) VALUES ('isa.carvalho@gmail.com', 'funciopass', 'Funcionário');
INSERT INTO usuario (username, password, role) VALUES ('sofiarocha.card@gmail.com', 'funciopass', 'Funcionário');
INSERT INTO usuario (username, password, role) VALUES ('edu.dias739@gmail.com', 'funciopass', 'Funcionário');

insert into dentista values (1, 'Aline Almeida Campos', '784.986.038-31', '890317', 'Odontopediatria', 'aline.campos@gmail.com', '32547896123');
insert into dentista values (2, 'Jacira Souza Pascoal', '456.874.562-34', '733028', 'Ortodontia', 'jacira14.pasco@yahoo.com.br', '15874693205');
insert into dentista values (3, 'Lucas Ferreira Silva', '321.834.987-12', '456489', 'Periodontia', 'lucas.doutor99@outlook.com', '49021678354');

insert into paciente values (1, 'Gabriel Pereira', '716.680.504-80', '1999-09-19', 'gabi.pere787@gmail.com', '87451236987');
insert into paciente values (2, 'Isabela Costa dos Santos', '038.811.167-45', '2003-04-24', 'isacantos@hotmail.com', '72659381420');
insert into paciente values (3, 'Camila Santos Serafim', '906.846.473-62', '1975-12-03', 'camifimsera@gmail.com', '11546987032');
insert into paciente values (4, 'Mariana Oliveira Silva', '194.142.128-84', '2008-08-05', 'mari.silva@gmail.com', '50321687459');
insert into paciente values (5, 'Thiago Rocha', '621.043.179-83', '2007-08-15',  'thiago.rocha@yahoo.com.br', '12457896301');
insert into paciente values (6, 'Rafaela Mendes', '457.191.102-59', '1986-01-18', 'rafa.mendes@gmail.com', '98765432109');

insert into funcionario values (1, 'Pedro Fernandes Cardoso', 'Radiografia Dentária', '065.086.303-85', 'pedro128cardo@gmail.com', '83971079414');
insert into funcionario values (2, 'Lara Dias Oliveira', 'Esterilização de Instrumentos', '853.044.279-20', 'lara.dias1453@gmail.com', '79981810675');
insert into funcionario values (3, 'Igor Dias Gomes', 'Organização do Consultório', '127.854.769-05', 'igordias299@gmail.com', '67981266904');
insert into funcionario values (4, 'Isabella Carvalho Cavalcanti', 'Assistência durante Procedimentos', '593.367.820-10', 'isa.carvalho@gmail.com', '96982781878');
insert into funcionario values (5, 'Sofia Rocha Cardoso', 'Agendamento e Gerenciamento de Registros', '683.595.593-76', 'sofiarocha.card@gmail.com', '19982171422');
insert into funcionario values (6, 'Eduardo Dias', 'Manutenção de Equipamentos', '859.157.348-04', 'edu.dias739@gmail.com', '98967453988');

insert into gestor values (1, 'Nicole Azevedo Martins', '956.515.652-56', 'niemailmart@hotmail.com', '82987277588');
insert into gestor values (2, 'Fernanda Sousa Costa', '037.637.344-06', 'fernansou@gmail.com', '48976214963');
insert into gestor values (3, 'Guilherme Gomes Cardoso', '433.263.731-39', 'guigomes@gmail.com', '61988585237');

insert into pagamento values (1, 135, 'Débito', 1, 9867589);
insert into pagamento values (2, 560, 'Crédito', 6, 8888774);
insert into pagamento values (3, 439.50, 'Pix', 1, 8765421);
insert into pagamento values (4, 126.65, 'Crédito', 5, 2346677);
insert into pagamento values (5, 790.90, 'Débito', 1, 1357981);
insert into pagamento values (6, 374.80, 'Crédito', 3, 4321098);

insert into estoque values (1, 'Limpeza', 'Descarte', 2); 
insert into estoque values (2, 'Cirúrgico', 'Estéril', 1);  
insert into estoque values (3, 'Geral', 'Descarte', 2); 
insert into estoque values (4, 'Cirúrgico', 'Descarte', 3); 
insert into estoque values (5, 'Geral', 'Descarte', 1); 
insert into estoque values (6, 'Limpeza', 'Descarte', 1); 
insert into estoque values (7, 'Geral', 'Estéril', 3); 
insert into estoque values (8, 'Geral', 'Estéril', 3); 
insert into estoque values (9, 'Limpeza', 'Estéril', 2); 
insert into estoque values (10, 'Cirúrgico', 'Estéril', 1); 

insert into produto values (8, 'Fio Dental', 140, 1); 
insert into produto values (5, 'Brocas Dentárias', 35, 2);
insert into produto values (7, 'Sugador Odontológico', 4, 3);
insert into produto values (9, 'Seringa Anestésica', 70, 4);
insert into produto values (10, 'Amalgama', 46, 5);
insert into produto values (1, 'Luvas Descartáveis', 180, 6);
insert into produto values (3, 'Espelho bucal', 13, 7);
insert into produto values (4, 'Placa de Mordida', 9, 8);
insert into produto values (2, 'Fotopolimerizador', 3, 9);
insert into produto values (6, 'Ponteira Ultrassônica', 35, 10);

insert into equipamento values (1, 'Cadeira Odontológica', 1);
insert into equipamento values (2, 'Equipamento de Raio-X', 3);
insert into equipamento values (3, 'Câmara-Intraoral', 2);
insert into equipamento values (4, 'Laser Dentário', 1);
insert into equipamento values (5, 'Autoclave', 2);
insert into equipamento values (6, 'Compressor de Ar', 1);
insert into equipamento values (7, 'Caneta de Rotação', 6);

insert into manutencao values (2, '2023-09-03', 1, 2, 1);
insert into manutencao values (4, '2023-09-06', 2, 4, 2);
insert into manutencao values (6, '2023-09-11', 1, 6, 2);
insert into manutencao values (1, '2023-09-10', 7, 1, 3);
insert into manutencao values (5, '2023-09-11', 1, 5, 1);
insert into manutencao values (7, '2023-09-10', 2, 7, 3);
insert into manutencao values (3, '2023-09-05', 4, 3, 3);

insert into consulta values (1, 'Mariana Oliveira Silva', 'Aline Almeida Campos', 'Limpeza Profissional', 'Sangramento gengival presente, especialmente durante a sondagem periodontal', 1, 4, 5);
insert into consulta values (2, 'Thiago Rocha', 'Aline Almeida Campos', 'Tratamento de Cáries', 'Lesões cariosas identificadas nas faces oclusais dos molares', 1, 5, 2);
insert into consulta values (3, 'Gabriel Pereira', 'Jacira Souza Pascoal', 'Cirurgia Ortognática', 'Desconforto estético e funcional devido a assimetria facial e problemas oclusivos', 2, 1, 1);
insert into consulta values (4, 'Camila Santos Serafim', 'Lucas Ferreira Silva', 'Manutenção Periodontal', 'Presença de sangramento gengival, inflamação gengival e cálculo dentário', 3, 3, 4);
insert into consulta values (5, 'Rafaela Mendes', 'Jacira Souza Pascoal', 'Aparelhos Móveis', 'Desalinhamento dos dentes superiores', 2, 6, 6);
insert into consulta values (6, 'Isabela Costa dos Santos', 'Lucas Ferreira Silva', 'Alisamento Radicular', 'Sensibilidade e sangramento gengival durante a escovação', 3, 2, 3);

-- Cadeira Odontológica
insert into possui values (1, 1);
insert into possui values (1, 2);
insert into possui values (1, 3);
insert into possui values (1, 4);
insert into possui values (1, 5);
insert into possui values (1, 6);

-- Raio X
insert into possui values (2, 4);
insert into possui values (2, 6);

-- Autoclave
insert into possui values (5, 1);
insert into possui values (5, 2);
insert into possui values (5, 3);
insert into possui values (5, 4);
insert into possui values (5, 5);
insert into possui values (5, 6);

insert into contem values (1, 5, 3);
insert into contem values (2, 3, 2);
insert into contem values (3, 2, 6);
insert into contem values (4, 4, 1);
insert into contem values (5, 1, 5);
insert into contem values (6, 6, 4);
