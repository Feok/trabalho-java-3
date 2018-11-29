DROP TABLE tbCurso;
DROP TABLE tbTurma;
DROP TABLE tbInstrutor;
DROP TABLE tbAluno;

CREATE TABLE tbCurso (
sigla_curso VARCHAR2(2) NOT NULL
    CONSTRAINT pk_sigla PRIMARY KEY,
nome_curso VARCHAR2(30),
cargaHoraria_curso NUMBER(3),
valor_curso NUMBER(6,2),
dataVigencia_curso VARCHAR2(10),
valorHoraInstrutor_curso NUMBER(5,2), 
programa_curso VARCHAR2(50)
);

CREATE TABLE tbInstrutor (
cpf_instrutor VARCHAR2(11) NOT NULL
	CONSTRAINT pk_cpfInstrutor PRIMARY KEY,
nome_instrutor VARCHAR2(30),
dataNasc_instrutor VARCHAR2(8),
sexo_instrutor VARCHAR2(9),
estadoCivil_instrutor VARCHAR2(10),
endereco_instrutor VARCHAR2(30),
numeroEnd_instrutor NUMBER(5,0),
bairro_instrutor VARCHAR2(15),
cep_instrutor VARCHAR2(8),
cidade_instrutor VARCHAR2(15),
estado_instrutor VARCHAR2(2),
telefone_instrutor VARCHAR2(10),
rg_instrutor VARCHAR2(9),
celular_instrutor VARCHAR2(10),
formacao_instrutor VARCHAR2(20),
areaAtuacao_instrutor VARCHAR2(20),
email_instrutor VARCHAR2(25)
);

CREATE TABLE tbTurma (
sigla_turma VARCHAR2(2) NOT NULL
	CONSTRAINT pk_turma PRIMARY KEY,
siglaCurso_turma VARCHAR2(2),
descricao_turma VARCHAR2(30),
dataInicio_turma VARCHAR2(10), 
dataTermino_turma VARCHAR2(10), 
periodo_turma VARCHAR2(20), 
qtdVagas_turma NUMBER(2), 
observacoes_turma VARCHAR2(30) 
);