CREATE TABLE `Propriedadesfisicas` (

    `id` long NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `peso_Especifico` varchar(80),
    `dureza` int(50),
    `ponto_De_Fusao` varchar(50),
    `cilvagem` varchar(80),
    `fratura` varchar(80),
    `Brilho` varchar(80),
    `tenacidade` varchar(80),    
    `MINERAL_ID` long(65)
    
   );
  
INSERT INTO Propriedadesfisicas (id,peso_Especifico,dureza,ponto_De_Fusao,cilvagem,fratura,Brilho,tenacidade, MINERAL_ID) VALUES 
(1,'2,65 N/m³',7,'1980 K (~1710 °C)','{0110} Indistinta','Apresenta fratura concoidal','Vítreo ,Opaco','quebradico',1);