# Mercadona: Irene Otero

Este programa ha sido creado con la finalidad de llevar a cabo las operaciones CRUD básicas sobre un listado de productos, es decir, sobre una base de datos creada que contiene todos los elementos, se pueden implantar los siguientes aspectos: crear, actualizar, visualizar y eliminar.

## - Consideraciones previas -

### Herramientas 🛠
Los elementos necesarios que se han utilizado para llevar a cabo el proyecto han sido las siguientes:

* [Eclipse](https://www.eclipse.org/) - Desarrollo API en Java.
* [MySQL Workbench](https://www.mysql.com/products/workbench/) - Desarrollo BD.
    * [MySQL](https://www.mysql.com) - Necesario para el uso de MySQL Workbench.

### Estructura 🗄
Consta de dos apartados:

* **Mercadona_IreneOtero**. _Contiene toda la API en Java del programa, es decir, todo su funcionamiento lógico. El código está subdividido en diferentes carpetas y clases para que sea más fácil su lectura y mantenimiento, donde nos encontramos las siguientes:_
    * _connection/Conexion_ - conexión a la BD "prod".
    * _controller/ControllerProducto_ - enlace del acceso de los datos con la vista.
    * _dao/PrepararStatements_ - preparación de los statements.
    * _dao/ProductoDao_ - implementación de la interfaz "IProductoDao".
    * _demo/CRUDDemo_ - prueba del programa con algunas operaciones.
    * _idao/IProductoDao_ - interfaz que registra los métodos CRUD.
    * _model/Producto_ - mapeo de los atributos de la tabla "Producto" de la BD.
    * _vista/ViewProducto_ - muestra los datos del modelo.

* **Base de datos - MySQL** _Contiene la BD creada denominada "prod" con una tabla "productos" que almacena todos los elementos que se deseen.
En dicha tabla de manera ejemplificativa se han incluido cuatro atributos:_
    * _id_: {Primary Key}: para la identificación de cada tupla.
    * _nombre_: {Valor No Nulo}: indica el nombre del producto.
    * _marca_: {Valor No Nulo}: la marca de dicho producto.
    * _descripcion_: {}: breve descripción de aspectos notables.

### Puesta a punto 📦
Para poder hacer una correcta unión entre la BD proporcionada y el código en Eclipse, es necesario que se cree una conexión en _MySQL Workbench_ con las siguientes características:  

```
localhost\3306
usuario: root
contraseña: root
```

## - Toma de decisiones - 

### Atributos tabla "Productos" ❓
Debido a que no se marcaron especificaciones al respecto, decidí crear una tabla ejemplificativa con la que poder trabajar y manejar toda la implantación de las operaciones CRUD. El aspecto más notable de esta es que para facilitar el usuario la puesta de datos, la propia BD es la encargada de auto_incrementar los id, por lo que, dicho atributo es transparente al cliente del sistema.

### Utilización PreparedStatements 🔗
Debido a que es posible que haya una alta utilización de las mismas sentencias en este programa, he considerado que lo más correcto (deseando mejorar la eficiencia) era utilizar los *PreparedStatements*. Este mecanismo permite indicar previamente el tipo de sentencia que vamos a usar, de forma que la base de datos la "precompila" y la guarda en condiciones de ser ejecutada inmediatamente, sin necesidad de analizarla en cada caso.
Ademas, como pequeño punto extra cabe destacar que tiene una mayor seguridad, ya que, aporta manejo de cadenas y valores.

## - Autora -
**Irene Otero Díaz** - estudiante UPV y candidata a prácticas.
