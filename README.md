# Monedy

## Descripción del proyecto

Monedy es una aplicación mobile basada en una billetera digital.
La pantalla desarrollada permite al usuario visualizar información básica de su cuenta, como el saldo disponible y los últimos movimientos realizados.
El objetivo es simular la pantalla principal de una aplicación bancaria.

------------------------------------------------------------------------

## Pantalla realizada: Inicio

La pantalla principal contiene:

- Nombre de la aplicación.
- Imagen representativa de una entidad financiera.
- Mensaje de Bienvenida para cada usuario
- Saldo disponible.
- Lista de movimientos.
- Botón para agregar un nuevo movimiento.

-----------------------------------------------------------------------

## Flujo de uso

Al abrir la aplicación se muestra la pantalla principal de Monedy.
El usuario puede consultar su saldo y visualizar sus movimientos.
Cuando presiona el botón "Agregar movimiento", la aplicación agrega un nuevo movimiento a la lista.

-----------------------------------------------------------------------

## Componentes utilizados

### ConstraintLayou
Se utilizó como contenedor principal de la pantalla.

### LinearLayout
Se utilizó para organizar los elementos de manera vertical y horizontal.

### TextView
Se utilizó para mostrar:
- Nombre de la aplicación.
- Saldo.
- Movimientos.

### Button
Se utilizó para permitir la interacción del usuario mediante un evento.

### ImageView
Se utilizó para agregar una imagen representativa de la aplicación.

------------------------------------------------------------------------

## Comportamiento dinámico

La aplicación utiliza un OnClickListener en el botón "Agregar movimiento".
Al realizar click se crea desde Java un nuevo TextView: new TextView(this)

Luego se agrega a la pantalla utilizando:
addView()
De esta manera se genera contenido dinámicamente sin estar definido previamente en XML.

------------------------------------------------------------------------

## Organización de recursos

Los recursos se organizaron utilizando:

- strings.xml para textos.
- colors.xml para colores.
- dimens.xml para medidas.

-----------------------------------------------------------------------

## Cómo ejecutarlo de PC

1- Clonar el repositorio.
2- Ábrirlo en Android Studio.
3- Seleccionar el botón de "Run" en un emulador o desde el celular(conectado por cable)

-----------------------------------------------------------------------

## Herramientas utilizadas

- Android Studio
- Java
- XML
- Git
- GitHub