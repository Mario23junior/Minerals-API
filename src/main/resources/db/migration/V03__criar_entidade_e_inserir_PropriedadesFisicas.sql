CREATE TABLE `Propriedadesfisicas` (

    `id` long NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `cilvagem` varchar(80),
    `dureza` int(50),
    `fratura` varchar(50),
    `peso_Especifico` varchar(50),
    `ponto_De_Fusao` varchar(50),
    `tenacidade` varchar(50),    
    `brilho` varchar(80)
   );
  
INSERT INTO Propriedadesfisicas (id, cilvagem ,dureza,fratura,peso_Especifico,ponto_De_Fusao,tenacidade,brilho) VALUES 
(1,'{0110} Indistinta',7,'Apresenta fratura concoidal', '2,65 N/m³','1980 K (~1710 °C)','quebradico','Vítreo ,Opaco');
