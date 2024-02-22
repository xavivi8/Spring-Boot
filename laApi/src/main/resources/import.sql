INSERT INTO rol (rol, observaciones) VALUES ('Administrador', 'Rol con permisos de administrador');

INSERT INTO usuarios (usuario, nombre_publico, pass_user, habilitado, token_sesion, token_passwd, token_passwd_expira, observaciones, id_rol) VALUES ('usuarioNuevo', 'Nombre Público del Usuario Nuevo', 'password', 1, 'token', 'tokenPassword', 'expiracionToken', 'Observaciones del usuario nuevo', idDelRolExistente);

INSERT INTO peli_fav (id_usuario, identificador) VALUES (idDelUsuarioExistente, idDeLaPeliculaFavorita);
