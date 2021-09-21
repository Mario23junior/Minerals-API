CREATE TABLE `Cristalografia` (

    `id` long NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `sistema_Cristalino` varchar(80),
    `particao` varchar(50),
    `diafaneidade` varchar(50),
    `habito_Cristalino` varchar(80),
    `MINERAL_ID` long(65)
    
   );
  
INSERT INTO Cristalografia (id,sistema_Cristalino,particao,diafaneidade,habito_Cristalino, MINERAL_ID) VALUES 
(1,'Trigonal','romboédrica','Opaco, Transparente','hexagonal',1);
