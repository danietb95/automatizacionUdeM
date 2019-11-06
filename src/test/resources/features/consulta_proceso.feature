#language: es

Característica: Proceso Judicial
  Daniel como ciudadano
  Quiere consultar sus procesos judiciales
  Para ver los avances de su proceso judicial

  Escenario: Realizar consulta del estado del proceso mediante número de radicación
    Dado que el actor esta consultando el proceso judicial
    Cuando selecciona Ciudad MEDELLIN, entidad TRIBUNAL ADMINISTRATIVO DE ANTIOQUIA (ESCRITURAL) y numero de radicado 0000000000
    Entonces debe poder activar la consulta

  Escenario: Realizar consulta del estado del proceso mediante nombre del juez y clase de proceso
    Dado que el actor esta consultando el proceso judicial
    Cuando se busca por el juez Juanito Perez y clase de proceso 01100
    Entonces debe poder activar la consulta
