drop database UsuariosSB;
create database UsuariosSB;
use UsuariosSB;

create table DatosUsuarios(
	idUsuario Int(8) AUTO_INCREMENT PRIMARY KEY,
	nombreUsuario varchar(40),
	emailUsuario varchar(30),
	generoUsuario Int(3),
	statusUsuario Int(3),
	fotoPerfil MEDIUMBLOB
);

create table status(
	idStatus int(8) PRIMARY KEY,
	descStatus varchar(20)
);

Insert into status values(200, 'Activo');
Insert into status values(500, 'Inactivo');

create table generos(
	idGenero Int(8) AUTO_INCREMENT PRIMARY KEY,
	descGenero varchar(20)
);

Insert into generos values(1, 'Mujer');
Insert into generos values(2, 'Hombre');

Insert into DatosUsuarios values(1,'Jesus Hernandez','jhernandez@gmail.com',2,200,null);
Insert into DatosUsuarios values(2,'Maria Hernandez','mhernandez@gmail.com',1,200,null);

create VIEW View_DatosUsuariosG AS select d.idUsuario, d.nombreUsuario, d.emailUsuario, d.statusUsuario, g.descGenero, d.fotoPerfil
from generos as g Inner join DatosUsuarios as d on g.idGenero=d.generoUsuario;

create VIEW View_DatosUsuariosGS AS select d.idUsuario, d.nombreUsuario, d.emailUsuario, s.descStatus, d.descGenero, d.fotoPerfil
from status as s Inner join View_DatosUsuariosG as d on s.idStatus=d.statusUsuario;