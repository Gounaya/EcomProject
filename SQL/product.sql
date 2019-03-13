use `osmDatabase`;

DROP TABLE IF EXISTS `product`;
CREATE TABLE  `product` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `price` DOUBLE(10,2) default NULL,
  `status` bool default NULL,
  `photo` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
);

INSERT INTO osmdatabase.product VALUES (0,'Rolex M01', 100.000, 0, 'rolex.jpg');


