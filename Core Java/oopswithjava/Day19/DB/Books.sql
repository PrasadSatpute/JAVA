CREATE TABLE `books` (
  `book_id` int(11) NOT NULL,
  `subject_name` varchar(256) NOT NULL,
  `book_name` varchar(256) DEFAULT NULL,
  `author_name` varchar(256) DEFAULT NULL,
  `price` float DEFAULT NULL,
  PRIMARY KEY (`book_id`)
);

INSERT INTO `books` VALUES (1001,'C','Programming with C(Schaums Outlines Series)','Byron S Gottfried',575),(1002,'C','The C Programming Language','Brian W. Kernighan / Dennis Ritchie',419),(1003,'C','EXPERT C PROGRAMMING','VAN DER LINDEN',649),(1004,'C','The C Companion','Allen I. Holub',2775),(1005,'C','Head First C','Griffiths David',800),(1006,'C++','The C++ Programming Language','Bjarne Stroustrup',629),(1007,'C++','C++ Primer Plus','Stephen Prata',1211),(1008,'C++','More Effective C++','Scott Meyers',619),(1009,'C++','C++: Effective Object-Oriented Software Construction','Kayshav Dattatri',838),(1010,'C++','C++: The Complete Reference','Herbert Schildt',499),(1011,'Java SE','Head First Java','Kathy Sierra',850),(1012,'Java SE','Java: The Complete Reference','Herbert Schildt',850),(1013,'Java SE','The Java Programming Language','James Gosling',2736),(1014,'Java SE','Effective Java','Joshua Bloch',377),(1015,'Java SE','Big Java Early Objects','Cay Horstman',600),(1016,'AWP','HTML5 – Up and Running','Mark Pilgrim',1658),(1017,'AWP','Head First HTML and CSS','Elisabeth Robson',1175),(1018,'AWP','JavaScript: The Definitive Guide','Flanagan David',1200),(1019,'AWP','Inside XML','Steven Holzner',1193),(1020,'AWP','PHP and MySQL Web Development','Luke Welling/Laura Thomson',735),(1021,'OS','Design of the UNIX Operating System','Maurice J. Bach',255),(1022,'OS','Operating Systems: Internals and Design Principles','William Stallings',570),(1023,'OS','Operating System: Concepts and Techniques','M Naghibzadeh',1595),(1024,'OS','Modern Operating Systems','Andrew S. Tanenbaum',6383),(1025,'OS','Operating System Concept','Galvin',575);
