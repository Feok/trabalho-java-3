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