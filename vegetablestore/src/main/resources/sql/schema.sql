

CREATE TABLE `user` (
  `idx` int(11) NOT NULL AUTO_INCREMENT,
  `id` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `phone` int(11) NOT NULL,
  PRIMARY KEY (`idx`),
  UNIQUE KEY `user_un` (`id`)
);

CREATE TABLE `vegetable` (
  `idx` int(11) NOT NULL AUTO_INCREMENT,
  `vegename` varchar(100) NOT NULL,
  `price` int(11) NOT NULL,
  `origin` varchar(100) NOT NULL,
  `picture` blob NOT NULL,
  `amount` int(11) NOT NULL,
  PRIMARY KEY (`idx`),
  UNIQUE KEY `vegetable_un` (`vegename`)
);