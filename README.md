
### Descripción de clases

| Clase | Descripción |
|-------|--------------|
| **Main** | Contiene el menú principal de interacción con el usuario mediante consola. Gestiona las operaciones de añadir, mostrar y calcular. |
| **Coleccion** | Clase estática encargada de almacenar todos los elementos de la colección (monedas y sellos) dentro de un `ArrayList`. Proporciona métodos para añadir, listar y calcular valores. |
| **ElementoColeccionable** | Clase abstracta que define los atributos comunes de todos los elementos coleccionables, como país, valor, precio o rareza. |
| **Moneda** | Subclase que extiende `ElementoColeccionable`. Añade propiedades específicas como composición, peso, diámetro, grosor y estado de conservación. |
| **Sello** | Subclase que extiende `ElementoColeccionable`. Añade atributos propios como dimensiones, imagen y estado de conservación. |
| **EnumEstadoConservacionMoneda** | Enumeración con los estados de conservación posibles de una moneda: `G, VG, F, VF, XF, AU, UNC`. |
| **EnumEstadoConservacionSello** | Enumeración con los estados de conservación posibles de un sello: `U, NSG, NF, N`. |

---

## ⚙️ Funcionalidades principales

- **Añadir monedas y sellos** con validaciones de datos (año, rareza, estado de conservación, etc.)
- **Mostrar todos los elementos** de un tipo (monedas o sellos)
- **Calcular el precio total** de todos los objetos en la colección
- **Calcular la rareza media** de los elementos
- **Gestión automática** mediante una lista compartida (`ArrayList`) en la clase `Coleccion`

---

## 🧮 Menú principal

Cuando se ejecuta el programa, se presenta un menú interactivo con las siguientes opciones:

