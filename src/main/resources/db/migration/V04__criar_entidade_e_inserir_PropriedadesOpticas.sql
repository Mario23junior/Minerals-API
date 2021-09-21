CREATE TABLE `Propriedades_Opticas` (

    `id` long NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `birrefringencia` varchar(80),
    `pleocroismo` varchar(50),
    `sistema` varchar(50),
    `formula` varchar(50),
    `MINERAL_ID` long(65)
    
   );
  
INSERT INTO Propriedades_Opticas (id,birrefringencia,pleocroismo,sistema,formula,MINERAL_ID) VALUES 
(1,'+0.009 (B-G interval)','Sem pleocroísmo','Trigonal', 'SiO2',1);