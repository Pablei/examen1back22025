Proceso de corrección de archivo examen1back22025

Commit 1 "Clase Curso Revisada"

Curso.java:
1) Linea 8: Como con @Entity definimos la clase como tabla es necesario definir un id, corregimos la escritura. Antes "@I".
2) Linea 9: Para darle valor al ID usaremos la strategy Identity. Completamos el comando "@GeneratedValue(strategy = GenerationType.IDENTITY)". Antes "@Ge"
3) Linea 16: La variable Docente docente debia definirse como private. No tenia la definición.
4) Linea 25: En el constructo Public Curso es importante añadir la variable Docente docente. Lo hice.
5) Faltaron los getters y setters.

Commit 2 "Se corrigio Docente y Usuario, enum TipoUsuario creado"

Docente.java:
1) Linea 7: Comando @Entity mal escrito. Se corrigio
2) Linea 10: Faltaba escribir el comando @ID
3) Luego de el codigo encargado de las relaciones entre clases cree el contructor vacio y el constructor para las variables id y especialidad.
4) Genere los getter y setters para las variables de relacion entre tablas "private List<Curso> y private Usuario usuario"

Usuario.java:
1) Linea 5: Comando @Entity mal escrito. Se corrigio.
2) Linea 10: @GeneratedValue estaba incompleto. No tenia definida la Strategy. Escribi "IDENTITY".
3) Linea 11: @Column estaba mal escrita. Se corrigio.
4) Linea 22: @Enumerated solicita la creacion de una clase ENUM. Cree una con el nombre TipoUsuario para obedecer al la variable private TipoUsuario tipoUsuario ya creada.
5) Cree los getters y Setters faltantes
6) No se recomienda el uso de la "ñ" asi que la cambie por "n" en todo el codigo.

Commit 3 "Application.properties + build.gradle"
1) Cree una base de datos en el localhost por medio de php Admin en mySql llamada develop_db como se solicito.
2) En el archivo Application.properties escribi el codigo usado para conectar con la base de datos.
3) Defini el usuario "root" y sin password.
4) En el archivo build.gradle en el codigo de las dependencias debia añadirse la implementation implementation 'mysql:mysql-connector-java:8.0.33'
5) El archivo Examen1Back2Application (es el main) lo corri e hizo la conexión a la base de datos.
   
