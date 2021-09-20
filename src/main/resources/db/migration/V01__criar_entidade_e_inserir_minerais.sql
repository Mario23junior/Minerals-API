CREATE TABLE `Mineral` (

    `id` long NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `nome` varchar(20),
    `categoria` varchar(50),
    `cor` varchar(50),
    `formula_Quimica` varchar(80),
    `classificacao` varchar(50)
  );
  
INSERT INTO Mineral (nome,categoria,cor,formula_Quimica,classificacao) VALUES 
('Quartzo','Cristal de silicio','Transparente, com variedades de cores','Silicio(dioxido de silicio)','Dioxido');
